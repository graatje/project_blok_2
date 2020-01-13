import java.util.ArrayList;
public class battle
{
    double[] stats = {0.25, 0.286, 0.333, 0.4, 0.5, 0.666, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};
    double[] evanissesAndAccuracy = {0.333, 0.375, 0.428, 0.5, 0.6, 0.75, 1.0, 1.333, 1.666, 2.0, 2.333, 2.666, 3.0};
    ArrayList<Integer> generatedOponentRaw = new ArrayList<Integer>();
    ArrayList<Integer> statsOfOpponent = new ArrayList<Integer>();
    int maxLevel;
    int wildPokeLevel;
    int total;
    int level;
    int damage;
    int ownhp;
    ArrayList<Double> inBattleStats = new ArrayList<Double>();
    // attack(0), defense(1), special attack(2), special defense(3), speed(4), accuracy(5), evasion(6), atkOpponent(7), defOpponent(8), specAtkOpponent(9), specDefOpponent(10), speedOpponent(11), accuracyOpponent(12), evasionOpponent(13)
    int opponenthp;
    battle()
    {
    for(int i = 0; i <= 14; i++)
        {
        inBattleStats.add(1.0);
    }
    }
        
    // based on average team level.
    private int generateLevel()
    {
        for(int i = 0; i < Pokemon.obtainedPokemonStats.size(); i++)
        {
            total += Pokemon.obtainedPokemonStats.get(i).get(1);
        }
        level = total / Pokemon.obtainedPokemonStats.size();
        return level;
    }
    public void wildOpponent(int pokemonKind)
    {
        generatedOponentRaw = Pokemon.getWildPokeRawStats(pokemonKind, generateLevel());
        
    }
}

  

