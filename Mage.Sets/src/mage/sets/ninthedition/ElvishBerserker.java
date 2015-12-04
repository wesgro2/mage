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
package mage.sets.ninthedition;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BecomesBlockedTriggeredAbility;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Rarity;
import mage.game.Game;
import mage.game.combat.CombatGroup;

/**
 *
 * @author ilcartographer
 */
public class ElvishBerserker extends CardImpl {

    public ElvishBerserker(UUID ownerId) {
        super(ownerId, 237, "Elvish Berserker", Rarity.COMMON, new CardType[]{CardType.CREATURE}, "{G}");
        this.expansionSetCode = "9ED";
        this.subtype.add("Elf");
        this.subtype.add("Berserker");
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // Whenever Elvish Berserker becomes blocked, it gets +1/+1 until end of turn for each creature blocking it.
        this.addAbility(new ElvishBerserkerAbility());
    }

    public ElvishBerserker(final ElvishBerserker card) {
        super(card);
    }

    @Override
    public ElvishBerserker copy() {
        return new ElvishBerserker(this);
    }
}

class ElvishBerserkerAbility extends BecomesBlockedTriggeredAbility {

    public ElvishBerserkerAbility() {
        super(null, false);
        ElvishBerserkerValue value = new ElvishBerserkerValue();
        this.addEffect(new BoostSourceEffect(value, value, Duration.EndOfTurn));
    }

    public ElvishBerserkerAbility(final ElvishBerserkerAbility ability) {
        super(ability);
    }

    @Override
    public ElvishBerserkerAbility copy() {
        return new ElvishBerserkerAbility(this);
    }

    @Override
    public String getRule() {
        return "Whenever {this} becomes blocked, it gets +1/+1 until end of turn for each creature blocking it.";
    }
}

class ElvishBerserkerValue implements DynamicValue {

    @Override
    public ElvishBerserkerValue copy() {
        return new ElvishBerserkerValue();
    }

    @Override
    public int calculate(Game game, Ability sourceAbility, Effect effect) {
        for(CombatGroup combatGroup : game.getCombat().getGroups()) {
            if(combatGroup.getAttackers().contains(sourceAbility.getSourceId())) {
                 int blockers = combatGroup.getBlockers().size();
                 return blockers > 1 ? (blockers) : 0;
            }
        }
        return 0;
    }

    @Override
    public String getMessage() {
        return "+1/+1 until end of turn for each creature blocking it";
    }
}
