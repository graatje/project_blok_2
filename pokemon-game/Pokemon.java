import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Pokemon
/**
deze klasse maakt pokemons aan, bevat arrays van de pokemon(zowel statistieken als naam, type, stats, movesets), geeft experience points aan een pokemon, leert moves aan, maakt een ArrayList met rawStats aan, daarin staat het pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev en de xp.
Daarmee worden de statistieken van een pokemon berekend. Dat gebeurt in klasse convertToStats.
bevat een get methode om de naam van de pokemon te geven. 
@author Kevin

**//
{
    public static ArrayList<ArrayList<Integer> > obtainedPokemonStats = new ArrayList<ArrayList<Integer>> (); // as raw stats
    public static ArrayList<Integer> hpOfPokes = new ArrayList<Integer>();
    static ArrayList<Integer> rawStats = new ArrayList<Integer>();
    //all pokemon names
    static String[] pokemon = {"bulbasaur", "ivysaur", "venusaur", "charmander", "charmeleon", "charizard", "squirtle", "wartortle", "blastoise", "caterpie", "metapod", "butterfree", "weedle", "kakuna", "beedrill", "pidgey", "pidgeotto", "pidgeot", "rattata", "raticate", "spearow", "fearow", "ekans", "arbok", "pikachu", "raichu", "sandshrew", "sandslash", "nidoran_female", "nidorina", "nidoqueen", "nidoran_male", "nidorino", "nidoking", "clefairy", "clefable", "vulpix", "ninetales", "jigglypuff", "wigglytuff", "zubat", "golbat", "oddish", "gloom", "vileplume", "paras", "parasect", "venonat", "venomoth", "diglett", "dugtrio", "meowth", "persian", "psyduck", "golduck", "mankey", "primeape", "growlithe", "arcanine", "poliwag", "poliwhirl", "poliwrath", "abra", "kadabra", "alakazam", "machop", "machoke", "machamp", "bellsprout", "weepinbell", "victreebel", "tentacool", "tentacruel", "geodude", "graveler", "golem", "ponyta", "rapidash", "slowpoke", "slowbro", "magnemite", "magneton", "farfetch_d", "doduo", "dodrio", "seel", "dewgong", "grimer", "muk", "shellder", "cloyster", "gastly", "haunter", "gengar", "onix", "drowzee", "hypno", "krabby", "kingler", "voltorb", "electrode", "exeggcute", "exeggutor", "cubone", "marowak", "hitmonlee", "hitmonchan", "lickitung", "koffing", "weezing", "rhyhorn", "rhydon", "chansey", "tangela", "kangaskhan", "horsea", "seadra", "goldeen", "seaking", "staryu", "starmie", "mr_mime", "scyther", "jynx", "electabuzz", "magmar", "pinsir", "tauros", "magikarp", "gyarados", "lapras", "ditto", "eevee", "vaporeon", "jolteon", "flareon", "porygon", "omanyte", "omastar", "kabuto", "kabutops", "aerodactyl", "snorlax", "articuno", "zapdos", "moltres", "dratini", "dragonair", "dragonite", "mewtwo"};
    //all pokemon stats
	static Integer[][] stats = {{45, 49, 49, 65, 65, 45}, {60, 62, 63, 80, 80, 60}, {80, 82, 83, 100, 100, 80}, {39, 52, 43, 60, 50, 65}, {58, 64, 58, 80, 65, 80}, {78, 84, 78, 109, 85, 100}, {44, 48, 65, 50, 64, 43}, {59, 63, 80, 65, 80, 58}, {79, 83, 100, 85, 105, 78}, {45, 30, 35, 20, 20, 45}, {50, 20, 55, 25, 25, 30}, {60, 45, 50, 80, 80, 70}, {40, 35, 30, 20, 20, 50}, {45, 25, 50, 25, 25, 35}, {65, 80, 40, 45, 80, 75}, {40, 45, 40, 35, 35, 56}, {63, 60, 55, 50, 50, 71}, {83, 80, 75, 70, 70, 91}, {30, 56, 35, 25, 35, 72}, {55, 81, 60, 50, 70, 97}, {40, 60, 30, 31, 31, 70}, {65, 90, 65, 61, 61, 100}, {35, 60, 44, 40, 54, 55}, {60, 85, 69, 65, 79, 80}, {35, 55, 30, 50, 40, 90}, {60, 90, 55, 90, 80, 100}, {50, 75, 85, 20, 30, 40}, {75, 100, 110, 45, 55, 65}, {55, 47, 52, 40, 40, 41}, {70, 62, 67, 55, 55, 56}, {90, 82, 87, 75, 85, 76}, {46, 57, 40, 40, 40, 50}, {61, 72, 57, 55, 55, 65}, {81, 92, 77, 85, 75, 85}, {70, 45, 48, 60, 65, 35}, {95, 70, 73, 85, 90, 60}, {38, 41, 40, 50, 65, 65}, {73, 76, 75, 81, 100, 100}, {115, 45, 20, 45, 25, 20}, {140, 70, 45, 75, 50, 45}, {40, 45, 35, 30, 40, 55}, {75, 80, 70, 65, 75, 90}, {45, 50, 55, 75, 65, 30}, {60, 65, 70, 85, 75, 40}, {75, 80, 85, 100, 90, 50}, {35, 70, 55, 45, 55, 25}, {60, 95, 80, 60, 80, 30}, {60, 55, 50, 40, 55, 45}, {70, 65, 60, 90, 75, 90}, {10, 55, 25, 35, 45, 95}, {35, 80, 50, 50, 70, 120}, {40, 45, 35, 40, 40, 90}, {65, 70, 60, 65, 65, 115}, {50, 52, 48, 65, 50, 55}, {80, 82, 78, 95, 80, 85}, {40, 80, 35, 35, 45, 70}, {65, 105, 60, 60, 70, 95}, {55, 70, 45, 70, 50, 60}, {90, 110, 80, 100, 80, 95}, {40, 50, 40, 40, 40, 90}, {65, 65, 65, 50, 50, 90}, {90, 85, 95, 70, 90, 70}, {25, 20, 15, 105, 55, 90}, {40, 35, 30, 120, 70, 105}, {55, 50, 45, 135, 85, 120}, {70, 80, 50, 35, 35, 35}, {80, 100, 70, 50, 60, 45}, {90, 130, 80, 65, 85, 55}, {50, 75, 35, 70, 30, 40}, {65, 90, 50, 85, 45, 55}, {80, 105, 65, 100, 60, 70}, {40, 40, 35, 50, 100, 70}, {80, 70, 65, 80, 120, 100}, {40, 80, 100, 30, 30, 20}, {55, 95, 115, 45, 45, 35}, {80, 110, 130, 55, 65, 45}, {50, 85, 55, 65, 65, 90}, {65, 100, 70, 80, 80, 105}, {90, 65, 65, 40, 40, 15}, {95, 75, 110, 100, 80, 30}, {25, 35, 70, 95, 55, 45}, {50, 60, 95, 120, 70, 70}, {52, 65, 55, 58, 62, 60}, {35, 85, 45, 35, 35, 75}, {60, 110, 70, 60, 60, 100}, {65, 45, 55, 45, 70, 45}, {90, 70, 80, 70, 95, 70}, {80, 80, 50, 40, 50, 25}, {105, 105, 75, 65, 100, 50}, {30, 65, 100, 45, 25, 40}, {50, 95, 180, 85, 45, 70}, {30, 35, 30, 100, 35, 80}, {45, 50, 45, 115, 55, 95}, {60, 65, 60, 130, 75, 110}, {35, 45, 160, 30, 45, 70}, {60, 48, 45, 43, 90, 42}, {85, 73, 70, 73, 115, 67}, {30, 105, 90, 25, 25, 50}, {55, 130, 115, 50, 50, 75}, {40, 30, 50, 55, 55, 100}, {60, 50, 70, 80, 80, 140}, {60, 40, 80, 60, 45, 40}, {95, 95, 85, 125, 65, 55}, {50, 50, 95, 40, 50, 35}, {60, 80, 110, 50, 80, 45}, {50, 120, 53, 35, 110, 87}, {50, 105, 79, 35, 110, 76}, {90, 55, 75, 60, 75, 30}, {40, 65, 95, 60, 45, 35}, {65, 90, 120, 85, 70, 60}, {80, 85, 95, 30, 30, 25}, {105, 130, 120, 45, 45, 40}, {250, 5, 5, 35, 105, 50}, {65, 55, 115, 100, 40, 60}, {105, 95, 80, 40, 80, 90}, {30, 40, 70, 70, 25, 60}, {55, 65, 95, 95, 45, 85}, {45, 67, 60, 35, 50, 63}, {80, 92, 65, 65, 80, 68}, {30, 45, 55, 70, 55, 85}, {60, 75, 85, 100, 85, 115}, {40, 45, 65, 100, 120, 90}, {70, 110, 80, 55, 80, 105}, {65, 50, 35, 115, 95, 95}, {65, 83, 57, 95, 85, 105}, {65, 95, 57, 100, 85, 93}, {65, 125, 100, 55, 70, 85}, {75, 100, 95, 40, 70, 110}, {20, 10, 55, 15, 20, 80}, {95, 125, 79, 60, 100, 81}, {130, 85, 80, 85, 95, 60}, {48, 48, 48, 48, 48, 48}, {55, 55, 50, 45, 65, 55}, {130, 65, 60, 110, 95, 65}, {65, 65, 60, 110, 95, 130}, {65, 130, 60, 95, 110, 65}, {65, 60, 70, 85, 75, 40}, {35, 40, 100, 90, 55, 35}, {70, 60, 125, 115, 70, 55}, {30, 80, 90, 55, 45, 55}, {60, 115, 105, 65, 70, 80}, {80, 105, 65, 60, 75, 130}, {160, 110, 65, 65, 110, 30}, {90, 85, 100, 95, 125, 85}, {90, 90, 85, 125, 90, 100}, {90, 100, 90, 125, 85, 90}, {41, 64, 45, 50, 50, 50}, {61, 84, 65, 70, 70, 70}, {91, 134, 95, 100, 100, 80}, {106, 110, 90, 154, 90, 130}, {100, 100, 100, 100, 100, 100}};
    //all pokemon movesets
	static ArrayList[][] learnset = {{Moves.vineWhip(), Moves.tackle(), Moves.razorLeaf(), Moves.growl(), Moves.doubleEdge()}, {Moves.vineWhip(), Moves.tackle(), Moves.razorLeaf(), Moves.growl(), Moves.doubleEdge()}, {Moves.vineWhip(), Moves.tackle(), Moves.razorLeaf(), Moves.growl(), Moves.doubleEdge()}, {Moves.slash(), Moves.smokescreen(), Moves.slash(), Moves.scratch(), Moves.growl(), Moves.flamethrower(), Moves.ember()}, {Moves.slash(), Moves.smokescreen(), Moves.scratch(), Moves.growl(), Moves.flamethrower(), Moves.ember()}, {Moves.wingAttack(), Moves.smokescreen(), Moves.slash(), Moves.scratch(), Moves.growl(), Moves.flamethrower(), Moves.ember()}, {Moves.waterGun(), Moves.withdraw(), Moves.tailWhip(), Moves.tackle(), Moves.hydroPump(), Moves.bubble(), Moves.bite()}, {Moves.withdraw(), Moves.waterGun(), Moves.tailWhip(), Moves.tackle(), Moves.hydroPump(), Moves.bubble(), Moves.bite()}, {Moves.withdraw(), Moves.waterGun(), Moves.tailWhip(), Moves.tackle(), Moves.hydroPump(), Moves.flash(), Moves.bubble(), Moves.bite()}, {Moves.tackle(), Moves.stringShot(), Moves.bite()}, {Moves.harden()}, {Moves.psybeam(), Moves.gust(), Moves.confusion()}, {Moves.stringShot(), Moves.poisonSting(), Moves.bite()}, {Moves.harden()}, {Moves.twineedle(), Moves.pinMissile(), Moves.furyAttack(), Moves.agility()}, {Moves.wingAttack(), Moves.tackle(), Moves.slash(), Moves.sandAttack(), Moves.quickAttack(), Moves.gust(), Moves.agility()}, {Moves.wingAttack(), Moves.tackle(), Moves.slash(), Moves.sandAttack(), Moves.quickAttack(), Moves.gust(), Moves.agility()}, {Moves.wingAttack(), Moves.tackle(), Moves.slash(), Moves.sandAttack(), Moves.quickAttack(), Moves.gust(), Moves.agility()}, {Moves.tailWhip(), Moves.tackle(), Moves.quickAttack(), Moves.hyperFang(), Moves.doubleEdge(), Moves.bite()}, {Moves.tailWhip(), Moves.tackle(), Moves.swordsDance(), Moves.quickAttack(), Moves.hyperFang(), Moves.doubleEdge(), Moves.bite()}, {Moves.peck(), Moves.leer(), Moves.growl(), Moves.furyAttack(), Moves.drillPeck(), Moves.agility()}, {Moves.peck(), Moves.leer(), Moves.growl(), Moves.furyAttack(), Moves.drillPeck(), Moves.agility()}, {Moves.wrap(), Moves.screech(), Moves.poisonSting(), Moves.leer(), Moves.bite(), Moves.acid()}, {Moves.wrap(), Moves.thunder(), Moves.screech(), Moves.poisonSting(), Moves.leer(), Moves.bite(), Moves.acid()}, {Moves.thunderbolt(), Moves.thunderShock(), Moves.thunder(), Moves.tailWhip(), Moves.slam(), Moves.quickAttack(), Moves.growl(), Moves.doubleTeam(), Moves.agility()}, {Moves.thunderbolt(), Moves.thunderShock(), Moves.thunder(), Moves.tailWhip(), Moves.quickAttack()}, {Moves.swordsDance(), Moves.swift(), Moves.slash(), Moves.sandAttack(), Moves.scratch(), Moves.poisonSting(), Moves.furySwipes(), Moves.earthquake(), Moves.defenseCurl(), Moves.cut()}, {Moves.swordsDance(), Moves.swift(), Moves.slash(), Moves.sandAttack(), Moves.scratch(), Moves.poisonSting(), Moves.furySwipes(), Moves.earthquake(), Moves.defenseCurl(), Moves.cut()}, {Moves.tailWhip(), Moves.scratch(), Moves.poisonSting(), Moves.growl(), Moves.furySwipes(), Moves.doubleKick(), Moves.bite()}, {Moves.tailWhip(), Moves.scratch(), Moves.poisonSting(), Moves.growl(), Moves.furySwipes(), Moves.doubleKick(), Moves.bite()}, {Moves.tailWhip(), Moves.slam(), Moves.scratch(), Moves.poisonSting(), Moves.doubleKick(), Moves.bodySlam()}, {Moves.poisonSting(), Moves.peck(), Moves.leer(), Moves.hornDrill(), Moves.hornAttack(), Moves.furyAttack(), Moves.doubleKick()}, {Moves.poisonSting(), Moves.peck(), Moves.leer(), Moves.hornDrill(), Moves.hornAttack(), Moves.furyAttack(), Moves.doubleKick()}, {Moves.thrash(), Moves.poisonSting(), Moves.peck(), Moves.doubleKick()}, {Moves.slam(), Moves.pound(), Moves.minimize(), Moves.growl(), Moves.doubleSlap(), Moves.defenseCurl(), Moves.bodySlam()}, {Moves.minimize(), Moves.doubleSlap()}, {Moves.tailWhip(), Moves.quickAttack(), Moves.flamethrower(), Moves.fireBlast(), Moves.ember()}, {Moves.quickAttack(), Moves.ember()}, {Moves.slam(), Moves.pound(), Moves.doubleEdge(), Moves.doubleSlap(), Moves.defenseCurl(), Moves.bodySlam()}, {Moves.doubleSlap(), Moves.defenseCurl()}, {Moves.wingAttack(), Moves.swift(), Moves.slash(), Moves.leechLife(), Moves.cut(), Moves.bite()}, {Moves.wingAttack(), Moves.swift(), Moves.slash(), Moves.screech(), Moves.leechLife(), Moves.cut(), Moves.bite()}, {Moves.megaDrain(), Moves.acid(), Moves.absorb()}, {Moves.megaDrain(), Moves.acid(), Moves.absorb()}, {Moves.megaDrain()}, {Moves.slash(), Moves.scratch(), Moves.leechLife(), Moves.cut()}, {Moves.slash(), Moves.scratch(), Moves.leechLife(), Moves.cut()}, {Moves.tackle(), Moves.psychic(), Moves.psybeam(), Moves.leechLife(), Moves.headButt(), Moves.confusion()}, {Moves.tackle(), Moves.psychic(), Moves.psybeam(), Moves.leechLife(), Moves.headButt(), Moves.gust(), Moves.confusion()}, {Moves.slash(), Moves.sandAttack(), Moves.scratch(), Moves.growl(), Moves.fissure(), Moves.earthquake()}, {Moves.triAttack(), Moves.slash(), Moves.sandAttack(), Moves.scratch(), Moves.growl(), Moves.fissure(), Moves.earthquake()}, {Moves.slash(), Moves.screech(), Moves.scratch(), Moves.payDay(), Moves.growl(), Moves.furySwipes(), Moves.bite()}, {Moves.swift(), Moves.slash(), Moves.screech(), Moves.scratch(), Moves.growl(), Moves.furySwipes(), Moves.bite()}, {Moves.waterGun(), Moves.tailWhip(), Moves.screech(), Moves.scratch(), Moves.hydroPump(), Moves.headButt(), Moves.furySwipes(), Moves.confusion(), Moves.amnesia()}, {Moves.waterGun(), Moves.tailWhip(), Moves.screech(), Moves.scratch(), Moves.hydroPump(), Moves.headButt(), Moves.furySwipes(), Moves.confusion(), Moves.amnesia()}, {Moves.thrash(), Moves.screech(), Moves.scratch(), Moves.leer(), Moves.karateChop(), Moves.furySwipes()}, {Moves.thrash(), Moves.screech(), Moves.scratch(), Moves.leer(), Moves.karateChop(), Moves.furySwipes()}, {Moves.leer(), Moves.flamethrower(), Moves.ember(), Moves.bite(), Moves.agility()}, {Moves.thunder(), Moves.bite()}, {Moves.waterGun(), Moves.slam(), Moves.hydroPump(), Moves.doubleSlap(), Moves.bubbleBeam(), Moves.bubble(), Moves.bodySlam()}, {Moves.waterGun(), Moves.slam(), Moves.hydroPump(), Moves.doubleSlap(), Moves.bubbleBeam(), Moves.bubble(), Moves.bodySlam()}, {Moves.submission(), Moves.doubleSlap(), Moves.bubbleBeam(), Moves.bubble()}, {}, {Moves.psychic(), Moves.psybeam(), Moves.kinesis(), Moves.cut(), Moves.confusion()}, {Moves.psychic(), Moves.psybeam(), Moves.kinesis(), Moves.cut(), Moves.confusion()}, {Moves.submission(), Moves.leer(), Moves.karateChop()}, {Moves.submission(), Moves.leer(), Moves.karateChop()}, {Moves.submission(), Moves.leer(), Moves.karateChop()}, {Moves.wrap(), Moves.vineWhip(), Moves.slam(), Moves.razorLeaf(), Moves.acid()}, {Moves.wrap(), Moves.vineWhip(), Moves.slam(), Moves.razorLeaf(), Moves.acid()}, {Moves.vineWhip(), Moves.razorLeaf()}, {Moves.wrap(), Moves.sludge(), Moves.screech(), Moves.poisonSting(), Moves.hydroPump(), Moves.bubbleBeam(), Moves.bubble(), Moves.barrier(), Moves.acid()}, {Moves.wrap(), Moves.sludge(), Moves.screech(), Moves.poisonSting(), Moves.hydroPump(), Moves.bubbleBeam(), Moves.bubble(), Moves.barrier(), Moves.acid()}, {Moves.tackle(), Moves.rockThrow(), Moves.earthquake(), Moves.doubleEdge(), Moves.defenseCurl()}, {Moves.tackle(), Moves.rockThrow(), Moves.earthquake(), Moves.doubleEdge(), Moves.defenseCurl()}, {Moves.tackle(), Moves.slam(), Moves.rockThrow(), Moves.earthquake(), Moves.doubleEdge(), Moves.defenseCurl()}, {Moves.tailWhip(), Moves.tackle(), Moves.stomp(), Moves.growl(), Moves.fireBlast(), Moves.ember(), Moves.agility()}, {Moves.tailWhip(), Moves.stomp(), Moves.quickAttack(), Moves.growl(), Moves.furyAttack(), Moves.fireBlast(), Moves.ember(), Moves.agility()}, {Moves.waterGun(), Moves.tackle(), Moves.psychic(), Moves.headButt(), Moves.growl(), Moves.confusion(), Moves.amnesia()}, {Moves.withdraw(), Moves.waterGun(), Moves.tackle(), Moves.psychic(), Moves.headButt(), Moves.growl(), Moves.confusion(), Moves.amnesia()}, {Moves.thunderShock(), Moves.thunder(), Moves.tackle(), Moves.screech(), Moves.flash()}, {Moves.triAttack(), Moves.thunderShock(), Moves.thunder(), Moves.tackle(), Moves.screech(), Moves.flash()}, {Moves.swordsDance(), Moves.slash(), Moves.sandAttack(), Moves.peck(), Moves.leer(), Moves.furyAttack(), Moves.cut(), Moves.agility()}, {Moves.thrash(), Moves.quickAttack(), Moves.peck(), Moves.growl(), Moves.furyAttack(), Moves.drillPeck(), Moves.agility()}, {Moves.triAttack(), Moves.thrash(), Moves.quickAttack(), Moves.peck(), Moves.growl(), Moves.furyAttack(), Moves.drillPeck(), Moves.agility()}, {Moves.iceBeam(), Moves.headButt(), Moves.growl(), Moves.auroraBeam()}, {Moves.iceBeam(), Moves.headButt(), Moves.growl(), Moves.auroraBeam()}, {Moves.sludge(), Moves.screech(), Moves.pound(), Moves.minimize(), Moves.harden(), Moves.acidArmor(), Moves.acid()}, {Moves.sludge(), Moves.screech(), Moves.pound(), Moves.minimize(), Moves.harden(), Moves.acidArmor(), Moves.acid()}, {Moves.withdraw(), Moves.tackle(), Moves.leer(), Moves.iceBeam(), Moves.hydroPump(), Moves.clamp(), Moves.auroraBeam()}, {Moves.withdraw(), Moves.spikeCannon(), Moves.auroraBeam()}, {Moves.lick()}, {Moves.lick()}, {Moves.lick()}, {Moves.tackle(), Moves.slam(), Moves.screech(), Moves.rockThrow(), Moves.rockSlide(), Moves.harden(), Moves.doubleEdge()}, {Moves.psychic(), Moves.psybeam(), Moves.pound(), Moves.meditate(), Moves.headButt(), Moves.confusion()}, {Moves.psychic(), Moves.psybeam(), Moves.pound(), Moves.meditate(), Moves.headButt(), Moves.confusion()}, {Moves.stomp(), Moves.slam(), Moves.leer(), Moves.harden(), Moves.guillotine(), Moves.crabHammer(), Moves.bubbleBeam(), Moves.bubble()}, {Moves.stomp(), Moves.slam(), Moves.leer(), Moves.harden(), Moves.guillotine(), Moves.crabHammer(), Moves.bubbleBeam(), Moves.bubble()}, {Moves.tackle(), Moves.swift(), Moves.screech()}, {Moves.tackle(), Moves.swift(), Moves.screech()}, {Moves.psychic(), Moves.confusion(), Moves.barrage()}, {Moves.stomp(), Moves.eggBomb(), Moves.confusion(), Moves.barrage()}, {Moves.thrash(), Moves.tailWhip(), Moves.leer(), Moves.headButt(), Moves.growl(), Moves.doubleEdge(), Moves.bonemerang(), Moves.boneClub()}, {Moves.thrash(), Moves.tailWhip(), Moves.leer(), Moves.headButt(), Moves.growl(), Moves.doubleEdge(), Moves.bonemerang(), Moves.boneClub()}, {Moves.rollingKick(), Moves.megaKick(), Moves.meditate(), Moves.jumpKick(), Moves.doubleKick()}, {Moves.thunderPunch(), Moves.thunder(), Moves.megaPunch(), Moves.icePunch(), Moves.cut(), Moves.cometPunch(), Moves.agility()}, {Moves.wrap(), Moves.stomp(), Moves.slam(), Moves.screech(), Moves.lick(), Moves.defenseCurl()}, {Moves.tackle(), Moves.smokescreen(), Moves.smog(), Moves.sludge()}, {Moves.tackle(), Moves.smokescreen(), Moves.smog(), Moves.sludge()}, {Moves.tailWhip(), Moves.stomp(), Moves.hornDrill(), Moves.hornAttack(), Moves.furyAttack(), Moves.earthquake()}, {Moves.tailWhip(), Moves.stomp(), Moves.hornDrill(), Moves.hornAttack(), Moves.furyAttack(), Moves.earthquake()}, {Moves.tailWhip(), Moves.pound(), Moves.minimize(), Moves.growl(), Moves.eggBomb(), Moves.doubleEdge(), Moves.doubleSlap(), Moves.defenseCurl()}, {Moves.vineWhip(), Moves.slam(), Moves.megaDrain(), Moves.absorb()}, {Moves.tailWhip(), Moves.megaPunch(), Moves.leer(), Moves.cometPunch(), Moves.bite()}, {Moves.waterGun(), Moves.smokescreen(), Moves.leer(), Moves.hydroPump(), Moves.bubbleBeam(), Moves.bubble(), Moves.agility()}, {Moves.waterGun(), Moves.smokescreen(), Moves.leer(), Moves.hydroPump(), Moves.bubbleBeam(), Moves.bubble(), Moves.agility()}, {Moves.waterfall(), Moves.tailWhip(), Moves.peck(), Moves.hornDrill(), Moves.hornAttack(), Moves.furyAttack(), Moves.agility()}, {Moves.waterfall(), Moves.tailWhip(), Moves.peck(), Moves.hornDrill(), Moves.hornAttack(), Moves.furyAttack(), Moves.agility()}, {Moves.waterGun(), Moves.tackle(), Moves.swift(), Moves.minimize(), Moves.hydroPump(), Moves.harden(), Moves.bubbleBeam(), Moves.bubble()}, {Moves.waterGun(), Moves.swift()}, {Moves.psychic(), Moves.psybeam(), Moves.meditate(), Moves.doubleSlap(), Moves.confusion(), Moves.barrier()}, {Moves.wingAttack(), Moves.swordsDance(), Moves.slash(), Moves.quickAttack(), Moves.leer(), Moves.doubleTeam(), Moves.cut(), Moves.agility()}, {Moves.slam(), Moves.pound(), Moves.lick(), Moves.icePunch(), Moves.doubleSlap(), Moves.bodySlam()}, {Moves.thunderbolt(), Moves.thunderShock(), Moves.thunderPunch(), Moves.thunder(), Moves.swift(), Moves.screech(), Moves.quickAttack(), Moves.leer()}, {Moves.smokescreen(), Moves.smog(), Moves.leer(), Moves.flamethrower(), Moves.fireBlast(), Moves.ember()}, {Moves.thrash(), Moves.swordsDance(), Moves.submission(), Moves.harden(), Moves.guillotine()}, {Moves.thrash(), Moves.tailWhip(), Moves.tackle(), Moves.hornAttack(), Moves.headButt()}, {Moves.tackle(), Moves.splash()}, {Moves.thrash(), Moves.leer(), Moves.hyperBeam(), Moves.hydroPump(), Moves.bite()}, {Moves.waterGun(), Moves.slam(), Moves.iceBeam(), Moves.hydroPump(), Moves.growl(), Moves.bodySlam()}, {}, {Moves.tailWhip(), Moves.tackle(), Moves.sandAttack(), Moves.quickAttack(), Moves.growl(), Moves.doubleEdge(), Moves.bite()}, {Moves.waterGun(), Moves.tailWhip(), Moves.tackle(), Moves.sandAttack(), Moves.quickAttack(), Moves.hydroPump(), Moves.bite(), Moves.auroraBeam(), Moves.acidArmor(), Moves.acid()}, {Moves.thunderShock(), Moves.thunder(), Moves.tailWhip(), Moves.tackle(), Moves.sandAttack(), Moves.quickAttack(), Moves.pinMissile(), Moves.doubleKick(), Moves.agility()}, {Moves.tailWhip(), Moves.tackle(), Moves.smog(), Moves.sandAttack(), Moves.quickAttack(), Moves.fireBlast(), Moves.ember(), Moves.bite()}, {Moves.triAttack(), Moves.tackle(), Moves.sharpen(), Moves.psybeam(), Moves.agility()}, {Moves.withdraw(), Moves.waterGun(), Moves.leer(), Moves.hydroPump(), Moves.bite()}, {Moves.withdraw(), Moves.waterGun(), Moves.spikeCannon(), Moves.leer(), Moves.hydroPump(), Moves.bite()}, {Moves.sandAttack(), Moves.scratch(), Moves.megaDrain(), Moves.leer(), Moves.harden(), Moves.absorb()}, {Moves.slash(), Moves.sandAttack(), Moves.scratch(), Moves.megaDrain(), Moves.leer(), Moves.harden(), Moves.absorb()}, {Moves.wingAttack(), Moves.thunder(), Moves.rockSlide(), Moves.hyperBeam(), Moves.bite(), Moves.agility()}, {Moves.tackle(), Moves.slam(), Moves.lick(), Moves.defenseCurl(), Moves.bodySlam(), Moves.amnesia()}, {Moves.iceBeam(), Moves.gust(), Moves.agility()}, {Moves.thunderShock(), Moves.thunder(), Moves.peck(), Moves.drillPeck(), Moves.agility()}, {Moves.wingAttack(), Moves.slash(), Moves.flamethrower(), Moves.ember(), Moves.agility()}, {Moves.wrap(), Moves.thunder(), Moves.slam(), Moves.leer(), Moves.hyperBeam(), Moves.agility()}, {Moves.wrap(), Moves.thunder(), Moves.slam(), Moves.leer(), Moves.hyperBeam(), Moves.agility()}, {Moves.wrap(), Moves.wingAttack(), Moves.thunderPunch(), Moves.thunder(), Moves.slam(), Moves.leer(), Moves.hyperBeam(), Moves.agility()}, {Moves.swift(), Moves.psychic(), Moves.cut(), Moves.confusion(), Moves.barrier(), Moves.amnesia()}, {Moves.psychic(), Moves.pound(), Moves.megaPunch(), Moves.barrier(), Moves.amnesia()}};
	//all pokemon types
	static Integer[][] types = {{1, 14}, {1, 14}, {1, 14}, {3}, {3}, {3, 9}, {2}, {2}, {2}, {5}, {5}, {5, 9}, {5, 14}, {5, 14}, {5, 14}, {9, 13}, {9, 13}, {9, 13}, {13}, {13}, {9, 13}, {9, 13}, {14}, {14}, {6}, {6}, {11}, {11}, {14}, {14}, {11, 14}, {14}, {14}, {11, 14}, {13}, {13}, {3}, {3}, {13}, {13}, {9, 14}, {9, 14}, {1, 14}, {1, 14}, {1, 14}, {1, 5}, {1, 5}, {5, 14}, {5, 14}, {11}, {11}, {13}, {13}, {2}, {2}, {8}, {8}, {3}, {3}, {2}, {2}, {2, 8}, {4}, {4}, {4}, {8}, {8}, {8}, {1, 14}, {1, 14}, {1, 14}, {2, 14}, {2, 14}, {11, 15}, {11, 15}, {11, 15}, {3}, {3}, {2, 4}, {2, 4}, {6}, {6}, {9, 13}, {9, 13}, {9, 13}, {2}, {2, 12}, {14}, {14}, {2}, {2, 12}, {10, 14}, {10, 14}, {10, 14}, {11, 15}, {4}, {4}, {2}, {2}, {6}, {6}, {1, 4}, {1, 4}, {11}, {11}, {8}, {8}, {13}, {14}, {14}, {11, 15}, {11, 15}, {13}, {1}, {13}, {2}, {2}, {2}, {2}, {2}, {2, 4}, {4}, {5, 9}, {4, 12}, {6}, {3}, {5}, {13}, {2}, {2, 9}, {2, 12}, {13}, {13}, {2}, {6}, {3}, {13}, {2, 15}, {2, 15}, {2, 15}, {2, 15}, {9, 15}, {13}, {9, 12}, {6, 9}, {3, 9}, {7}, {7}, {7, 9}, {4}, {4}};
  
    static Scanner input = new Scanner(System.in);
    static int escape;
	static String choice;
    static int changeMove;
    static int tempValue1;

    //preparing for setting statistics (not raw stats)
    ArrayList<Integer> individualPokemonStats = new ArrayList<Integer>();
    static int hpStat;
    static int atkStat;
    static int defStat;
    static int specAtkStat;
    static int specDefStat;
    static int speedStat;
    static int hpIv;
    //getPokemon is used in Room
    static int obtainedXp;
	static int newLevel;
	
	//do inbattlePokemon -1 yourself
	/**
	berekent experience points en past deze aan, leert moves aan.
	@author Kevin
	@param inbattlepokemon, level van de tegenstander
	**/
	public static void getXp(int inbattlePokemon, int level)
	{
		ArrayList<Integer> rawStats = new ArrayList<Integer>();
		rawStats = obtainedPokemonStats.get(inbattlePokemon);
		
		obtainedXp = (int)(((70* level) / 5) * (Math.pow((level *2 + 10), 2.5)/ Math.pow((level + Integer.parseInt(rawStats.get(1).toString()) + 10), 2.5) + 1));
		
		
		obtainedPokemonStats.get(inbattlePokemon).set(14, Integer.parseInt(rawStats.get(14).toString()) + obtainedXp);
		if(Integer.parseInt(rawStats.get(14).toString()) >= Integer.parseInt(rawStats.get(1).toString()))
		{
			newLevel = Integer.parseInt(rawStats.get(1).toString()) + 1;
			obtainedPokemonStats.get(inbattlePokemon).set(1, newLevel);
			obtainedPokemonStats.get(inbattlePokemon).set(14, 0);
			//level up happened, now learning new move
			if(Integer.parseInt(obtainedPokemonStats.get(inbattlePokemon).get(1).toString()) / 3.0 % 1.0 == 0.0 && Integer.parseInt(obtainedPokemonStats.get(inbattlePokemon).get(1).toString()) / 3.0 < learnset[Integer.parseInt(obtainedPokemonStats.get(inbattlePokemon).get(0).toString())].length)
			{
				if(Battle.movesetSelf.size() == 4)
				{
					
					escape = 1;
					while(escape == 1)
					{
						System.out.println(pokemon[Integer.parseInt(rawStats.get(0).toString())] +  "wants to learn (move) but already knows 4 moves. do you want a move to be forgotten?(yes/no))");
						choice = input.nextLine();
						if(choice.equals("yes"))
						{
							System.out.println("what move do you want to forget? (1, 2, 3, 4)");
							changeMove = input.nextInt();
							if(changeMove <= 4 && changeMove >= 1)
							{
								Battle.movesetSelf.get(0).set(changeMove - 1, learnset[0][Integer.parseInt(rawStats.get(1).toString()) / 3]);
								escape = 0;
							}
							else
							{
								System.out.println("That is not a known move.");
							}
						}
						
						else if(choice.equals("no"))
						{
							escape = 0;
						}
						
						else
						{
							System.out.println("please only say 'yes' or 'no'");
						}
					}
				}
				else
				{
					try
					{
					Battle.movesetSelf.get(inbattlePokemon).add(learnset[inbattlePokemon][Integer.parseInt(obtainedPokemonStats.get(inbattlePokemon).get(1).toString()) / 3]);
					System.out.println(pokemon[Integer.parseInt(obtainedPokemonStats.get(inbattlePokemon).get(0).toString())] + " just learned a new move!");
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
					
					}
				}	
			}
		}
	}
	//pokemon to be switched in 
	
	/**
	geeft de naam van een pokemon.
	@author Kevin
	@return string
	@param index
	**/
    public static String getPokemon(int index)
    {
    return pokemon[index];   
    }
    // pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev
	/**
	voegt een pokemon toe aan een ArrayList. In die ArrayList zitten meerdere pokemons die je kunt gebruiken.
	**/
    public static void addPoke(ArrayList rawStats)
    {
		ArrayList<ArrayList> knownMoves = new ArrayList<ArrayList>();

        obtainedPokemonStats.add(rawStats);
        hpOfPokes.add(((2 * stats[Integer.parseInt(rawStats.get(0).toString())][0] + Integer.parseInt(rawStats.get(2).toString()) + (Integer.parseInt(rawStats.get(8).toString())/4)) * Integer.parseInt(rawStats.get(1).toString()) / 100 + Integer.parseInt(rawStats.get(1).toString())) + 10);
        knownMoves.add(learnset[Integer.parseInt(rawStats.get(0).toString())][0]);
		Battle.movesetSelf.add(knownMoves);
    }
	/**
	dit zijn de rawStats van de eindbaas. Deze heeft hogere statistieken dan de andere pokemons.
	@author Kevin
	@return ArrayList
	**/
    public static ArrayList endBossPokemon()
	{
		ArrayList<Integer> endBoss = new ArrayList<Integer>();
		endBoss.add(150);
		endBoss.add(Main.size);
		endBoss.add(31);
		endBoss.add(31);
		endBoss.add(31);
		endBoss.add(31);
		endBoss.add(31);
		endBoss.add(31);
		endBoss.add(0);
		endBoss.add(0);
		endBoss.add(0);
		endBoss.add(252);
		endBoss.add(0);
		endBoss.add(252);
		endBoss.add(0);
		return endBoss;
	}
    //pokemonkind is generated with the room itself.
    //level should be auto generated, method not known yet. Could be based on average team level, level of first poke in team etc. 
    //example, addPoke(getWildPokeRawStats(pokemonkind, level))
	
	/**
	Deze methode maakt rawstats van een pokemon aan. 
	@author Kevin
	@param pokemonKind, level van de te worden aangemaakte pokemon
	@return ArrayList
	**/
    public static ArrayList getWildPokeRawStats(int pokemonKind, int level)
    {
         // pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev, xp
         ArrayList<Integer> rawStats = new ArrayList<Integer>();
         rawStats.add(pokemonKind);
         rawStats.add(level);
         rawStats.add(Room.getRandomNumber(0, 31));
         rawStats.add(Room.getRandomNumber(0, 31));
         rawStats.add(Room.getRandomNumber(0, 31));
         rawStats.add(Room.getRandomNumber(0, 31));
         rawStats.add(Room.getRandomNumber(0, 31));
         rawStats.add(Room.getRandomNumber(0, 31));
         rawStats.add(0);
         rawStats.add(0);
         rawStats.add(0);
         rawStats.add(0);
         rawStats.add(0);
         rawStats.add(0);
		 rawStats.add(0);//xp
         return rawStats;
    }
	/**
	@author Martijn
	Deze methode print het level, de naam van de pokemon, de huidige health points en de maximale health points.
	**/
	public static void printPokemon() {
		for(int x = 0; x < obtainedPokemonStats.size(); x++) {
			ArrayList<Integer> stats = obtainedPokemonStats.get(x);
			String pokemon = getPokemon(stats.get(0));
			ArrayList<Integer> personalStats = convertToStats(stats);
			int maxHealthPoints = personalStats.get(0);
			int currentHealthPoints = hpOfPokes.get(x);
			int level = stats.get(1);

			pokemon = pokemon.substring(0, 1).toUpperCase() + pokemon.substring(1);

			// - " + (x + 1) + "
			Main.print("> " + (x + 1) + " - [Lvl. " + level + "] " + pokemon + " (" + currentHealthPoints + "hp / " + maxHealthPoints + "hp)");
		}
	}
    /**
	Maakt statistieken aan met behulp van een ArrayList. 
	@author Kevin
	@return ArrayList
	@param ArrayList
	**/
    public static ArrayList convertToStats(ArrayList rawStats)
    {
        // pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev
        ArrayList<Integer> individualPokemonStats = new ArrayList<Integer>();
        
        int hpIv = Integer.parseInt(rawStats.get(0).toString());
        hpStat = ((2 * stats[Integer.parseInt(rawStats.get(0).toString())][0] + Integer.parseInt(rawStats.get(2).toString()) + (Integer.parseInt(rawStats.get(8).toString())/4)) * Integer.parseInt(rawStats.get(1).toString()) / 100 + Integer.parseInt(rawStats.get(1).toString())) + 10;
        atkStat = (((2 * stats[Integer.parseInt(rawStats.get(0).toString())][1] + Integer.parseInt(rawStats.get(3).toString()) + (Integer.parseInt(rawStats.get(9).toString())/4)) * Integer.parseInt(rawStats.get(1).toString())) / 100 + 5); //*nature must be implemented yet.
        defStat = (((2 * stats[Integer.parseInt(rawStats.get(0).toString())][2] + Integer.parseInt(rawStats.get(4).toString()) + (Integer.parseInt(rawStats.get(10).toString())/4)) * Integer.parseInt(rawStats.get(1).toString())) / 100 + 5); //*nature must be implemented yet.
        specAtkStat = (((2 * stats[Integer.parseInt(rawStats.get(0).toString())][3] + Integer.parseInt(rawStats.get(5).toString()) + (Integer.parseInt(rawStats.get(11).toString())/4)) * Integer.parseInt(rawStats.get(1).toString())) / 100 + 5); //*nature must be implemented yet.
        specDefStat = (((2 * stats[Integer.parseInt(rawStats.get(0).toString())][4] + Integer.parseInt(rawStats.get(6).toString()) + (Integer.parseInt(rawStats.get(12).toString())/4)) * Integer.parseInt(rawStats.get(1).toString())) / 100 + 5); //*nature must be implemented yet.
        speedStat = (((2 * stats[Integer.parseInt(rawStats.get(0).toString())][5] + Integer.parseInt(rawStats.get(7).toString()) + (Integer.parseInt(rawStats.get(13).toString())/4)) * Integer.parseInt(rawStats.get(1).toString())) / 100 + 5); //*nature must be implemented yet.
                                                                                                                       // ((2 * Base + Iv + (ev / 4) * level)/100)+5 
        
        individualPokemonStats.add(hpStat);
        individualPokemonStats.add(atkStat);
        individualPokemonStats.add(defStat);
        individualPokemonStats.add(specAtkStat);
        individualPokemonStats.add(specDefStat);
        individualPokemonStats.add(speedStat);
        return individualPokemonStats;
    }
    
    public static void setCurrenthp(int index, int hp)
    {
        hpOfPokes.set(index, hp);
    }
}
