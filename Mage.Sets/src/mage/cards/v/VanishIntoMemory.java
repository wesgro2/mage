/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.v;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.common.delayed.AtTheBeginOfYourNextUpkeepDelayedTriggeredAbility;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.ExileZone;
import mage.game.Game;
import mage.game.events.EntersTheBattlefieldEvent;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetCreaturePermanent;
import mage.target.targetpointer.FixedTargets;

/**
 * @author escplan9 (Derek Monturo - dmontur1 at gmail dot com)
 */
public class VanishIntoMemory extends CardImpl {

    public VanishIntoMemory(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{2}{W}{U}");

        // Exile target creature. You draw cards equal to that creature's power.
        // At the beginning of your next upkeep, return that card to the battlefield under its owner's control. If you do, discard cards equal to that creature's toughness.
        this.getSpellAbility().addEffect(new VanishIntoMemoryEffect());
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
    }

    public VanishIntoMemory(final VanishIntoMemory card) {
        super(card);
    }

    @Override
    public VanishIntoMemory copy() {
        return new VanishIntoMemory(this);
    }
}

class VanishIntoMemoryEffect extends OneShotEffect {

    public VanishIntoMemoryEffect() {
        super(Outcome.Detriment);
        staticText = "Exile target creature. You draw cards equal to that creature's power. At the beginning of your next upkeep, return that card to the battlefield under its owner's control. If you do, discard cards equal to that creature's toughness";
    }

    public VanishIntoMemoryEffect(final VanishIntoMemoryEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Permanent permanent = game.getPermanent(source.getFirstTarget());
        Player controller = game.getPlayer(source.getControllerId());
        MageObject sourceObject = game.getObject(source.getSourceId());
        if (controller != null && permanent != null && sourceObject != null) {
            if (controller.moveCardsToExile(permanent, source, game, true, source.getSourceId(), sourceObject.getIdName())) {
                controller.drawCards(permanent.getPower().getValue(), game);
                ExileZone exile = game.getExile().getExileZone(source.getSourceId());
                // only if permanent is in exile (tokens would be stop to exist)
                if (exile != null && !exile.isEmpty()) {
                    //create delayed triggered ability
                    Effect effect = new VanishIntoMemoryReturnFromExileEffect();
                    effect.setTargetPointer(new FixedTargets(exile, game));
                    game.addDelayedTriggeredAbility(new AtTheBeginOfYourNextUpkeepDelayedTriggeredAbility(effect), source);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public VanishIntoMemoryEffect copy() {
        return new VanishIntoMemoryEffect(this);
    }
}

class VanishIntoMemoryReturnFromExileEffect extends OneShotEffect {

    public VanishIntoMemoryReturnFromExileEffect() {
        super(Outcome.PutCardInPlay);
        staticText = "return that card to the battlefield under its owner's control";
    }

    public VanishIntoMemoryReturnFromExileEffect(final VanishIntoMemoryReturnFromExileEffect effect) {
        super(effect);
    }

    @Override
    public VanishIntoMemoryReturnFromExileEffect copy() {
        return new VanishIntoMemoryReturnFromExileEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Cards cards = new CardsImpl(getTargetPointer().getTargets(game, source));
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            Set<Card> cardsToBattlefield = new HashSet<>();
            cardsToBattlefield.addAll(cards.getCards(game));
            ContinuousEffect effect = new VanishIntoMemoryEntersBattlefieldEffect();
            effect.setTargetPointer(new FixedTargets(cards, game));
            game.addEffect(effect, source);
            controller.moveCards(cardsToBattlefield, Zone.BATTLEFIELD, source, game, false, false, true, null);
        }

        return true;
    }
}

class VanishIntoMemoryEntersBattlefieldEffect extends ReplacementEffectImpl {

    public VanishIntoMemoryEntersBattlefieldEffect() {
        super(Duration.EndOfTurn, Outcome.Discard);
        staticText = "discard cards equal to that creature's toughness.";
    }

    public VanishIntoMemoryEntersBattlefieldEffect(VanishIntoMemoryEntersBattlefieldEffect effect) {
        super(effect);
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == EventType.ENTERS_THE_BATTLEFIELD;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        return getTargetPointer().getTargets(game, source).contains(event.getTargetId());
    }

    @Override
    public boolean replaceEvent(GameEvent event, Ability source, Game game) {
        Permanent permanent = ((EntersTheBattlefieldEvent) event).getTarget();
        if (permanent != null) {
            Player you = game.getPlayer(source.getControllerId());
            if (you != null) {
                you.discard(permanent.getToughness().getValue(), false, source, game);
            }
        }
        return false;
    }

    @Override
    public VanishIntoMemoryEntersBattlefieldEffect copy() {
        return new VanishIntoMemoryEntersBattlefieldEffect(this);
    }
}
