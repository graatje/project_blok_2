import java.util.ArrayList;
//https://github.com/Jmgiacone/Pokemon/blob/master/src/pokemon/core/Species.java

public class Pokemon
{
    
    public static ArrayList<ArrayList<Integer> > obtainedPokemonStats = new ArrayList<ArrayList<Integer>> (); 
    public static ArrayList<Integer> hpOfPokes = new ArrayList<Integer>();
    static ArrayList<Integer> rawStats = new ArrayList<Integer>();
    
    //all pokemon
    static String[] pokemon = {"bulbasaur", "ivysaur", "venusaur", "charmander", "charmeleon", "charizard", "squirtle", "wartortle", "blastoise", "caterpie", "metapod", "butterfree", "weedle", "kakuna", "beedrill", "pidgey", "pidgeotto", "pidgeot", "rattata", "raticate", "spearow", "fearow", "ekans", "arbok", "pikachu", "raichu", "sandshrew", "sandslash", "nidoran_female", "nidorina", "nidoqueen", "nidoran_male", "nidorino", "nidoking", "clefairy", "clefable", "vulpix", "ninetales", "jigglypuff", "wigglytuff", "zubat", "golbat", "oddish", "gloom", "vileplume", "paras", "parasect", "venonat", "venomoth", "diglett", "dugtrio", "meowth", "persian", "psyduck", "golduck", "mankey", "primeape", "growlithe", "arcanine", "poliwag", "poliwhirl", "poliwrath", "abra", "kadabra", "alakazam", "machop", "machoke", "machamp", "bellsprout", "weepinbell", "victreebel", "tentacool", "tentacruel", "geodude", "graveler", "golem", "ponyta", "rapidash", "slowpoke", "slowbro", "magnemite", "magneton", "farfetch_d", "doduo", "dodrio", "seel", "dewgong", "grimer", "muk", "shellder", "cloyster", "gastly", "haunter", "gengar", "onix", "drowzee", "hypno", "krabby", "kingler", "voltorb", "electrode", "exeggcute", "exeggutor", "cubone", "marowak", "hitmonlee", "hitmonchan", "lickitung", "koffing", "weezing", "rhyhorn", "rhydon", "chansey", "tangela", "kangaskhan", "horsea", "seadra", "goldeen", "seaking", "staryu", "starmie", "mr_mime", "scyther", "jynx", "electabuzz", "magmar", "pinsir", "tauros", "magikarp", "gyarados", "lapras", "ditto", "eevee", "vaporeon", "jolteon", "flareon", "porygon", "omanyte", "omastar", "kabuto", "kabutops", "aerodactyl", "snorlax", "articuno", "zapdos", "moltres", "dratini", "dragonair", "dragonite", "mewtwo"};
    static Integer[][] stats = {{45, 49, 49, 65, 65, 45}, {60, 62, 63, 80, 80, 60}, {80, 82, 83, 100, 100, 80}, {39, 52, 43, 60, 50, 65}, {58, 64, 58, 80, 65, 80}, {78, 84, 78, 109, 85, 100}, {44, 48, 65, 50, 64, 43}, {59, 63, 80, 65, 80, 58}, {79, 83, 100, 85, 105, 78}, {45, 30, 35, 20, 20, 45}, {50, 20, 55, 25, 25, 30}, {60, 45, 50, 80, 80, 70}, {40, 35, 30, 20, 20, 50}, {45, 25, 50, 25, 25, 35}, {65, 80, 40, 45, 80, 75}, {40, 45, 40, 35, 35, 56}, {63, 60, 55, 50, 50, 71}, {83, 80, 75, 70, 70, 91}, {30, 56, 35, 25, 35, 72}, {55, 81, 60, 50, 70, 97}, {40, 60, 30, 31, 31, 70}, {65, 90, 65, 61, 61, 100}, {35, 60, 44, 40, 54, 55}, {60, 85, 69, 65, 79, 80}, {35, 55, 30, 50, 40, 90}, {60, 90, 55, 90, 80, 100}, {50, 75, 85, 20, 30, 40}, {75, 100, 110, 45, 55, 65}, {55, 47, 52, 40, 40, 41}, {70, 62, 67, 55, 55, 56}, {90, 82, 87, 75, 85, 76}, {46, 57, 40, 40, 40, 50}, {61, 72, 57, 55, 55, 65}, {81, 92, 77, 85, 75, 85}, {70, 45, 48, 60, 65, 35}, {95, 70, 73, 85, 90, 60}, {38, 41, 40, 50, 65, 65}, {73, 76, 75, 81, 100, 100}, {115, 45, 20, 45, 25, 20}, {140, 70, 45, 75, 50, 45}, {40, 45, 35, 30, 40, 55}, {75, 80, 70, 65, 75, 90}, {45, 50, 55, 75, 65, 30}, {60, 65, 70, 85, 75, 40}, {75, 80, 85, 100, 90, 50}, {35, 70, 55, 45, 55, 25}, {60, 95, 80, 60, 80, 30}, {60, 55, 50, 40, 55, 45}, {70, 65, 60, 90, 75, 90}, {10, 55, 25, 35, 45, 95}, {35, 80, 50, 50, 70, 120}, {40, 45, 35, 40, 40, 90}, {65, 70, 60, 65, 65, 115}, {50, 52, 48, 65, 50, 55}, {80, 82, 78, 95, 80, 85}, {40, 80, 35, 35, 45, 70}, {65, 105, 60, 60, 70, 95}, {55, 70, 45, 70, 50, 60}, {90, 110, 80, 100, 80, 95}, {40, 50, 40, 40, 40, 90}, {65, 65, 65, 50, 50, 90}, {90, 85, 95, 70, 90, 70}, {25, 20, 15, 105, 55, 90}, {40, 35, 30, 120, 70, 105}, {55, 50, 45, 135, 85, 120}, {70, 80, 50, 35, 35, 35}, {80, 100, 70, 50, 60, 45}, {90, 130, 80, 65, 85, 55}, {50, 75, 35, 70, 30, 40}, {65, 90, 50, 85, 45, 55}, {80, 105, 65, 100, 60, 70}, {40, 40, 35, 50, 100, 70}, {80, 70, 65, 80, 120, 100}, {40, 80, 100, 30, 30, 20}, {55, 95, 115, 45, 45, 35}, {80, 110, 130, 55, 65, 45}, {50, 85, 55, 65, 65, 90}, {65, 100, 70, 80, 80, 105}, {90, 65, 65, 40, 40, 15}, {95, 75, 110, 100, 80, 30}, {25, 35, 70, 95, 55, 45}, {50, 60, 95, 120, 70, 70}, {52, 65, 55, 58, 62, 60}, {35, 85, 45, 35, 35, 75}, {60, 110, 70, 60, 60, 100}, {65, 45, 55, 45, 70, 45}, {90, 70, 80, 70, 95, 70}, {80, 80, 50, 40, 50, 25}, {105, 105, 75, 65, 100, 50}, {30, 65, 100, 45, 25, 40}, {50, 95, 180, 85, 45, 70}, {30, 35, 30, 100, 35, 80}, {45, 50, 45, 115, 55, 95}, {60, 65, 60, 130, 75, 110}, {35, 45, 160, 30, 45, 70}, {60, 48, 45, 43, 90, 42}, {85, 73, 70, 73, 115, 67}, {30, 105, 90, 25, 25, 50}, {55, 130, 115, 50, 50, 75}, {40, 30, 50, 55, 55, 100}, {60, 50, 70, 80, 80, 140}, {60, 40, 80, 60, 45, 40}, {95, 95, 85, 125, 65, 55}, {50, 50, 95, 40, 50, 35}, {60, 80, 110, 50, 80, 45}, {50, 120, 53, 35, 110, 87}, {50, 105, 79, 35, 110, 76}, {90, 55, 75, 60, 75, 30}, {40, 65, 95, 60, 45, 35}, {65, 90, 120, 85, 70, 60}, {80, 85, 95, 30, 30, 25}, {105, 130, 120, 45, 45, 40}, {250, 5, 5, 35, 105, 50}, {65, 55, 115, 100, 40, 60}, {105, 95, 80, 40, 80, 90}, {30, 40, 70, 70, 25, 60}, {55, 65, 95, 95, 45, 85}, {45, 67, 60, 35, 50, 63}, {80, 92, 65, 65, 80, 68}, {30, 45, 55, 70, 55, 85}, {60, 75, 85, 100, 85, 115}, {40, 45, 65, 100, 120, 90}, {70, 110, 80, 55, 80, 105}, {65, 50, 35, 115, 95, 95}, {65, 83, 57, 95, 85, 105}, {65, 95, 57, 100, 85, 93}, {65, 125, 100, 55, 70, 85}, {75, 100, 95, 40, 70, 110}, {20, 10, 55, 15, 20, 80}, {95, 125, 79, 60, 100, 81}, {130, 85, 80, 85, 95, 60}, {48, 48, 48, 48, 48, 48}, {55, 55, 50, 45, 65, 55}, {130, 65, 60, 110, 95, 65}, {65, 65, 60, 110, 95, 130}, {65, 130, 60, 95, 110, 65}, {65, 60, 70, 85, 75, 40}, {35, 40, 100, 90, 55, 35}, {70, 60, 125, 115, 70, 55}, {30, 80, 90, 55, 45, 55}, {60, 115, 105, 65, 70, 80}, {80, 105, 65, 60, 75, 130}, {160, 110, 65, 65, 110, 30}, {90, 85, 100, 95, 125, 85}, {90, 90, 85, 125, 90, 100}, {90, 100, 90, 125, 85, 90}, {41, 64, 45, 50, 50, 50}, {61, 84, 65, 70, 70, 70}, {91, 134, 95, 100, 100, 80}, {106, 110, 90, 154, 90, 130}, {100, 100, 100, 100, 100, 100}};
    
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
    
    public static String getPokemon(int index)
    {
    return pokemon[index];   
    }
    // pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev
    public void addPoke(ArrayList rawStats)
    {
        
        obtainedPokemonStats.add(rawStats);
        
    }
    
    //pokemonkind is generated with the room itself.
    //level should be auto generated, method not known yet. Could be based on average team level, level of first poke in team etc. 
    //example, addPoke(getWildPokeRawStats(pokemonkind, level))
    public static ArrayList getWildPokeRawStats(int pokemonKind, int level)
    {
         // pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev
         ArrayList<Integer> individualPokemonStats = new ArrayList<Integer>();
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
         return rawStats;
    }
    
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
