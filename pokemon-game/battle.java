import java.util.ArrayList;
import java.util.Scanner;
public class Battle
{
    double[] stats = {0.25, 0.286, 0.333, 0.4, 0.5, 0.666, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};
    double[] evanissesAndAccuracy = {0.333, 0.375, 0.428, 0.5, 0.6, 0.75, 1.0, 1.333, 1.666, 2.0, 2.333, 2.666, 3.0};
    ArrayList<Integer> generatedOponentRaw = new ArrayList<Integer>();
    ArrayList<Integer> statsOfOpponent = new ArrayList<Integer>();
    int r;
    static ArrayList<Integer> movesetSelfCopy = new ArrayList<Integer>();
    int maxLevel;
	boolean hasItem;
    int wildPokeLevel;
    int currentStatIndex;
    int individualPokemonHp;
	boolean hasDeletedItem;
    int total;
    ArrayList ownConvertedStats = new ArrayList();
    int level;
    int damage;
    static ArrayList<ArrayList<ArrayList>> movesetSelf = new ArrayList<ArrayList<ArrayList>>();
    int statIndex;
    ArrayList<Integer> moveInfo = new ArrayList<Integer>();;
    int kindOfDmg;
    int ownhp;
    int type1;
    int type2;
    int inbattlePokemon;
    double modifier;
    ArrayList<ArrayList> movesetEnemy = new ArrayList<ArrayList>();
    double modifier2;
    ArrayList<Double> inBattleStats = new ArrayList<Double>();
    ArrayList<Integer> opponentConvertedStats = new ArrayList<Integer>();
    // attack(0), defense(1), special attack(2), special defense(3), speed(4), accuracy(5), evasion(6), atkOpponent(7), defOpponent(8), specAtkOpponent(9), specDefOpponent(10), speedOpponent(11), accuracyOpponent(12), evasionOpponent(13)
    int opponenthp;
    int indexOfStat;
    String action;
    int pickedMove;
    boolean choice;
    int tempSwitchIn;
    Scanner input = new Scanner(System.in);
    Battle()
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

    public boolean checkIfNotDead()
    {
        ownhp = 0;
        for(int i = 0; i < Pokemon.hpOfPokes.size(); i++)
        {
            if(Integer.parseInt(Pokemon.hpOfPokes.get(i).toString()) > ownhp)
            {
                ownhp = Integer.parseInt(Pokemon.hpOfPokes.get(i).toString());
            }
        }
        if(ownhp <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void theBattle(ArrayList opponentRawStats)
    {
		
        ArrayList<Integer> convertedStatsOpponent = new ArrayList<Integer>();
        opponentConvertedStats =  Pokemon.convertToStats(opponentRawStats);
        //initializing things for the battle
        for(int i = Pokemon.hpOfPokes.size() - 1; i >= 0; i--)
        {
            if(Integer.parseInt(Pokemon.hpOfPokes.get(i).toString()) != 0)
            {
                inbattlePokemon = i+1;
				
                individualPokemonHp = Integer.parseInt(Pokemon.hpOfPokes.get(i).toString());
            }
        }
        ownConvertedStats = Pokemon.convertToStats(Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1));

        opponenthp = Integer.parseInt(opponentConvertedStats.get(0).toString());
        
        while(checkIfNotDead() && opponenthp > 0)
        {
			System.out.println("what action will you do?");
            action = input.nextLine();

            if(action.equals("attack"))
            {
                //if you are faster
                if(Integer.parseInt(ownConvertedStats.get(5).toString()) >= Integer.parseInt(opponentConvertedStats.get(5).toString()))
                {

                    //attack by yourself
                    choice = false;
                    while(!choice)
                    {
                        System.out.println("what move will you do?(1 till " + movesetSelf.get(inbattlePokemon - 1).size() + ")");
                        pickedMove = input.nextInt() - 1;
                        if(pickedMove >= 0 && pickedMove < movesetSelf.get(inbattlePokemon - 1).size())
                        {
                            opponenthp -= attackBySelf(movesetSelf.get(inbattlePokemon - 1).get(pickedMove), Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1), ownConvertedStats, opponentRawStats, opponentConvertedStats);
                            if(opponenthp < 0)
							{
								opponenthp = 0;
							}
							System.out.println("the opponent has " + opponenthp + " hp remaining");
							choice = true;
                        }
                        else
                        {
                            System.out.println("Are you sure that is between 1 till " + movesetSelf.get(inbattlePokemon - 1).size() + "?");
                        }
                    }
                    if(opponenthp > 0 && Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) > 0)
                    {
                        Pokemon.hpOfPokes.set(inbattlePokemon - 1, (Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) - attackByEnemy(opponentRawStats, Pokemon.obtainedPokemonStats.get(inbattlePokemon -1), opponentConvertedStats, ownConvertedStats)));
                        System.out.println("you have " + Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) + "hp remaining");
                       
                    }
                    else if(opponenthp <= 0)
                    {
                        System.out.println("You defeated the enemy");
						Pokemon.getXp(inbattlePokemon - 1, Integer.parseInt(opponentRawStats.get(1).toString()));
						Game.setItemNumber();
                    }
                    else if(Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) <= 0 && checkIfNotDead())
                    {
                        System.out.println("your pokemon is dead!");
                        System.out.println("you can switch the following pokemon in.");
                        for(int p = 0; p < Pokemon.hpOfPokes.size(); p++)
                        {
                            if(Integer.parseInt(Pokemon.hpOfPokes.get(p).toString()) >0)
                            {
                                System.out.println(p+ 1);
                            }
                        }
                        choice = true;
                        while(choice)
                        {
                            System.out.println("what pokemon do you want to switch in?");
                            tempSwitchIn = input.nextInt();
                            if(tempSwitchIn == inbattlePokemon)
                            {
                                System.out.println("that pokemon already is in battle!");
                            }
                            else if(tempSwitchIn <1 || tempSwitchIn -1 > Pokemon.hpOfPokes.size())
                            {
								System.out.println(Pokemon.hpOfPokes.size());
                                System.out.println("that is not a valid pokemon");
                            }
                            else if(Integer.parseInt(Pokemon.hpOfPokes.get(tempSwitchIn - 1).toString()) <= 0)
                            {
                                System.out.println("that pokemon is dead, you can't switch it in!");
                            }
                            else
                            {
                                inbattlePokemon = tempSwitchIn;
                                ownConvertedStats = Pokemon.convertToStats(Pokemon.obtainedPokemonStats.get(inbattlePokemon));

                            }
                        }

                    }
                    else{
                        System.out.println("game over");
						
                    }

                }
                // if opponent is faster
                else if(Integer.parseInt(ownConvertedStats.get(5).toString()) < Integer.parseInt(opponentConvertedStats.get(5).toString()))
                {
                    Pokemon.hpOfPokes.set(inbattlePokemon - 1, (Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) - attackByEnemy(opponentRawStats, Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1), opponentConvertedStats, ownConvertedStats)));
                    System.out.println("You have " + Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) + "hp remaining");
                    if(opponenthp > 0 && Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) > 0)
                    {
                        choice = false;
                        while(!choice)
                        {
							
                            System.out.println("what move will you do?(1 till " + (movesetSelf.get(inbattlePokemon - 1).size()) + ")");
                            pickedMove = input.nextInt() - 1;
							
                            if(pickedMove >= 0 && pickedMove < movesetSelf.get(inbattlePokemon - 1).size())
                            {
								
                               opponenthp -= attackBySelf(movesetSelf.get(inbattlePokemon - 1).get(pickedMove), Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1), ownConvertedStats, opponentRawStats, opponentConvertedStats);
								  if(opponenthp < 0)
							{
								opponenthp = 0;
							}
								  System.out.println("the opponent has " + opponenthp + "hp remaining");
                                choice = true;
                            }
                            else
                            {
                                System.out.println("Are you sure that is between 1 till " + movesetSelf.get(inbattlePokemon).size() + "?");
                            }
                        }
                    }
                    else if(opponenthp <= 0)
                    {
                        System.out.println("You defeated the enemy");
						Pokemon.getXp(inbattlePokemon - 1, Integer.parseInt(opponentRawStats.get(1).toString()));
						Game.setItemNumber();
                    }
                    else if(Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) <= 0 && checkIfNotDead())
                    {
                        System.out.println("your pokemon is dead!");
                        System.out.println("you can switch the following pokemon in.");
                        for(int p = 0; p < Pokemon.hpOfPokes.size(); p++)
                        {
                            if(Integer.parseInt(Pokemon.hpOfPokes.get(p).toString()) >0)
                            {
                                System.out.println(p);
                            }
                        }
						choice = true;
                        while(choice)
                    {
						System.out.println(Pokemon.hpOfPokes.size());
                        System.out.println("what pokemon do you want to switch in?");
                        tempSwitchIn = input.nextInt();
                        if(tempSwitchIn == inbattlePokemon)
                        {
                            System.out.println("that pokemon already is in battle!");
                        }
                        else if(tempSwitchIn <1 || tempSwitchIn > Pokemon.hpOfPokes.size() +1)
                        {
							System.out.println(inbattlePokemon);
                            System.out.println("that is not a valid pokemon");
							
                        }
                        else if(Integer.parseInt(Pokemon.hpOfPokes.get(tempSwitchIn - 1).toString()) <= 0)
                        {
                            System.out.println("that pokemon is dead, you can't switch it in!");
                        }
                        else
                        {
							
                            inbattlePokemon = tempSwitchIn;
                            ownConvertedStats = Pokemon.convertToStats(Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1));
                             
							choice = false;
							System.out.println("that pokemon got switched in");
						}

                    }
                    

                }
				else
                    {
                        System.out.println("game over");
                        //set boolean to false or something

                    }
				}
			}
                else if(action.equals("switch") && (Pokemon.hpOfPokes.size() != 1))
                {
					
						choice = true;
                    
                    while(choice)
                    {
						
                        System.out.println("what pokemon do you want to switch in?");
                        tempSwitchIn = input.nextInt();
                        if(tempSwitchIn == inbattlePokemon)
                        {
                            System.out.println("that pokemon already is in battle!");
							choice = false;
                        }
                        else if(tempSwitchIn <1 || tempSwitchIn > Pokemon.hpOfPokes.size() +1)
                        {
							
                            System.out.println("that is not a valid pokemon");
                        }
                        else if(Integer.parseInt(Pokemon.hpOfPokes.get(tempSwitchIn - 1).toString()) <= 0)
                        {
                            System.out.println("that pokemon is dead, you can't switch it in!");
                        }
                        else
                        {
							
                            inbattlePokemon = tempSwitchIn;
                            ownConvertedStats = Pokemon.convertToStats(Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1));
                            Pokemon.hpOfPokes.set(inbattlePokemon - 1, (Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon -1).toString()) - attackByEnemy(opponentRawStats, Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1), opponentConvertedStats, ownConvertedStats)));
                            System.out.println("you have " + Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) + "hp remaining");
							choice = false;
						}
                    }

                }
				else if (Pokemon.hpOfPokes.size() == 1 && action.equals("switch"))
				{
					System.out.println("you can't switch yet since you only have 1 pokemon.");
				}
				else if(action.equals("catch"))
				{
					hasItem = false;
					
						if(Room.bag.contains("Poke Ball"))
						{
							hasItem = true;
							
						}
						
					if(Room.getRandomNumber(1, 100) <= 50 && hasItem)
					{
						Pokemon.addPoke(opponentRawStats);
						System.out.println("you caught the pokemon!");
						for(int i = 0; i < Room.bag.size(); i++)
						{
							if(Room.bag.get(i).equals("Poke Ball") && hasDeletedItem)
							{
								Room.bag.remove(i);
								hasDeletedItem = false;
							}
						}
						opponenthp = 0;
						Game.setItemNumber();
					}
					else if(hasItem)
					{
						hasDeletedItem = true;
						for(int i = 0; i < Room.bag.size(); i++)
						{
							if(Room.bag.get(i).equals("Poke Ball") && hasDeletedItem)
							{
								Room.bag.remove(i);
								hasDeletedItem = false;
							}
						}
						System.out.println("The pokemon broke free!");
						
					}
					else
					{
						System.out.println("you do not have any poké balls...");
					}
						
				}
            }
        }
    

    public boolean hitOrMiss(int accuracy)
    {
        if(Room.getRandomNumber(1, 100) <= accuracy * (Double.parseDouble(inBattleStats.get(5).toString()) / Double.parseDouble(inBattleStats.get(13).toString())))
        {

            return true;
        }
        else
        {
            System.out.println("you missed!");
            return false;
        }
    }

    public boolean hitOrMissEnemy(int accuracy)
    {
        if(Room.getRandomNumber(1, 100) <= accuracy * (Double.parseDouble(inBattleStats.get(12).toString()) / Double.parseDouble(inBattleStats.get(6).toString())))
        {
            return true;
        }
        else
        {
            System.out.println("the enemy missed!");
            return false;
        }
    }

    public int attackBySelf(ArrayList moveInfo, ArrayList rawStats, ArrayList convertedStats, ArrayList rawStatsOpponent, ArrayList convertedStatsOpponent)
    {
        kindOfDmg = Integer.parseInt(moveInfo.get(1).toString());
        if(kindOfDmg == 0)//physical
        {            
            if(hitOrMiss(Integer.parseInt(moveInfo.get(2).toString())))
            {

                damage = (int)((((2 * Integer.parseInt(rawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * Integer.parseInt(convertedStats.get(1).toString()) / Integer.parseInt(convertedStatsOpponent.get(2).toString())) / 50 + 2) * effectiveness(Integer.parseInt(moveInfo.get(3).toString()), Integer.parseInt(rawStatsOpponent.get(0).toString())));
                //idk why but this might fix a bug
                System.out.println("You did " + damage + "damage!");
                return damage;
            }
        }
        else if(kindOfDmg == 1)//special
        {
            if(hitOrMiss(Integer.parseInt(moveInfo.get(2).toString())))
            {
                damage = (int)((((2 * Integer.parseInt(rawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * Integer.parseInt(convertedStats.get(3).toString()) / Integer.parseInt(convertedStatsOpponent.get(4).toString())) / 50 + 2) * effectiveness(Integer.parseInt(moveInfo.get(3).toString()), Integer.parseInt(rawStatsOpponent.get(0).toString())));
                System.out.println("You did " + damage + "damage!");
                return damage;
            }
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
				System.out.println("you did a status attack");
                if(hitOrMiss(Integer.parseInt(moveInfo.get(2).toString())))
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
        return 0; //ERROR
    }

    public int attackByEnemy(ArrayList opponentRawStats, ArrayList ownRawStats, ArrayList convertedStatsOpponent, ArrayList convertedStats)
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
        for(int w = r - 1;w >= 0; w--) 
        {

            if(movesetEnemy.size() < 4)
            {
                movesetEnemy.add(Pokemon.learnset[Integer.parseInt(opponentRawStats.get(0).toString())][w]);
				
            }

        }
		
        moveInfo = movesetEnemy.get(Room.getRandomNumber(0, movesetEnemy.size() - 1));

        if(Integer.parseInt(moveInfo.get(1).toString()) == 0)//physical
        {

            //must cast it into an int
            //                    level   			attack                                                                                defense                                         
            if(hitOrMissEnemy(Integer.parseInt(moveInfo.get(2).toString())))
            {
                damage = (int)(((((2 * Integer.parseInt(opponentRawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * (Double.parseDouble(inBattleStats.get(7).toString()) *(Integer.parseInt(convertedStatsOpponent.get(1).toString())))) / (Integer.parseInt(convertedStats.get(2).toString()) * Double.parseDouble(inBattleStats.get(1).toString())))/50 + 2) * effectiveness(Integer.parseInt(moveInfo.get(3).toString()), Integer.parseInt(ownRawStats.get(0).toString())));
                System.out.println("the oppenent did " + damage + "damage!");
                return damage;
            }
        }
        else if(Integer.parseInt(moveInfo.get(1).toString()) == 1)//special
        {
            if(hitOrMissEnemy(Integer.parseInt(moveInfo.get(2).toString())))
            {
                damage = (int)((((2 * Integer.parseInt(opponentRawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * (Integer.parseInt(convertedStatsOpponent.get(3).toString()) * Double.parseDouble(inBattleStats.get(9).toString()))/ (Integer.parseInt(convertedStats.get(4).toString()) * Double.parseDouble(inBattleStats.get(3).toString()))/50 + 2)) * effectiveness(Integer.parseInt(moveInfo.get(3).toString()), Integer.parseInt(ownRawStats.get(0).toString())));
                System.out.println("the oppenent did " + damage + "damage!");
                return damage;
            }
        }

        else if(Integer.parseInt(moveInfo.get(1).toString()) == 2)//status
        {
			System.out.println("The enemy did a status attack");
            if(hitOrMissEnemy(Integer.parseInt(moveInfo.get(2).toString())))
            {
                // attack(0), defense(1), special attack(2), special defense(3), speed(4), accuracy(5), evasion(6), atkOpponent(7), defOpponent(8), specAtkOpponent(9), specDefOpponent(10), speedOpponent(11), accuracyOpponent(12), evasionOpponent(13)
                if(Integer.parseInt(moveInfo.get(5).toString()) >= 7 && Integer.parseInt(moveInfo.get(5).toString()) < 0)
                {
                    indexOfStat = (Integer.parseInt(moveInfo.get(4).toString()) - 7);
                }
                else
                {
                    indexOfStat = Integer.parseInt(moveInfo.get(4).toString());
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
					//try & catch used to be here
                    inBattleStats.set(indexOfStat, stats[(currentStatIndex + moveInfo.get(5))]);
				
                }
                else{
                    for(int i = 0; i<stats.length; i++)
                    {
						// try & catch used to be here before
                        if(stats[i] == Double.parseDouble(inBattleStats.get(indexOfStat).toString()))
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
					try
					{
                    inBattleStats.set(indexOfStat, stats[statIndex]);
					}
					catch(IndexOutOfBoundsException e)
					{ 
					System.out.println("that stat could not be changed anymore");
                }
            }
        }
        
    }
	return 0;
	}

    public void testBattle()
    {
		
        Pokemon.addPoke(Pokemon.getWildPokeRawStats(75, 5));
		
		Pokemon.addPoke(Pokemon.getWildPokeRawStats(12, 1));
        
        theBattle(Pokemon.getWildPokeRawStats(1, 1));
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
	
    }
    public void testBattle2()
    {
       
       
        System.out.println(Pokemon.pokemon[75]);
        theBattle(Pokemon.getWildPokeRawStats(1, 1));
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
		Pokemon.getXp(1 - 1, 70);
	
    }
    public static void main(String args[])
    {
		
       Battle b = new Battle();
	   
	   b.testBattle();
	   b.testBattle2();
    }
}

