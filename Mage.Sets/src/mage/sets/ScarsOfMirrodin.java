/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
*/

package mage.sets;

import mage.cards.CardGraphicInfo;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author nantuko84
 */
public class ScarsOfMirrodin extends ExpansionSet {

    private static final ScarsOfMirrodin instance = new ScarsOfMirrodin();

    public static ScarsOfMirrodin getInstance() {
        return instance;
    }

    private ScarsOfMirrodin() {
        super("Scars of Mirrodin", "SOM", ExpansionSet.buildDate(2010, 10, 1), SetType.EXPANSION);
        this.blockName = "Scars of Mirrodin";
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Abuna Acolyte", 1, Rarity.UNCOMMON, mage.cards.a.AbunaAcolyte.class));
        cards.add(new SetCardInfo("Accorder's Shield", 136, Rarity.COMMON, mage.cards.a.AccordersShield.class));
        cards.add(new SetCardInfo("Acid Web Spider", 108, Rarity.UNCOMMON, mage.cards.a.AcidWebSpider.class));
        cards.add(new SetCardInfo("Alpha Tyrranax", 109, Rarity.COMMON, mage.cards.a.AlphaTyrranax.class));
        cards.add(new SetCardInfo("Arc Trail", 81, Rarity.UNCOMMON, mage.cards.a.ArcTrail.class));
        cards.add(new SetCardInfo("Argent Sphinx", 28, Rarity.RARE, mage.cards.a.ArgentSphinx.class));
        cards.add(new SetCardInfo("Argentum Armor", 137, Rarity.RARE, mage.cards.a.ArgentumArmor.class));
        cards.add(new SetCardInfo("Arrest", 2, Rarity.COMMON, mage.cards.a.Arrest.class));
        cards.add(new SetCardInfo("Asceticism", 110, Rarity.RARE, mage.cards.a.Asceticism.class));
        cards.add(new SetCardInfo("Assault Strobe", 82, Rarity.COMMON, mage.cards.a.AssaultStrobe.class));
        cards.add(new SetCardInfo("Auriok Edgewright", 3, Rarity.UNCOMMON, mage.cards.a.AuriokEdgewright.class));
        cards.add(new SetCardInfo("Auriok Replica", 138, Rarity.COMMON, mage.cards.a.AuriokReplica.class));
        cards.add(new SetCardInfo("Auriok Sunchaser", 4, Rarity.COMMON, mage.cards.a.AuriokSunchaser.class));
        cards.add(new SetCardInfo("Barbed Battlegear", 139, Rarity.UNCOMMON, mage.cards.b.BarbedBattlegear.class));
        cards.add(new SetCardInfo("Barrage Ogre", 83, Rarity.UNCOMMON, mage.cards.b.BarrageOgre.class));
        cards.add(new SetCardInfo("Bellowing Tanglewurm", 111, Rarity.UNCOMMON, mage.cards.b.BellowingTanglewurm.class));
        cards.add(new SetCardInfo("Blackcleave Cliffs", 224, Rarity.RARE, mage.cards.b.BlackcleaveCliffs.class));
        cards.add(new SetCardInfo("Blackcleave Goblin", 54, Rarity.COMMON, mage.cards.b.BlackcleaveGoblin.class));
        cards.add(new SetCardInfo("Bladed Pinions", 140, Rarity.COMMON, mage.cards.b.BladedPinions.class));
        cards.add(new SetCardInfo("Blade-Tribe Berserkers", 84, Rarity.COMMON, mage.cards.b.BladeTribeBerserkers.class));
        cards.add(new SetCardInfo("Bleak Coven Vampires", 55, Rarity.COMMON, mage.cards.b.BleakCovenVampires.class));
        cards.add(new SetCardInfo("Blight Mamba", 112, Rarity.COMMON, mage.cards.b.BlightMamba.class));
        cards.add(new SetCardInfo("Blistergrub", 56, Rarity.COMMON, mage.cards.b.Blistergrub.class));
        cards.add(new SetCardInfo("Bloodshot Trainee", 85, Rarity.UNCOMMON, mage.cards.b.BloodshotTrainee.class));
        cards.add(new SetCardInfo("Blunt the Assault", 113, Rarity.COMMON, mage.cards.b.BluntTheAssault.class));
        cards.add(new SetCardInfo("Bonds of Quicksilver", 29, Rarity.COMMON, mage.cards.b.BondsOfQuicksilver.class));
        cards.add(new SetCardInfo("Carapace Forger", 114, Rarity.COMMON, mage.cards.c.CarapaceForger.class));
        cards.add(new SetCardInfo("Carnifex Demon", 57, Rarity.RARE, mage.cards.c.CarnifexDemon.class));
        cards.add(new SetCardInfo("Carrion Call", 115, Rarity.UNCOMMON, mage.cards.c.CarrionCall.class));
        cards.add(new SetCardInfo("Cerebral Eruption", 86, Rarity.RARE, mage.cards.c.CerebralEruption.class));
        cards.add(new SetCardInfo("Chimeric Mass", 141, Rarity.RARE, mage.cards.c.ChimericMass.class));
        cards.add(new SetCardInfo("Chrome Steed", 142, Rarity.COMMON, mage.cards.c.ChromeSteed.class));
        cards.add(new SetCardInfo("Clone Shell", 143, Rarity.UNCOMMON, mage.cards.c.CloneShell.class));
        cards.add(new SetCardInfo("Contagion Clasp", 144, Rarity.UNCOMMON, mage.cards.c.ContagionClasp.class));
        cards.add(new SetCardInfo("Contagion Engine", 145, Rarity.RARE, mage.cards.c.ContagionEngine.class));
        cards.add(new SetCardInfo("Contagious Nim", 58, Rarity.COMMON, mage.cards.c.ContagiousNim.class));
        cards.add(new SetCardInfo("Copperhorn Scout", 116, Rarity.COMMON, mage.cards.c.CopperhornScout.class));
        cards.add(new SetCardInfo("Copperline Gorge", 225, Rarity.RARE, mage.cards.c.CopperlineGorge.class));
        cards.add(new SetCardInfo("Copper Myr", 146, Rarity.COMMON, mage.cards.c.CopperMyr.class));
        cards.add(new SetCardInfo("Corpse Cur", 147, Rarity.COMMON, mage.cards.c.CorpseCur.class));
        cards.add(new SetCardInfo("Corrupted Harvester", 59, Rarity.UNCOMMON, mage.cards.c.CorruptedHarvester.class));
        cards.add(new SetCardInfo("Culling Dais", 148, Rarity.UNCOMMON, mage.cards.c.CullingDais.class));
        cards.add(new SetCardInfo("Cystbearer", 117, Rarity.COMMON, mage.cards.c.Cystbearer.class));
        cards.add(new SetCardInfo("Darkslick Drake", 30, Rarity.UNCOMMON, mage.cards.d.DarkslickDrake.class));
        cards.add(new SetCardInfo("Darkslick Shores", 226, Rarity.RARE, mage.cards.d.DarkslickShores.class));
        cards.add(new SetCardInfo("Darksteel Axe", 149, Rarity.UNCOMMON, mage.cards.d.DarksteelAxe.class));
        cards.add(new SetCardInfo("Darksteel Juggernaut", 150, Rarity.RARE, mage.cards.d.DarksteelJuggernaut.class));
        cards.add(new SetCardInfo("Darksteel Myr", 151, Rarity.UNCOMMON, mage.cards.d.DarksteelMyr.class));
        cards.add(new SetCardInfo("Darksteel Sentinel", 152, Rarity.UNCOMMON, mage.cards.d.DarksteelSentinel.class));
        cards.add(new SetCardInfo("Dispense Justice", 5, Rarity.UNCOMMON, mage.cards.d.DispenseJustice.class));
        cards.add(new SetCardInfo("Disperse", 31, Rarity.COMMON, mage.cards.d.Disperse.class));
        cards.add(new SetCardInfo("Dissipation Field", 32, Rarity.RARE, mage.cards.d.DissipationField.class));
        cards.add(new SetCardInfo("Dross Hopper", 60, Rarity.COMMON, mage.cards.d.DrossHopper.class));
        cards.add(new SetCardInfo("Echo Circlet", 153, Rarity.COMMON, mage.cards.e.EchoCirclet.class));
        cards.add(new SetCardInfo("Elspeth Tirel", 6, Rarity.MYTHIC, mage.cards.e.ElspethTirel.class));
        cards.add(new SetCardInfo("Embersmith", 87, Rarity.UNCOMMON, mage.cards.e.Embersmith.class));
        cards.add(new SetCardInfo("Engulfing Slagwurm", 118, Rarity.RARE, mage.cards.e.EngulfingSlagwurm.class));
        cards.add(new SetCardInfo("Etched Champion", 154, Rarity.RARE, mage.cards.e.EtchedChampion.class));
        cards.add(new SetCardInfo("Exsanguinate", 61, Rarity.UNCOMMON, mage.cards.e.Exsanguinate.class));
        cards.add(new SetCardInfo("Ezuri, Renegade Leader", 119, Rarity.RARE, mage.cards.e.EzuriRenegadeLeader.class));
        cards.add(new SetCardInfo("Ezuri's Archers", 120, Rarity.COMMON, mage.cards.e.EzurisArchers.class));
        cards.add(new SetCardInfo("Ezuri's Brigade", 121, Rarity.RARE, mage.cards.e.EzurisBrigade.class));
        cards.add(new SetCardInfo("Ferrovore", 88, Rarity.COMMON, mage.cards.f.Ferrovore.class));
        cards.add(new SetCardInfo("Flameborn Hellion", 89, Rarity.COMMON, mage.cards.f.FlamebornHellion.class));
        cards.add(new SetCardInfo("Flesh Allergy", 62, Rarity.UNCOMMON, mage.cards.f.FleshAllergy.class));
        cards.add(new SetCardInfo("Flight Spellbomb", 155, Rarity.COMMON, mage.cards.f.FlightSpellbomb.class));
        cards.add(new SetCardInfo("Forest", 246, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 247, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 248, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 249, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Fulgent Distraction", 7, Rarity.COMMON, mage.cards.f.FulgentDistraction.class));
        cards.add(new SetCardInfo("Fume Spitter", 63, Rarity.COMMON, mage.cards.f.FumeSpitter.class));
        cards.add(new SetCardInfo("Furnace Celebration", 90, Rarity.UNCOMMON, mage.cards.f.FurnaceCelebration.class));
        cards.add(new SetCardInfo("Galvanic Blast", 91, Rarity.COMMON, mage.cards.g.GalvanicBlast.class));
        cards.add(new SetCardInfo("Genesis Wave", 122, Rarity.RARE, mage.cards.g.GenesisWave.class));
        cards.add(new SetCardInfo("Geth, Lord of the Vault", 64, Rarity.MYTHIC, mage.cards.g.GethLordOfTheVault.class));
        cards.add(new SetCardInfo("Ghalma's Warden", 8, Rarity.COMMON, mage.cards.g.GhalmasWarden.class));
        cards.add(new SetCardInfo("Glimmerpoint Stag", 9, Rarity.UNCOMMON, mage.cards.g.GlimmerpointStag.class));
        cards.add(new SetCardInfo("Glimmerpost", 227, Rarity.COMMON, mage.cards.g.Glimmerpost.class));
        cards.add(new SetCardInfo("Glint Hawk", 10, Rarity.COMMON, mage.cards.g.GlintHawk.class));
        cards.add(new SetCardInfo("Glint Hawk Idol", 156, Rarity.COMMON, mage.cards.g.GlintHawkIdol.class));
        cards.add(new SetCardInfo("Goblin Gaveleer", 92, Rarity.COMMON, mage.cards.g.GoblinGaveleer.class));
        cards.add(new SetCardInfo("Golden Urn", 158, Rarity.COMMON, mage.cards.g.GoldenUrn.class));
        cards.add(new SetCardInfo("Gold Myr", 157, Rarity.COMMON, mage.cards.g.GoldMyr.class));
        cards.add(new SetCardInfo("Golem Artisan", 159, Rarity.UNCOMMON, mage.cards.g.GolemArtisan.class));
        cards.add(new SetCardInfo("Golem Foundry", 160, Rarity.COMMON, mage.cards.g.GolemFoundry.class));
        cards.add(new SetCardInfo("Golem's Heart", 161, Rarity.UNCOMMON, mage.cards.g.GolemsHeart.class));
        cards.add(new SetCardInfo("Grafted Exoskeleton", 162, Rarity.UNCOMMON, mage.cards.g.GraftedExoskeleton.class));
        cards.add(new SetCardInfo("Grand Architect", 33, Rarity.RARE, mage.cards.g.GrandArchitect.class));
        cards.add(new SetCardInfo("Grasp of Darkness", 65, Rarity.COMMON, mage.cards.g.GraspOfDarkness.class));
        cards.add(new SetCardInfo("Grindclock", 163, Rarity.RARE, mage.cards.g.Grindclock.class));
        cards.add(new SetCardInfo("Halt Order", 34, Rarity.UNCOMMON, mage.cards.h.HaltOrder.class));
        cards.add(new SetCardInfo("Hand of the Praetors", 66, Rarity.RARE, mage.cards.h.HandOfThePraetors.class));
        cards.add(new SetCardInfo("Heavy Arbalest", 164, Rarity.UNCOMMON, mage.cards.h.HeavyArbalest.class));
        cards.add(new SetCardInfo("Hoard-Smelter Dragon", 93, Rarity.RARE, mage.cards.h.HoardSmelterDragon.class));
        cards.add(new SetCardInfo("Horizon Spellbomb", 165, Rarity.COMMON, mage.cards.h.HorizonSpellbomb.class));
        cards.add(new SetCardInfo("Ichorclaw Myr", 166, Rarity.COMMON, mage.cards.i.IchorclawMyr.class));
        cards.add(new SetCardInfo("Ichor Rats", 67, Rarity.UNCOMMON, mage.cards.i.IchorRats.class));
        cards.add(new SetCardInfo("Indomitable Archangel", 11, Rarity.MYTHIC, mage.cards.i.IndomitableArchangel.class));
        cards.add(new SetCardInfo("Inexorable Tide", 35, Rarity.RARE, mage.cards.i.InexorableTide.class));
        cards.add(new SetCardInfo("Infiltration Lens", 167, Rarity.UNCOMMON, mage.cards.i.InfiltrationLens.class));
        cards.add(new SetCardInfo("Instill Infection", 68, Rarity.COMMON, mage.cards.i.InstillInfection.class));
        cards.add(new SetCardInfo("Iron Myr", 168, Rarity.COMMON, mage.cards.i.IronMyr.class));
        cards.add(new SetCardInfo("Island", 234, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 235, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 236, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 237, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Kemba, Kha Regent", 12, Rarity.RARE, mage.cards.k.KembaKhaRegent.class));
        cards.add(new SetCardInfo("Kemba's Skyguard", 13, Rarity.COMMON, mage.cards.k.KembasSkyguard.class));
        cards.add(new SetCardInfo("Koth of the Hammer", 94, Rarity.MYTHIC, mage.cards.k.KothOfTheHammer.class));
        cards.add(new SetCardInfo("Kuldotha Forgemaster", 169, Rarity.RARE, mage.cards.k.KuldothaForgemaster.class));
        cards.add(new SetCardInfo("Kuldotha Phoenix", 95, Rarity.RARE, mage.cards.k.KuldothaPhoenix.class));
        cards.add(new SetCardInfo("Kuldotha Rebirth", 96, Rarity.COMMON, mage.cards.k.KuldothaRebirth.class));
        cards.add(new SetCardInfo("Leaden Myr", 170, Rarity.COMMON, mage.cards.l.LeadenMyr.class));
        cards.add(new SetCardInfo("Leonin Arbiter", 14, Rarity.RARE, mage.cards.l.LeoninArbiter.class));
        cards.add(new SetCardInfo("Liege of the Tangle", 123, Rarity.MYTHIC, mage.cards.l.LiegeOfTheTangle.class));
        cards.add(new SetCardInfo("Lifesmith", 124, Rarity.UNCOMMON, mage.cards.l.Lifesmith.class));
        cards.add(new SetCardInfo("Liquimetal Coating", 171, Rarity.UNCOMMON, mage.cards.l.LiquimetalCoating.class));
        cards.add(new SetCardInfo("Livewire Lash", 172, Rarity.RARE, mage.cards.l.LivewireLash.class));
        cards.add(new SetCardInfo("Loxodon Wayfarer", 15, Rarity.COMMON, mage.cards.l.LoxodonWayfarer.class));
        cards.add(new SetCardInfo("Lumengrid Drake", 36, Rarity.COMMON, mage.cards.l.LumengridDrake.class));
        cards.add(new SetCardInfo("Lux Cannon", 173, Rarity.MYTHIC, mage.cards.l.LuxCannon.class));
        cards.add(new SetCardInfo("Melt Terrain", 97, Rarity.COMMON, mage.cards.m.MeltTerrain.class));
        cards.add(new SetCardInfo("Memnite", 174, Rarity.UNCOMMON, mage.cards.m.Memnite.class));
        cards.add(new SetCardInfo("Memoricide", 69, Rarity.RARE, mage.cards.m.Memoricide.class));
        cards.add(new SetCardInfo("Mimic Vat", 175, Rarity.RARE, mage.cards.m.MimicVat.class));
        cards.add(new SetCardInfo("Mindslaver", 176, Rarity.MYTHIC, mage.cards.m.Mindslaver.class));
        cards.add(new SetCardInfo("Molder Beast", 125, Rarity.COMMON, mage.cards.m.MolderBeast.class));
        cards.add(new SetCardInfo("Molten Psyche", 98, Rarity.RARE, mage.cards.m.MoltenPsyche.class));
        cards.add(new SetCardInfo("Molten-Tail Masticore", 177, Rarity.MYTHIC, mage.cards.m.MoltenTailMasticore.class));
        cards.add(new SetCardInfo("Moriok Reaver", 70, Rarity.COMMON, mage.cards.m.MoriokReaver.class));
        cards.add(new SetCardInfo("Moriok Replica", 178, Rarity.COMMON, mage.cards.m.MoriokReplica.class));
        cards.add(new SetCardInfo("Mountain", 242, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 243, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 244, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 245, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mox Opal", 179, Rarity.MYTHIC, mage.cards.m.MoxOpal.class));
        cards.add(new SetCardInfo("Myr Battlesphere", 180, Rarity.RARE, mage.cards.m.MyrBattlesphere.class));
        cards.add(new SetCardInfo("Myr Galvanizer", 181, Rarity.UNCOMMON, mage.cards.m.MyrGalvanizer.class));
        cards.add(new SetCardInfo("Myr Propagator", 182, Rarity.RARE, mage.cards.m.MyrPropagator.class));
        cards.add(new SetCardInfo("Myr Reservoir", 183, Rarity.RARE, mage.cards.m.MyrReservoir.class));
        cards.add(new SetCardInfo("Myrsmith", 16, Rarity.UNCOMMON, mage.cards.m.Myrsmith.class));
        cards.add(new SetCardInfo("Necrogen Censer", 184, Rarity.COMMON, mage.cards.n.NecrogenCenser.class));
        cards.add(new SetCardInfo("Necrogen Scudder", 71, Rarity.UNCOMMON, mage.cards.n.NecrogenScudder.class));
        cards.add(new SetCardInfo("Necropede", 185, Rarity.UNCOMMON, mage.cards.n.Necropede.class));
        cards.add(new SetCardInfo("Necrotic Ooze", 72, Rarity.RARE, mage.cards.n.NecroticOoze.class));
        cards.add(new SetCardInfo("Neurok Invisimancer", 37, Rarity.COMMON, mage.cards.n.NeurokInvisimancer.class));
        cards.add(new SetCardInfo("Neurok Replica", 186, Rarity.COMMON, mage.cards.n.NeurokReplica.class));
        cards.add(new SetCardInfo("Nihil Spellbomb", 187, Rarity.COMMON, mage.cards.n.NihilSpellbomb.class));
        cards.add(new SetCardInfo("Nim Deathmantle", 188, Rarity.RARE, mage.cards.n.NimDeathmantle.class));
        cards.add(new SetCardInfo("Ogre Geargrabber", 99, Rarity.UNCOMMON, mage.cards.o.OgreGeargrabber.class));
        cards.add(new SetCardInfo("Origin Spellbomb", 189, Rarity.COMMON, mage.cards.o.OriginSpellbomb.class));
        cards.add(new SetCardInfo("Oxidda Daredevil", 100, Rarity.COMMON, mage.cards.o.OxiddaDaredevil.class));
        cards.add(new SetCardInfo("Oxidda Scrapmelter", 101, Rarity.UNCOMMON, mage.cards.o.OxiddaScrapmelter.class));
        cards.add(new SetCardInfo("Painful Quandary", 73, Rarity.RARE, mage.cards.p.PainfulQuandary.class));
        cards.add(new SetCardInfo("Painsmith", 74, Rarity.UNCOMMON, mage.cards.p.Painsmith.class));
        cards.add(new SetCardInfo("Palladium Myr", 190, Rarity.UNCOMMON, mage.cards.p.PalladiumMyr.class));
        cards.add(new SetCardInfo("Panic Spellbomb", 191, Rarity.COMMON, mage.cards.p.PanicSpellbomb.class));
        cards.add(new SetCardInfo("Perilous Myr", 192, Rarity.COMMON, mage.cards.p.PerilousMyr.class));
        cards.add(new SetCardInfo("Plague Stinger", 75, Rarity.COMMON, mage.cards.p.PlagueStinger.class));
        cards.add(new SetCardInfo("Plains", 230, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 231, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 232, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 233, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plated Seastrider", 38, Rarity.COMMON, mage.cards.p.PlatedSeastrider.class));
        cards.add(new SetCardInfo("Platinum Emperion", 193, Rarity.MYTHIC, mage.cards.p.PlatinumEmperion.class));
        cards.add(new SetCardInfo("Precursor Golem", 194, Rarity.RARE, mage.cards.p.PrecursorGolem.class));
        cards.add(new SetCardInfo("Prototype Portal", 195, Rarity.RARE, mage.cards.p.PrototypePortal.class));
        cards.add(new SetCardInfo("Psychic Miasma", 76, Rarity.COMMON, mage.cards.p.PsychicMiasma.class));
        cards.add(new SetCardInfo("Putrefax", 126, Rarity.RARE, mage.cards.p.Putrefax.class));
        cards.add(new SetCardInfo("Quicksilver Gargantuan", 39, Rarity.MYTHIC, mage.cards.q.QuicksilverGargantuan.class));
        cards.add(new SetCardInfo("Ratchet Bomb", 196, Rarity.RARE, mage.cards.r.RatchetBomb.class));
        cards.add(new SetCardInfo("Razorfield Thresher", 197, Rarity.COMMON, mage.cards.r.RazorfieldThresher.class));
        cards.add(new SetCardInfo("Razor Hippogriff", 17, Rarity.UNCOMMON, mage.cards.r.RazorHippogriff.class));
        cards.add(new SetCardInfo("Razorverge Thicket", 228, Rarity.RARE, mage.cards.r.RazorvergeThicket.class));
        cards.add(new SetCardInfo("Relic Putrescence", 77, Rarity.COMMON, mage.cards.r.RelicPutrescence.class));
        cards.add(new SetCardInfo("Revoke Existence", 18, Rarity.COMMON, mage.cards.r.RevokeExistence.class));
        cards.add(new SetCardInfo("Riddlesmith", 40, Rarity.UNCOMMON, mage.cards.r.Riddlesmith.class));
        cards.add(new SetCardInfo("Rusted Relic", 199, Rarity.UNCOMMON, mage.cards.r.RustedRelic.class));
        cards.add(new SetCardInfo("Rust Tick", 198, Rarity.UNCOMMON, mage.cards.r.RustTick.class));
        cards.add(new SetCardInfo("Saberclaw Golem", 200, Rarity.COMMON, mage.cards.s.SaberclawGolem.class));
        cards.add(new SetCardInfo("Salvage Scout", 19, Rarity.COMMON, mage.cards.s.SalvageScout.class));
        cards.add(new SetCardInfo("Scoria Elemental", 102, Rarity.COMMON, mage.cards.s.ScoriaElemental.class));
        cards.add(new SetCardInfo("Scrapdiver Serpent", 41, Rarity.COMMON, mage.cards.s.ScrapdiverSerpent.class));
        cards.add(new SetCardInfo("Screeching Silcaw", 42, Rarity.COMMON, mage.cards.s.ScreechingSilcaw.class));
        cards.add(new SetCardInfo("Seachrome Coast", 229, Rarity.RARE, mage.cards.s.SeachromeCoast.class));
        cards.add(new SetCardInfo("Seize the Initiative", 20, Rarity.COMMON, mage.cards.s.SeizeTheInitiative.class));
        cards.add(new SetCardInfo("Semblance Anvil", 201, Rarity.RARE, mage.cards.s.SemblanceAnvil.class));
        cards.add(new SetCardInfo("Shape Anew", 43, Rarity.RARE, mage.cards.s.ShapeAnew.class));
        cards.add(new SetCardInfo("Shatter", 103, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Silver Myr", 202, Rarity.COMMON, mage.cards.s.SilverMyr.class));
        cards.add(new SetCardInfo("Skinrender", 78, Rarity.UNCOMMON, mage.cards.s.Skinrender.class));
        cards.add(new SetCardInfo("Skithiryx, the Blight Dragon", 79, Rarity.MYTHIC, mage.cards.s.SkithiryxTheBlightDragon.class));
        cards.add(new SetCardInfo("Sky-Eel School", 44, Rarity.COMMON, mage.cards.s.SkyEelSchool.class));
        cards.add(new SetCardInfo("Slice in Twain", 127, Rarity.UNCOMMON, mage.cards.s.SliceinTwain.class));
        cards.add(new SetCardInfo("Snapsail Glider", 203, Rarity.COMMON, mage.cards.s.SnapsailGlider.class));
        cards.add(new SetCardInfo("Soliton", 204, Rarity.COMMON, mage.cards.s.Soliton.class));
        cards.add(new SetCardInfo("Soul Parry", 21, Rarity.COMMON, mage.cards.s.SoulParry.class));
        cards.add(new SetCardInfo("Spikeshot Elder", 104, Rarity.RARE, mage.cards.s.SpikeshotElder.class));
        cards.add(new SetCardInfo("Steady Progress", 45, Rarity.COMMON, mage.cards.s.SteadyProgress.class));
        cards.add(new SetCardInfo("Steel Hellkite", 205, Rarity.RARE, mage.cards.s.SteelHellkite.class));
        cards.add(new SetCardInfo("Stoic Rebuttal", 46, Rarity.COMMON, mage.cards.s.StoicRebuttal.class));
        cards.add(new SetCardInfo("Strata Scythe", 206, Rarity.RARE, mage.cards.s.StrataScythe.class));
        cards.add(new SetCardInfo("Strider Harness", 207, Rarity.COMMON, mage.cards.s.StriderHarness.class));
        cards.add(new SetCardInfo("Sunblast Angel", 22, Rarity.RARE, mage.cards.s.SunblastAngel.class));
        cards.add(new SetCardInfo("Sunspear Shikari", 23, Rarity.COMMON, mage.cards.s.SunspearShikari.class));
        cards.add(new SetCardInfo("Swamp", 238, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 239, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 240, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 241, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Sword of Body and Mind", 208, Rarity.MYTHIC, mage.cards.s.SwordOfBodyAndMind.class));
        cards.add(new SetCardInfo("Sylvok Lifestaff", 209, Rarity.COMMON, mage.cards.s.SylvokLifestaff.class));
        cards.add(new SetCardInfo("Sylvok Replica", 210, Rarity.COMMON, mage.cards.s.SylvokReplica.class));
        cards.add(new SetCardInfo("Tainted Strike", 80, Rarity.COMMON, mage.cards.t.TaintedStrike.class));
        cards.add(new SetCardInfo("Tangle Angler", 128, Rarity.UNCOMMON, mage.cards.t.TangleAngler.class));
        cards.add(new SetCardInfo("Tel-Jilad Defiance", 129, Rarity.COMMON, mage.cards.t.TelJiladDefiance.class));
        cards.add(new SetCardInfo("Tel-Jilad Fallen", 130, Rarity.COMMON, mage.cards.t.TelJiladFallen.class));
        cards.add(new SetCardInfo("Tempered Steel", 24, Rarity.RARE, mage.cards.t.TemperedSteel.class));
        cards.add(new SetCardInfo("Throne of Geth", 211, Rarity.UNCOMMON, mage.cards.t.ThroneofGeth.class));
        cards.add(new SetCardInfo("Thrummingbird", 47, Rarity.UNCOMMON, mage.cards.t.Thrummingbird.class));
        cards.add(new SetCardInfo("Tower of Calamities", 212, Rarity.RARE, mage.cards.t.TowerOfCalamities.class));
        cards.add(new SetCardInfo("Trigon of Corruption", 213, Rarity.UNCOMMON, mage.cards.t.TrigonOfCorruption.class));
        cards.add(new SetCardInfo("Trigon of Infestation", 214, Rarity.UNCOMMON, mage.cards.t.TrigonOfInfestation.class));
        cards.add(new SetCardInfo("Trigon of Mending", 215, Rarity.UNCOMMON, mage.cards.t.TrigonOfMending.class));
        cards.add(new SetCardInfo("Trigon of Rage", 216, Rarity.UNCOMMON, mage.cards.t.TrigonOfRage.class));
        cards.add(new SetCardInfo("Trigon of Thought", 217, Rarity.UNCOMMON, mage.cards.t.TrigonOfThought.class));
        cards.add(new SetCardInfo("Trinket Mage", 48, Rarity.UNCOMMON, mage.cards.t.TrinketMage.class));
        cards.add(new SetCardInfo("True Conviction", 25, Rarity.RARE, mage.cards.t.TrueConviction.class));
        cards.add(new SetCardInfo("Tumble Magnet", 218, Rarity.COMMON, mage.cards.t.TumbleMagnet.class));
        cards.add(new SetCardInfo("Tunnel Ignus", 105, Rarity.RARE, mage.cards.t.TunnelIgnus.class));
        cards.add(new SetCardInfo("Turn Aside", 49, Rarity.COMMON, mage.cards.t.TurnAside.class));
        cards.add(new SetCardInfo("Turn to Slag", 106, Rarity.COMMON, mage.cards.t.TurnToSlag.class));
        cards.add(new SetCardInfo("Twisted Image", 50, Rarity.UNCOMMON, mage.cards.t.TwistedImage.class));
        cards.add(new SetCardInfo("Untamed Might", 131, Rarity.COMMON, mage.cards.u.UntamedMight.class));
        cards.add(new SetCardInfo("Vault Skyward", 51, Rarity.COMMON, mage.cards.v.VaultSkyward.class));
        cards.add(new SetCardInfo("Vector Asp", 219, Rarity.COMMON, mage.cards.v.VectorAsp.class));
        cards.add(new SetCardInfo("Vedalken Certarch", 52, Rarity.COMMON, mage.cards.v.VedalkenCertarch.class));
        cards.add(new SetCardInfo("Venser's Journal", 220, Rarity.RARE, mage.cards.v.VensersJournal.class));
        cards.add(new SetCardInfo("Venser, the Sojourner", 135, Rarity.MYTHIC, mage.cards.v.VenserTheSojourner.class));
        cards.add(new SetCardInfo("Vigil for the Lost", 26, Rarity.UNCOMMON, mage.cards.v.VigilForTheLost.class));
        cards.add(new SetCardInfo("Viridian Revel", 132, Rarity.UNCOMMON, mage.cards.v.ViridianRevel.class));
        cards.add(new SetCardInfo("Volition Reins", 53, Rarity.UNCOMMON, mage.cards.v.VolitionReins.class));
        cards.add(new SetCardInfo("Vulshok Heartstoker", 107, Rarity.COMMON, mage.cards.v.VulshokHeartstoker.class));
        cards.add(new SetCardInfo("Vulshok Replica", 221, Rarity.COMMON, mage.cards.v.VulshokReplica.class));
        cards.add(new SetCardInfo("Wall of Tanglecord", 222, Rarity.COMMON, mage.cards.w.WallOfTanglecord.class));
        cards.add(new SetCardInfo("Whitesun's Passage", 27, Rarity.COMMON, mage.cards.w.WhitesunsPassage.class));
        cards.add(new SetCardInfo("Wing Puncture", 133, Rarity.COMMON, mage.cards.w.WingPuncture.class));
        cards.add(new SetCardInfo("Withstand Death", 134, Rarity.COMMON, mage.cards.w.WithstandDeath.class));
        cards.add(new SetCardInfo("Wurmcoil Engine", 223, Rarity.MYTHIC, mage.cards.w.WurmcoilEngine.class));
    }

}
