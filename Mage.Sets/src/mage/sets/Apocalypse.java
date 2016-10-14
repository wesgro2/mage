package mage.sets;

import java.util.GregorianCalendar;

import mage.cards.ExpansionSet;
import mage.constants.SetType;
import mage.constants.Rarity;
import java.util.List;

public class Apocalypse extends ExpansionSet {
    private static final Apocalypse fINSTANCE = new Apocalypse();

    public static Apocalypse getInstance() {
        return fINSTANCE;
    }

    private Apocalypse() {
        super("Apocalypse", "APC", "mage.sets.apocalypse", ExpansionSet.buildDate(2001, 5, 1), SetType.EXPANSION);
        this.blockName = "Invasion";
        this.parentSet = Invasion.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Aether Mutation", 91, Rarity.UNCOMMON, mage.cards.a.AetherMutation.class));
        cards.add(new SetCardInfo("Ana Disciple", 73, Rarity.COMMON, mage.cards.a.AnaDisciple.class));
        cards.add(new SetCardInfo("Anavolver", 75, Rarity.RARE, mage.cards.a.Anavolver.class));
        cards.add(new SetCardInfo("Angelfire Crusader", 1, Rarity.COMMON, mage.cards.a.AngelfireCrusader.class));
        cards.add(new SetCardInfo("Battlefield Forge", 139, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Bloodfire Colossus", 55, Rarity.RARE, mage.cards.b.BloodfireColossus.class));
        cards.add(new SetCardInfo("Bloodfire Dwarf", 56, Rarity.COMMON, mage.cards.b.BloodfireDwarf.class));
        cards.add(new SetCardInfo("Bloodfire Kavu", 58, Rarity.UNCOMMON, mage.cards.b.BloodfireKavu.class));
        cards.add(new SetCardInfo("Bog Gnarr", 76, Rarity.COMMON, mage.cards.b.BogGnarr.class));
        cards.add(new SetCardInfo("Brass Herald", 133, Rarity.UNCOMMON, mage.cards.b.BrassHerald.class));
        cards.add(new SetCardInfo("Caves of Koilos", 140, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Ceta Disciple", 19, Rarity.COMMON, mage.cards.c.CetaDisciple.class));
        cards.add(new SetCardInfo("Cetavolver", 21, Rarity.RARE, mage.cards.c.Cetavolver.class));
	cards.add(new SetCardInfo("Coalition Flag", 2, Rarity.UNCOMMON, mage.cards.c.CoalitionFlag.class));
	cards.add(new SetCardInfo("Coalition Honor Guard", 3, Rarity.COMMON, mage.cards.c.CoalitionHonorGuard.class));
        cards.add(new SetCardInfo("Coastal Drake", 22, Rarity.COMMON, mage.cards.c.CoastalDrake.class));
        cards.add(new SetCardInfo("Consume Strength", 93, Rarity.COMMON, mage.cards.c.ConsumeStrength.class));
        cards.add(new SetCardInfo("Cromat", 94, Rarity.RARE, mage.cards.c.Cromat.class));
        cards.add(new SetCardInfo("Dead Ringers", 37, Rarity.COMMON, mage.cards.d.DeadRingers.class));
        cards.add(new SetCardInfo("Death Grasp", 95, Rarity.RARE, mage.cards.d.DeathGrasp.class));
        cards.add(new SetCardInfo("Death Mutation", 96, Rarity.UNCOMMON, mage.cards.d.DeathMutation.class));
        cards.add(new SetCardInfo("Dega Disciple", 4, Rarity.COMMON, mage.cards.d.DegaDisciple.class));
        cards.add(new SetCardInfo("Degavolver", 6, Rarity.RARE, mage.cards.d.Degavolver.class));
        cards.add(new SetCardInfo("Desolation Angel", 38, Rarity.RARE, mage.cards.d.DesolationAngel.class));
        cards.add(new SetCardInfo("Desolation Giant", 59, Rarity.RARE, mage.cards.d.DesolationGiant.class));
        cards.add(new SetCardInfo("Diversionary Tactics", 7, Rarity.UNCOMMON, mage.cards.d.DiversionaryTactics.class));
        cards.add(new SetCardInfo("Divine Light", 8, Rarity.COMMON, mage.cards.d.DivineLight.class));
        cards.add(new SetCardInfo("Dodecapod", 134, Rarity.UNCOMMON, mage.cards.d.Dodecapod.class));
        cards.add(new SetCardInfo("Dragon Arch", 135, Rarity.UNCOMMON, mage.cards.d.DragonArch.class));
        cards.add(new SetCardInfo("Dwarven Landslide", 60, Rarity.COMMON, mage.cards.d.DwarvenLandslide.class));
        cards.add(new SetCardInfo("Dwarven Patrol", 61, Rarity.UNCOMMON, mage.cards.d.DwarvenPatrol.class));
        cards.add(new SetCardInfo("Ebony Treefolk", 97, Rarity.UNCOMMON, mage.cards.e.EbonyTreefolk.class));
        cards.add(new SetCardInfo("Enlistment Officer", 9, Rarity.UNCOMMON, mage.cards.e.EnlistmentOfficer.class));
        cards.add(new SetCardInfo("Evasive Action", 23, Rarity.UNCOMMON, mage.cards.e.EvasiveAction.class));
        cards.add(new SetCardInfo("Fervent Charge", 98, Rarity.RARE, mage.cards.f.FerventCharge.class));
        cards.add(new SetCardInfo("Fire // Ice", 128, Rarity.UNCOMMON, mage.cards.f.FireIce.class));
        cards.add(new SetCardInfo("Flowstone Charger", 99, Rarity.UNCOMMON, mage.cards.f.FlowstoneCharger.class));
        cards.add(new SetCardInfo("Foul Presence", 39, Rarity.UNCOMMON, mage.cards.f.FoulPresence.class));
        cards.add(new SetCardInfo("Fungal Shambler", 100, Rarity.RARE, mage.cards.f.FungalShambler.class));
        cards.add(new SetCardInfo("Gaea's Skyfolk", 101, Rarity.COMMON, mage.cards.g.GaeasSkyfolk.class));
        cards.add(new SetCardInfo("Gerrard Capashen", 11, Rarity.RARE, mage.cards.g.GerrardCapashen.class));
        cards.add(new SetCardInfo("Gerrard's Verdict", 102, Rarity.UNCOMMON, mage.cards.g.GerrardsVerdict.class));
        cards.add(new SetCardInfo("Glade Gnarr", 78, Rarity.COMMON, mage.cards.g.GladeGnarr.class));
        cards.add(new SetCardInfo("Goblin Legionnaire", 103, Rarity.COMMON, mage.cards.g.GoblinLegionnaire.class));
        cards.add(new SetCardInfo("Goblin Ringleader", 62, Rarity.UNCOMMON, mage.cards.g.GoblinRingleader.class));
        cards.add(new SetCardInfo("Goblin Trenches", 104, Rarity.RARE, mage.cards.g.GoblinTrenches.class));
        cards.add(new SetCardInfo("Grave Defiler", 40, Rarity.UNCOMMON, mage.cards.g.GraveDefiler.class));
        cards.add(new SetCardInfo("Haunted Angel", 12, Rarity.UNCOMMON, mage.cards.h.HauntedAngel.class));
        cards.add(new SetCardInfo("Helionaut", 13, Rarity.COMMON, mage.cards.h.Helionaut.class));
        cards.add(new SetCardInfo("Illuminate", 63, Rarity.UNCOMMON, mage.cards.i.Illuminate.class));
        cards.add(new SetCardInfo("Illusion // Reality", 129, Rarity.UNCOMMON, mage.cards.i.IllusionReality.class));
        cards.add(new SetCardInfo("Index", 25, Rarity.COMMON, mage.cards.i.Index.class));
        cards.add(new SetCardInfo("Jilt", 27, Rarity.COMMON, mage.cards.j.Jilt.class));
        cards.add(new SetCardInfo("Jungle Barrier", 106, Rarity.UNCOMMON, mage.cards.j.JungleBarrier.class));
        cards.add(new SetCardInfo("Kavu Glider", 64, Rarity.COMMON, mage.cards.k.KavuGlider.class));
        cards.add(new SetCardInfo("Kavu Howler", 79, Rarity.UNCOMMON, mage.cards.k.KavuHowler.class));
        cards.add(new SetCardInfo("Kavu Mauler", 80, Rarity.RARE, mage.cards.k.KavuMauler.class));
        cards.add(new SetCardInfo("Last Caress", 41, Rarity.COMMON, mage.cards.l.LastCaress.class));
        cards.add(new SetCardInfo("Last Stand", 107, Rarity.RARE, mage.cards.l.LastStand.class));
        cards.add(new SetCardInfo("Lay of the Land", 81, Rarity.COMMON, mage.cards.l.LayOfTheLand.class));
        cards.add(new SetCardInfo("Legacy Weapon", 137, Rarity.RARE, mage.cards.l.LegacyWeapon.class));
        cards.add(new SetCardInfo("Life // Death", 130, Rarity.UNCOMMON, mage.cards.l.LifeDeath.class));
        cards.add(new SetCardInfo("Lightning Angel", 108, Rarity.RARE, mage.cards.l.LightningAngel.class));
        cards.add(new SetCardInfo("Living Airship", 28, Rarity.COMMON, mage.cards.l.LivingAirship.class));
        cards.add(new SetCardInfo("Llanowar Dead", 109, Rarity.COMMON, mage.cards.l.LlanowarDead.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 141, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Manacles of Decay", 14, Rarity.COMMON, mage.cards.m.ManaclesOfDecay.class));
        cards.add(new SetCardInfo("Martyrs' Tomb", 110, Rarity.UNCOMMON, mage.cards.m.MartyrsTomb.class));
        cards.add(new SetCardInfo("Mask of Intolerance", 138, Rarity.RARE, mage.cards.m.MaskOfIntolerance.class));
        cards.add(new SetCardInfo("Minotaur Illusionist", 111, Rarity.UNCOMMON, mage.cards.m.MinotaurIllusionist.class));
        cards.add(new SetCardInfo("Minotaur Tactician", 65, Rarity.COMMON, mage.cards.m.MinotaurTactician.class));
        cards.add(new SetCardInfo("Mournful Zombie", 43, Rarity.COMMON, mage.cards.m.MournfulZombie.class));
        cards.add(new SetCardInfo("Mystic Snake", 112, Rarity.RARE, mage.cards.m.MysticSnake.class));
        cards.add(new SetCardInfo("Necra Disciple", 44, Rarity.COMMON, mage.cards.n.NecraDisciple.class));
        cards.add(new SetCardInfo("Necravolver", 46, Rarity.RARE, mage.cards.n.Necravolver.class));
        cards.add(new SetCardInfo("Night // Day", 131, Rarity.UNCOMMON, mage.cards.n.NightDay.class));
        cards.add(new SetCardInfo("Order // Chaos", 132, Rarity.UNCOMMON, mage.cards.o.OrderChaos.class));
        cards.add(new SetCardInfo("Orim's Thunder", 15, Rarity.COMMON, mage.cards.o.OrimsThunder.class));
        cards.add(new SetCardInfo("Overgrown Estate", 113, Rarity.RARE, mage.cards.o.OvergrownEstate.class));
        cards.add(new SetCardInfo("Penumbra Bobcat", 82, Rarity.COMMON, mage.cards.p.PenumbraBobcat.class));
        cards.add(new SetCardInfo("Penumbra Kavu", 83, Rarity.UNCOMMON, mage.cards.p.PenumbraKavu.class));
        cards.add(new SetCardInfo("Penumbra Wurm", 84, Rarity.RARE, mage.cards.p.PenumbraWurm.class));
        cards.add(new SetCardInfo("Pernicious Deed", 114, Rarity.RARE, mage.cards.p.PerniciousDeed.class));
        cards.add(new SetCardInfo("Phyrexian Arena", 47, Rarity.RARE, mage.cards.p.PhyrexianArena.class));
        cards.add(new SetCardInfo("Phyrexian Gargantua", 48, Rarity.UNCOMMON, mage.cards.p.PhyrexianGargantua.class));
        cards.add(new SetCardInfo("Phyrexian Rager", 49, Rarity.COMMON, mage.cards.p.PhyrexianRager.class));
        cards.add(new SetCardInfo("Planar Despair", 50, Rarity.RARE, mage.cards.p.PlanarDespair.class));
        cards.add(new SetCardInfo("Prophetic Bolt", 116, Rarity.RARE, mage.cards.p.PropheticBolt.class));
        cards.add(new SetCardInfo("Putrid Warrior", 117, Rarity.COMMON, mage.cards.p.PutridWarrior.class));
        cards.add(new SetCardInfo("Quagmire Druid", 51, Rarity.COMMON, mage.cards.q.QuagmireDruid.class));
        cards.add(new SetCardInfo("Quicksilver Dagger", 118, Rarity.COMMON, mage.cards.q.QuicksilverDagger.class));
        cards.add(new SetCardInfo("Raka Disciple", 66, Rarity.COMMON, mage.cards.r.RakaDisciple.class));
        cards.add(new SetCardInfo("Rakavolver", 68, Rarity.RARE, mage.cards.r.Rakavolver.class));
        cards.add(new SetCardInfo("Razorfin Hunter", 119, Rarity.COMMON, mage.cards.r.RazorfinHunter.class));
        cards.add(new SetCardInfo("Reef Shaman", 29, Rarity.COMMON, mage.cards.r.ReefShaman.class));
        cards.add(new SetCardInfo("Savage Gorilla", 85, Rarity.COMMON, mage.cards.s.SavageGorilla.class));
        cards.add(new SetCardInfo("Shield of Duty and Reason", 16, Rarity.COMMON, mage.cards.s.ShieldOfDutyAndReason.class));
        cards.add(new SetCardInfo("Shimmering Mirage", 30, Rarity.COMMON, mage.cards.s.ShimmeringMirage.class));
        cards.add(new SetCardInfo("Shivan Reef", 142, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Smash", 69, Rarity.COMMON, mage.cards.s.Smash.class));
        cards.add(new SetCardInfo("Soul Link", 120, Rarity.COMMON, mage.cards.s.SoulLink.class));
        cards.add(new SetCardInfo("Spectral Lynx", 17, Rarity.RARE, mage.cards.s.SpectralLynx.class));
        cards.add(new SetCardInfo("Spiritmonger", 121, Rarity.RARE, mage.cards.s.Spiritmonger.class));
        cards.add(new SetCardInfo("Squee's Embrace", 122, Rarity.COMMON, mage.cards.s.SqueesEmbrace.class));
        cards.add(new SetCardInfo("Squee's Revenge", 123, Rarity.UNCOMMON, mage.cards.s.SqueesRevenge.class));
	cards.add(new SetCardInfo("Standard Bearer", 18, Rarity.COMMON, mage.cards.s.StandardBearer.class));
        cards.add(new SetCardInfo("Strength of Night", 86, Rarity.COMMON, mage.cards.s.StrengthOfNight.class));
        cards.add(new SetCardInfo("Suffocating Blast", 124, Rarity.RARE, mage.cards.s.SuffocatingBlast.class));
        cards.add(new SetCardInfo("Sylvan Messenger", 87, Rarity.UNCOMMON, mage.cards.s.SylvanMessenger.class));
        cards.add(new SetCardInfo("Symbiotic Deployment", 88, Rarity.RARE, mage.cards.s.SymbioticDeployment.class));
        cards.add(new SetCardInfo("Temporal Spring", 125, Rarity.COMMON, mage.cards.t.TemporalSpring.class));
        cards.add(new SetCardInfo("Tidal Courier", 31, Rarity.UNCOMMON, mage.cards.t.TidalCourier.class));
        cards.add(new SetCardInfo("Tranquil Path", 89, Rarity.COMMON, mage.cards.t.TranquilPath.class));
        cards.add(new SetCardInfo("Tundra Kavu", 71, Rarity.COMMON, mage.cards.t.TundraKavu.class));
        cards.add(new SetCardInfo("Unnatural Selection", 32, Rarity.RARE, mage.cards.u.UnnaturalSelection.class));
        cards.add(new SetCardInfo("Urborg Elf", 90, Rarity.COMMON, mage.cards.u.UrborgElf.class));
        cards.add(new SetCardInfo("Urborg Uprising", 53, Rarity.COMMON, mage.cards.u.UrborgUprising.class));
        cards.add(new SetCardInfo("Vindicate", 126, Rarity.RARE, mage.cards.v.Vindicate.class));
        cards.add(new SetCardInfo("Vodalian Mystic", 33, Rarity.UNCOMMON, mage.cards.v.VodalianMystic.class));
        cards.add(new SetCardInfo("Whirlpool Drake", 34, Rarity.UNCOMMON, mage.cards.w.WhirlpoolDrake.class));
        cards.add(new SetCardInfo("Whirlpool Rider", 35, Rarity.COMMON, mage.cards.w.WhirlpoolRider.class));
        cards.add(new SetCardInfo("Whirlpool Warrior", 36, Rarity.RARE, mage.cards.w.WhirlpoolWarrior.class));
        cards.add(new SetCardInfo("Wild Research", 72, Rarity.RARE, mage.cards.w.WildResearch.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 143, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yavimaya's Embrace", 127, Rarity.RARE, mage.cards.y.YavimayasEmbrace.class));
    }
}
