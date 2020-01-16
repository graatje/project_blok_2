import java.util.ArrayList;
public class battle
{
    double[] stats = {0.25, 0.286, 0.333, 0.4, 0.5, 0.666, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};
    double[] evanissesAndAccuracy = {0.333, 0.375, 0.428, 0.5, 0.6, 0.75, 1.0, 1.333, 1.666, 2.0, 2.333, 2.666, 3.0};
    ArrayList<Integer> generatedOponentRaw = new ArrayList<Integer>();
    ArrayList<Integer> statsOfOpponent = new ArrayList<Integer>();
	int r;
    int maxLevel;
    int wildPokeLevel;
    int currentStatIndex;
    int total;
    int level;
    int damage;
	int statIndex;
    ArrayList<Integer> moveInfo = new ArrayList<Integer>();;
    int kindOfDmg;
    int ownhp;
    int type1;
    int type2;
    double modifier;
	ArrayList<ArrayList> movesetEnemy = new ArrayList<ArrayList>();
    double modifier2;
    ArrayList<Double> inBattleStats = new ArrayList<Double>();
    // attack(0), defense(1), special attack(2), special defense(3), speed(4), accuracy(5), evasion(6), atkOpponent(7), defOpponent(8), specAtkOpponent(9), specDefOpponent(10), speedOpponent(11), accuracyOpponent(12), evasionOpponent(13)
    int opponenthp;
	int indexOfStat;
    battle()
    {
    for(int i = 0; i <= 14; i++)
        {
        inBattleStats.add(1.0);
    }
	
    }
    public double effectiveness(int type_move, int pokemon)
    {
       
            if(Pokemon.types[pokemon].length == 2){
                type1 = Pokemon.types[pokemon][0];
                type2 = Pokemon.types[pokemon][1];
            }
            else
            {
                type1 = Pokemon.types[pokemon][0];
                type2 = 0;// no second type
            }
            modifier = 1.0;
        switch(type_move)
        {
            case 1:
            //not else if. modifier might be based on multiple types.
                if(type1 == 1 || type2 == 1){
                        modifier = modifier * 0.5;
                    }
                if(type1 == 3 || type2 == 3){
                        modifier = modifier * 0.5;
                    }
                if(type1 == 2 || type2 == 2)
                {
                    modifier = modifier * 2.0;
                }
                if(type1 == 5 || type2 == 5)
                {
                    modifier = modifier * 0.5;
                }
                if(type1 == 7 || type2 == 7)
                {
                    modifier = modifier * 0.5;
                }
                if(type1 == 9 || type2 == 9)
                {
                    modifier = modifier * 0.5;
                }
                if(type1 == 11 || type2 == 11)
                {
                    modifier = modifier * 2.0;
                }
                if(type1 == 14 || type2 == 14)
                {
                    modifier = modifier * 0.5;
                }
                if(type1 == 15 || type2 == 15)
                {
                    modifier = modifier * 2.0;
                }
                break;
            case 2:
                if(type1 == 1 || type2 == 1)
                {
                        modifier = modifier * 0.5;
                }
                if(type1 == 2 || type2 == 2){
                        modifier = modifier * 0.5;
                }
                if(type1 == 3 || type2 == 3){
                        modifier = modifier * 2.0;
                }
                if(type1 == 7 || type2 == 7){
                        modifier = modifier * 0.5;
                    }
                if(type1 == 11 || type2 == 11){
                        modifier = modifier * 2.0;
                    }
                if(type1 == 15 || type2 == 15){
                        modifier = modifier * 2.0;
                    }
                break;
            case 3:
                if(type1 == 1 || type2 == 1){
                        modifier = modifier * 2.0;
                    }
                if(type1 == 2 || type2 == 2){
                        modifier = modifier * 0.5;
                    }
                if(type1 == 3 || type2 == 3){
                        modifier = modifier * 0.5;
                    }
                if(type1 == 5 || type2 == 5){
                        modifier = modifier * 2.0;
                    }
                if(type1 == 7 || type2 == 7){
                        modifier = modifier * 0.5;
                    }
                if(type1 == 12 || type2 == 12){
                        modifier = modifier * 2.0;
                    }
                if(type1 == 15 || type2 == 15){
                        modifier = modifier * 0.5;
                    }
                break;
                case 4:
                    if(type1 == 4 || type2 == 4){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 8 || type2 == 8){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 14 || type2 == 14){
                        modifier = modifier * 2.0;
                    }
                    break;
                case 5:
                    if(type1 == 1 || type2 == 1){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 3 || type2 == 3){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 4 || type2 == 4){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 8 || type2 == 8){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 9 || type2 == 9){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 10 || type2 == 10){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 14 || type2 == 14){
                        modifier = modifier * 0.5;
                    }
                    break;
                case 6:
                    if(type1 == 1 || type2 == 1){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 2 || type2 == 2){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 6 || type2 == 6){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 7 || type2 == 7){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 9 || type2 == 9){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 11 || type2 == 11){
                        modifier = modifier * 0.0;
                    }
                    break;
                case 7:
                    if(type1 == 7 || type2 == 7){
                        modifier = modifier * 2.0;
                    }
                    break;
                case 8:
                    if(type1 == 4 || type2 == 4){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 5 || type2 == 5){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 9 || type2 == 9){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 10 || type2 == 10){
                        modifier = modifier * 0.0;
                    }
                    if(type1 == 12 || type2 == 12){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 13 || type2 == 13){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 15 || type2 == 15){
                        modifier = modifier * 2.0;
                    }
                    break;
                case 9:
                    if(type1 == 1 || type2 == 1){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 5 || type2 == 5){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 6 || type2 == 6){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 8 || type2 == 8){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 15 || type2 == 15){
                        modifier = modifier * 0.5;
                    }
                    break;
                 case 10:
                    if(type1 == 4 || type2 == 4){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 10 || type2 == 10){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 13 || type2 == 13){
                        modifier = modifier * 0.5;
                    }
                    break;
                case 11:
                    if(type1 == 1 || type2 == 1){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 3 || type2 == 3){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 5 || type2 == 5){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 6 || type2 == 6){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 9 || type2 == 9){
                        modifier = modifier * 0.0;
                    }
                    if(type1 == 14 || type2 == 14){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 15 || type2 == 15){
                        modifier = modifier * 2.0;
                    }
                    break;
                case 12:
                    if(type1 == 1 || type2 == 1){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 2 || type2 == 2){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 3 || type2 == 3){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 7 || type2 == 7){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 9 || type2 == 9){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 11 || type2 == 11){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 12 || type2 == 12){
                        modifier = modifier * 0.5;
                    }
                    break;
                case 13:
                    if(type1 == 10 || type2 == 10){
                        modifier = modifier * 0.0;
                    }
                    if(type1 == 15 || type2 == 15){
                        modifier = modifier * 0.5;
                    }
                    break;
                case 14:
                    if(type1 == 1 || type2 == 1){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 10 || type2 == 10){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 11 || type2 == 11){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 14 || type2 == 14){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 15 || type2 == 15){
                        modifier = modifier * 0.5;
                    }
                    break;
                case 15:
                    if(type1 == 3 || type2 == 3){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 5 || type2 == 5){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 8 || type2 == 8){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 9 || type2 == 9){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 11 || type2 == 11){
                        modifier = modifier * 0.5;
                    }
                    if(type1 == 12 || type2 == 12){
                        modifier = modifier * 2.0;
                    }
                    if(type1 == 15 || type2 == 15){
                        modifier = modifier * 0.5;
                    }
                
    }
	
    return modifier;
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
                //attackBySelf(20, 0, ownRawStats, ownConvertedStats, opponentConvertedStats);
                if(opponenthp > 0 && ownhp > 0)
                {
                    //attackByEnemy(20, 1, opponentRawStats, opponentConvertedStats, ownConvertedStats);
                }
            }   
            if(Integer.parseInt(ownConvertedStats.get(5).toString()) < Integer.parseInt(opponentConvertedStats.get(5).toString()))
            {
               // attackByEnemy(20, 1, opponentRawStats, opponentConvertedStats, ownConvertedStats);
                if(opponenthp > 0 && ownhp > 0)
                {
                     //attackBySelf(20, 0, ownRawStats, ownConvertedStats, opponentConvertedStats);
                }
            }   
        }
    }
    public void attackBySelf(ArrayList moveInfo, ArrayList rawStats, ArrayList convertedStats, ArrayList convertedStatsOpponent)
    {
        kindOfDmg = Integer.parseInt(moveInfo.get(1).toString());
        if(kindOfDmg == 0)//physical
        {            
            damage = (int) ((((2 * Integer.parseInt(rawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * Integer.parseInt(convertedStats.get(1).toString()) / Integer.parseInt(convertedStatsOpponent.get(2).toString())) / 50 + 2) * modifier);
            opponenthp  -= damage;
        }
        else if(kindOfDmg == 1)//special
        {
            damage = (int)(((2 * Integer.parseInt(rawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * Integer.parseInt(convertedStats.get(3).toString()) / Integer.parseInt(convertedStatsOpponent.get(4).toString())) / 50 + 2);
            opponenthp  -= damage;
        }
		else if(kindOfDmg == 2)
		{
			//detecting change of stats
			if(Integer.parseInt(moveInfo.get(5).toString()) == 5 || Integer.parseInt(moveInfo.get(5).toString()) == 6 || Integer.parseInt(moveInfo.get(5).toString()) == 12 || Integer.parseInt(moveInfo.get(5).toString()) == 13)
			{
				for(int i = 0; i < evanissesAndAccuracy.length; i++)
				{
					if(evanissesAndAccuracy[i] == inBattleStats.get(Integer.parseInt(moveInfo.get(4).toString())))
					{
						currentStatIndex = i;
					}
				}
				if(((currentStatIndex + Integer.parseInt(moveInfo.get(5).toString())))< 0)
					
				{
					statIndex = 0;
				}
				else if((currentStatIndex + Integer.parseInt(moveInfo.get(5).toString()))> 12)
				{
					statIndex = 12;
				}
				else
				{
				statIndex = currentStatIndex + Integer.parseInt(moveInfo.get(5).toString());
				}
				
				inBattleStats.set(Integer.parseInt(moveInfo.get(4).toString()), evanissesAndAccuracy[(currentStatIndex + Integer.parseInt(moveInfo.get(5).toString()))]);
			}
			else
			{
				for(int i = 0; i < stats.length; i++)
				{
					if(stats[i] == inBattleStats.get(Integer.parseInt(moveInfo.get(4).toString())))
					{
						currentStatIndex = i;
					}
				}
				
				if((currentStatIndex + Integer.parseInt(moveInfo.get(5).toString()))< 0)
					
				{
					statIndex = 0;
				}
				else if((currentStatIndex + Integer.parseInt(moveInfo.get(5).toString()))> 12)
				{
					statIndex = 12;
				}
				else
				{
					statIndex = currentStatIndex + Integer.parseInt(moveInfo.get(5).toString());
				}
				inBattleStats.set(Integer.parseInt(moveInfo.get(4).toString()), evanissesAndAccuracy[(currentStatIndex + Integer.parseInt(moveInfo.get(5).toString()))]);
			}
        //level is the level of the attacker
        //damage = (((2 *level / 5 + 2) * moveDamage * attack / defense)/50 + 2) * modifier;
		}
}
	
	
	
	
	
    public void attackByEnemy(ArrayList opponentRawStats, ArrayList ownRawStats, ArrayList convertedStatsOpponent, ArrayList convertedStats)
    {
		//moveInfo has been removed from the parameters, moveInfo will be generated inside this method.
		//making moveset, learns a new move every X levels
		
		//form of ArrayList rawStats
		//pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev
		
			//setting integer
			if(Integer.parseInt(opponentRawStats.get(1).toString())/5 >= Pokemon.learnset[Integer.parseInt(opponentRawStats.get(0).toString())].length)
			{
				r = Integer.parseInt(opponentRawStats.get(1).toString())/3;
			}
		
			else{
				r = Pokemon.learnset[Integer.parseInt(opponentRawStats.get(0).toString())].length;
			}
			for(int w = r;w >= 0; w--) 
			{
				if(movesetEnemy.size() <= 4)
				{
					movesetEnemy.add(Pokemon.learnset[Integer.parseInt(opponentRawStats.get(0).toString())][w]);
				}
				
			}
	moveInfo = movesetEnemy.get(Room.getRandomNumber(0, 3));
		
		
		
		
		
        if(Integer.parseInt(moveInfo.get(1).toString()) == 0)//physical
        {
            
            //must cast it into an int
            //                    level                                                                        attack                                                                                defense                                         
            damage = (int)(((((2 * Integer.parseInt(opponentRawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * (Double.parseDouble(inBattleStats.get(7).toString()) *(Integer.parseInt(convertedStatsOpponent.get(1).toString())))) / (Integer.parseInt(convertedStats.get(2).toString()) * Double.parseDouble(inBattleStats.get(1).toString())))/50 + 2) * effectiveness(Integer.parseInt(moveInfo.get(1).toString()), Integer.parseInt(ownRawStats.get(0).toString())));
            ownhp -= damage;
        }
        else if(Integer.parseInt(moveInfo.get(1).toString()) == 1)//special
        {
            damage = (int)((((2 * Integer.parseInt(opponentRawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * (Integer.parseInt(convertedStatsOpponent.get(3).toString()) * Double.parseDouble(inBattleStats.get(9).toString()))/ (Integer.parseInt(convertedStats.get(4).toString()) * Double.parseDouble(inBattleStats.get(3).toString()))/50 + 2)) * effectiveness(Integer.parseInt(moveInfo.get(1).toString()), Integer.parseInt(ownRawStats.get(0).toString())));
            ownhp -= damage;
        }
		
		
		
        else if(Integer.parseInt(moveInfo.get(1).toString()) == 2)//status
        {
            // attack(0), defense(1), special attack(2), special defense(3), speed(4), accuracy(5), evasion(6), atkOpponent(7), defOpponent(8), specAtkOpponent(9), specDefOpponent(10), speedOpponent(11), accuracyOpponent(12), evasionOpponent(13)
			if(Integer.parseInt(moveInfo.get(5).toString()) >= 7 && Integer.parseInt(moveInfo.get(5).toString()) < 0)
			{
				indexOfStat = (Integer.parseInt(moveInfo.get(5).toString()) - 7);
			}
			else
			{
				indexOfStat = Integer.parseInt(moveInfo.get(5).toString());
			}
			//detecting changes
			if(Integer.parseInt(moveInfo.get(5).toString()) == 5 || Integer.parseInt(moveInfo.get(5).toString()) == 6 || Integer.parseInt(moveInfo.get(5).toString()) == 12 || Integer.parseInt(moveInfo.get(5).toString()) == 13)
			{
				for(int i  = 0; i<evanissesAndAccuracy.length; i++)
				{
					if(evanissesAndAccuracy[i] == inBattleStats.get(indexOfStat))
					{
						currentStatIndex = i;
					}
				}
				inBattleStats.set(indexOfStat, stats[(currentStatIndex + moveInfo.get(5))]);
			}
			else{
				for(int i = 0; i<stats.length; i++)
				{
					if(stats[i] == inBattleStats.get(indexOfStat))
					{
						currentStatIndex = i;
					}
				
				}
				//putting check to not exceed index
				if((currentStatIndex + moveInfo.get(5))< 0)
					
				{
					statIndex = 0;
				}
				else if((currentStatIndex + moveInfo.get(5))> 12)
				{
					statIndex = 12;
				}
				else
				{
					statIndex = currentStatIndex + moveInfo.get(5);
				}
				inBattleStats.set(indexOfStat, stats[statIndex]);
			}
    }
}
}

  

