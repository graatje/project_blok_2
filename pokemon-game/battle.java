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
    //kindOfDmg is physical or special. respectively 0 and 1
    public void theBattle(ArrayList ownRawStats, ArrayList opponentRawStats, ArrayList ownConvertedStats, ArrayList opponentConvertedStats)
    {
        ownhp = Pokemon.hpOfPokes.get(0);
        opponenthp = Integer.parseInt(opponentConvertedStats.get(0).toString());
        while(ownhp > 0 && opponenthp > 0)
        {
            if(Integer.parseInt(ownConvertedStats.get(5).toString()) >= Integer.parseInt(opponentConvertedStats.get(5).toString()))
            {
                attackBySelf(20, 0, ownRawStats, ownConvertedStats, opponentConvertedStats);
                if(opponenthp > 0 && ownhp > 0)
                {
                    attackByEnemy(20, 1, opponentRawStats, opponentConvertedStats, ownConvertedStats);
                }
            }   
            if(Integer.parseInt(ownConvertedStats.get(5).toString()) < Integer.parseInt(opponentConvertedStats.get(5).toString()))
            {
                attackByEnemy(20, 1, opponentRawStats, opponentConvertedStats, ownConvertedStats);
                if(opponenthp > 0 && ownhp > 0)
                {
                     attackBySelf(20, 0, ownRawStats, ownConvertedStats, opponentConvertedStats);
                }
            }   
        }
    }
    public void attackBySelf(ArrayList moveInfo, ArrayList rawStats, ArrayList convertedStats, ArrayList convertedStatsOpponent)
    {
        if(kindOfDmg == 0)//physical
        {            
            damage = (((2 * Integer.parseInt(rawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * Integer.parseInt(convertedStats.get(1).toString()) / Integer.parseInt(convertedStatsOpponent.get(2).toString())) / 50 + 2);
            opponenthp  -= damage;
        }
        else if(kindOfDmg == 1)//special
        {
            damage = (((2 * Integer.parseInt(rawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * Integer.parseInt(convertedStats.get(3).toString()) / Integer.parseInt(convertedStatsOpponent.get(4).toString())) / 50 + 2);
            opponenthp  -= damage;
        }
        //level is the level of the attacker
        //damage = (((2 *level / 5 + 2) * moveDamage * attack / defense)/50 + 2) * modifier;
    }
    public void attackByEnemy(ArrayList moveInfo, ArrayList opponentRawStats, ArrayList convertedStatsOpponent, ArrayList convertedStats)
    {
        if(kindOfDmg == 0)//physical
        {
            //must cast it into an int
            //                    level                                                                        attack                                                                                defense                                         
            damage = (int)(((2 * Integer.parseInt(opponentRawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * (Integer.parseInt(convertedStatsOpponent.get(1).toString()) * inBattleStats.get(7)) / (Integer.parseInt(convertedStats.get(2).toString()) * inBattleStats.get(1)))/50 + 2);
            ownhp -= damage;
        }
        else if(kindOfDmg == 1)//special
        {
            damage = (((2 * Integer.parseInt(opponentRawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * (Integer.parseInt(convertedStatsOpponent.get(3).toString()) * inBattleStats.get(9))/ Integer.parseInt(convertedStats.get(4).toString()) * inBattleStats.get(3)/50 + 2));
            ownhp -= damage;
        }
        else if(kindOfDmg ==2)//status
        {
            
        }
    }
}

  

