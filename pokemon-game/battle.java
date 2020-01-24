import java.util.ArrayList;
import java.util.Scanner;
public class Battle
{
	/**
	deze klasse doet alles wat binnen een battle gebeurt. Onder andere het vangen, berekenen van schade en kiezen van moves.
	**/
    double[] stats = {0.25, 0.286, 0.333, 0.4, 0.5, 0.666, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};
    double[] evanissesAndAccuracy = {0.333, 0.375, 0.428, 0.5, 0.6, 0.75, 1.0, 1.333, 1.666, 2.0, 2.333, 2.666, 3.0};
    ArrayList<Integer> generatedOponentRaw = new ArrayList<Integer>();
    int r;
	boolean hasItem;
    int currentStatIndex;
    int individualPokemonHp;
	boolean hasDeletedItem;
    static int total;
    ArrayList ownConvertedStats = new ArrayList();
    static int level;
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
	/**
	@author Kevin
	De constructor maakt een ArrayList voor statistieken in de battle zelf aan. om te beginnen hebben ze allemaal 1.0 maar gedurende de battle verandert dat.
	**/
    Battle()
    {
        for(int i = 0; i <= 14; i++)
        {
            inBattleStats.add(1.0);
        }

    }

/** 
berekent de effectiviteit van moves. De types worden met behulp van de index van de pokemon opgehaald.
@author Kevin
@param type_move, de index van de pokemon
@return double
**/
   
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
	/**
	@author kevin
	Deze methode wordt gebruikt om het level van wilde pokemons te berekenen.
	@return int level
	**/
    public static int generateLevel()
    {
        for(int i = 0; i < Pokemon.obtainedPokemonStats.size(); i++)
        {
            total += Pokemon.obtainedPokemonStats.get(i).get(1);
        }
        level = total / Pokemon.obtainedPokemonStats.size();
        return level;
    }

   
    //kindOfDmg is physical, special or status. respectively 0, 1 and 2

/**
Deze methode wordt gebruikt om te kijken of een speler niet game-over is.
@author Kevin
@return boolean
**/
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
/**
In deze methode vindt de battle plaats. berekenen van je eigen hp door middel van andere methodes gebeurt hier. Je kan hier ook moves kiezen, pokemons switchen en pokemons vangen.
@author Kevin
@param ArrayList opponentRawStats

**/
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
			System.out.println("[?] What will you do?");
			if(!Room.gymBattle)
			{
				System.out.println("> Attack\n> Switch\n> Catch");
			}
			else
			{
				System.out.println("> Attack\n> Switch");
			}
            action = input.next();

            if(action.equals("attack"))
            {
                //if you are faster
                if(Integer.parseInt(ownConvertedStats.get(5).toString()) >= Integer.parseInt(opponentConvertedStats.get(5).toString()))
                {
                    //attack by yourself
                    choice = false;
                    while(!choice)
                    {
                        System.out.println("[?] What move will you perform?");
                        Main.print("[?] Enter a number from 1 to " + movesetSelf.get(inbattlePokemon - 1).size() + ".");
                        pickedMove = input.nextInt() - 1;
                        if(pickedMove >= 0 && pickedMove < movesetSelf.get(inbattlePokemon - 1).size())
                        {
                            opponenthp -= attackBySelf(movesetSelf.get(inbattlePokemon - 1).get(pickedMove), Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1), ownConvertedStats, opponentRawStats, opponentConvertedStats);
                            if(opponenthp < 0)
							{
								opponenthp = 0;
							}
							System.out.println("[Battle] Opponent has " + opponenthp + "hp remaining.");
							choice = true;
                        }
                        else
                        {
                            System.out.println("[Note] Are you sure that is between 1 to " + movesetSelf.get(inbattlePokemon - 1).size() + "?");
                        }
                    }
                    if(opponenthp > 0 && Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) > 0)
                    {
						ownhp = (Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) - attackByEnemy(opponentRawStats, Pokemon.obtainedPokemonStats.get(inbattlePokemon -1), opponentConvertedStats, ownConvertedStats));
                        if(ownhp < 0)
						{
							ownhp = 0;
						}
						Pokemon.hpOfPokes.set(inbattlePokemon - 1, (ownhp));
                        System.out.println("[Battle] You have " + Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) + "hp remaining.");
                        if(!checkIfNotDead())
                        {
                            System.out.println("[Loser] Game over...");
                            System.exit(0);
                        }
					}
                    else if(opponenthp <= 0)
                    {
                        System.out.println("[Battle] You won the fight!");
						Pokemon.getXp(inbattlePokemon - 1, Integer.parseInt(opponentRawStats.get(1).toString()));
						Game.setItemNumber();
                    }
                    else if(Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) <= 0 && checkIfNotDead())
                    {
                        System.out.println("[Battle] Your pokemon has died!");
                        System.out.println("[?] You can switch in another pokemon.");
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
                            System.out.println("[?] What pokemon would you like to switch in?");
                            tempSwitchIn = input.nextInt();
                            if(tempSwitchIn == inbattlePokemon)
                            {
                                System.out.println("[Note] This pokemon is already in battle!");
                            }
                            else if(tempSwitchIn <1 || tempSwitchIn -1 > Pokemon.hpOfPokes.size())
                            {
								System.out.println(Pokemon.hpOfPokes.size());
                                System.out.println("[Note] This is not a valid pokemon.");
                            }
                            else if(Integer.parseInt(Pokemon.hpOfPokes.get(tempSwitchIn - 1).toString()) <= 0)
                            {
                                System.out.println("[Note] You cannot use a dead pokemon!");
                            }
                            else
                            {
                                inbattlePokemon = tempSwitchIn;
                                ownConvertedStats = Pokemon.convertToStats(Pokemon.obtainedPokemonStats.get(inbattlePokemon));

                            }
                        }

                    }
                    else{
                        System.out.println("[Loser] Game over..");
						System.exit(0);
                    }

                }
                // if opponent is faster
                else if(Integer.parseInt(ownConvertedStats.get(5).toString()) < Integer.parseInt(opponentConvertedStats.get(5).toString()))
                {
                    ownhp = (Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) - attackByEnemy(opponentRawStats, Pokemon.obtainedPokemonStats.get(inbattlePokemon -1), opponentConvertedStats, ownConvertedStats));
                        if(ownhp < 0)
						{
							ownhp = 0;
						}
						Pokemon.hpOfPokes.set(inbattlePokemon - 1, (ownhp));
                        System.out.println("[Battle] You have " + Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) + "hp remaining.");
                        if(!checkIfNotDead())
                        {
                            System.out.println("Game over...");
                            System.exit(0);
                        }
                    if(opponenthp > 0 && Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) > 0)
                    {
                        choice = false;
                        while(!choice)
                        {
						
                            System.out.println("[?] What move will you perform?");
                            Main.print("[?] Enter a number from 1 to " + movesetSelf.get(inbattlePokemon - 1).size() + ".");	
                            pickedMove = input.nextInt() - 1;
							
                            if(pickedMove >= 0 && pickedMove < movesetSelf.get(inbattlePokemon - 1).size())
                            {
								
                               opponenthp -= attackBySelf(movesetSelf.get(inbattlePokemon - 1).get(pickedMove), Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1), ownConvertedStats, opponentRawStats, opponentConvertedStats);
								  if(opponenthp < 0)
							{
								opponenthp = 0;
							}
    							System.out.println("[Battle] Opponent has " + opponenthp + "hp remaining.");
                                choice = true;
                            }
                            else
                            {
                                System.out.println("[Note] Are you sure that is between 1 to " + movesetSelf.get(inbattlePokemon - 1).size() + "?");
                            }
                        }
                    }
                    else if(opponenthp <= 0)
                    {
                        System.out.println("[Battle] You won the fight!");
						Pokemon.getXp(inbattlePokemon - 1, Integer.parseInt(opponentRawStats.get(1).toString()));
						Game.setItemNumber();
                    }
                    else if(Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) <= 0 && checkIfNotDead())
                    {
                        System.out.println("[Battle] Your pokemon has died!");
                        System.out.println("[?] You can switch in another pokemon.");
                        for(int p = 0; p < Pokemon.hpOfPokes.size(); p++)
                        {
                            if(Integer.parseInt(Pokemon.hpOfPokes.get(p).toString()) >0)
                            {
                                System.out.println(p);
                            }
                        }
						choice = true;
                        System.out.println("[?] What pokemon would you like to switch in?");
                        while(choice)
                    {

                        tempSwitchIn = input.nextInt();
                        if(tempSwitchIn == inbattlePokemon)
                        {
                            System.out.println("[Note] This pokemon is already in battle!");
                        }
                        else if(tempSwitchIn <1 || tempSwitchIn > Pokemon.hpOfPokes.size() +1)
                        {
							System.out.println(inbattlePokemon);
                            System.out.println("[Note] This is not a valid pokemon.");							
                        }
                        else if(Integer.parseInt(Pokemon.hpOfPokes.get(tempSwitchIn - 1).toString()) <= 0)
                        {
                            System.out.println("[Note] You cannot use a dead pokemon!");
                        }
                        else
                        {
							
                            inbattlePokemon = tempSwitchIn;
                            ownConvertedStats = Pokemon.convertToStats(Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1));
                             
							choice = false;
							System.out.println("[Note] You successfully switched your pokemon.");
						}

                    }
                    

                }
				else
                    {
                        System.out.println("[Loser] Game over...");
                        System.exit(0);

                    }
				}
			}
                else if(action.equals("switch") && (Pokemon.hpOfPokes.size() != 1))
                {
					
						choice = true;
                    
                    while(choice)
                    {
						
                        System.out.println("[?] What pokemon would you like to switch in?");
                        tempSwitchIn = input.nextInt();
                        if(tempSwitchIn == inbattlePokemon)
                        {
                            System.out.println("[Note] This pokemon is already in battle!");
							choice = false;
                        }
                        else if(tempSwitchIn <1 || tempSwitchIn > Pokemon.hpOfPokes.size() +1)
                        {
							
                            System.out.println("[Note] This is not a valid pokemon.");							
                        }
                        else if(Integer.parseInt(Pokemon.hpOfPokes.get(tempSwitchIn - 1).toString()) <= 0)
                        {
                            System.out.println("[Note] You cannot use a dead pokemon!");
                        }
                        else
                        {
							
                            inbattlePokemon = tempSwitchIn;
                            ownConvertedStats = Pokemon.convertToStats(Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1));
                            Pokemon.hpOfPokes.set(inbattlePokemon - 1, (Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon -1).toString()) - attackByEnemy(opponentRawStats, Pokemon.obtainedPokemonStats.get(inbattlePokemon - 1), opponentConvertedStats, ownConvertedStats)));
                            System.out.println("[Battle] You have " + Integer.parseInt(Pokemon.hpOfPokes.get(inbattlePokemon - 1).toString()) + "hp remaining.");
							choice = false;
						}
                    }

                }
				else if (Pokemon.hpOfPokes.size() == 1 && action.equals("switch"))
				{
					System.out.println("[Note] You can only switch pokemon when you have atleast two pokemon.");
				}
				else if(action.equals("catch"))
				{
					hasItem = false;
					
						if(Room.bag.contains("Poke Ball"))
						{
							hasItem = true;
							
						}
						
					if(Room.getRandomNumber(1, 100) <= 50 && hasItem && !Room.gymBattle)
					{
						Pokemon.addPoke(opponentRawStats);
						System.out.println("[Battle] Gotcha! You successfully caught the pokemon!");
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
					else if(hasItem && !Room.gymBattle)
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
						System.out.println("[Battle] The pokemon broke free!");
						
					}
					else if(Room.gymBattle)
					{
						System.out.println("[Battle] You cannot catch a pokemon that belongs to another trainer.");
					}
					else
					{
						System.out.println("[Note] You do not have any Poké Balls.");
					}
						
				}
            }
        }
    
/**
deze methode kijkt of een move van jezelf raakt of mist.
@author Kevin
@param accuracy de nauwkeurigheid wordt opgehaald uit een ArrayList
@return boolean false als  move mis is, en anders raak.
**/
    public boolean hitOrMiss(int accuracy)
    {
        if(Room.getRandomNumber(1, 100) <= accuracy * (Double.parseDouble(inBattleStats.get(5).toString()) / Double.parseDouble(inBattleStats.get(13).toString())))
        {

            return true;
        }
        else
        {
            System.out.println("[Battle] You missed!");
            return false;
        }
    }
/**
deze methode kijkt of een move van de vijand raakt of mist.
@author Kevin
@param accuracy de nauwkeurigheid wordt opgehaald uit een ArrayList
@return boolean false als  move mis is, en anders raak.
**/
    public boolean hitOrMissEnemy(int accuracy)
    {
        if(Room.getRandomNumber(1, 100) <= accuracy * (Double.parseDouble(inBattleStats.get(12).toString()) / Double.parseDouble(inBattleStats.get(6).toString())))
        {
            return true;
        }
        else
        {
            System.out.println("[Battle] Opponent missed!");
            return false;
        }
    }

/**
Berekent de schade of de verandering van status op de vijand met behulp van de move en andere stats. 
@author Kevin
@param moveinfo, rawstats, convertedstats, opponentrawstats, opponentcovertedstats
@return int schades
**/
    public int attackBySelf(ArrayList moveInfo, ArrayList rawStats, ArrayList convertedStats, ArrayList rawStatsOpponent, ArrayList convertedStatsOpponent)
    {
        kindOfDmg = Integer.parseInt(moveInfo.get(1).toString());
        if(kindOfDmg == 0)//physical
        {            
            if(hitOrMiss(Integer.parseInt(moveInfo.get(2).toString())))
            {
				//damage = ((((((2*ownLevel)/5)+2)*movePower * ownAttack / ownDefence)/50)+2)*effectiveness
                damage = (int)((((2 * Integer.parseInt(rawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * Integer.parseInt(convertedStats.get(1).toString()) / Integer.parseInt(convertedStatsOpponent.get(2).toString())) / 50 + 2) * effectiveness(Integer.parseInt(moveInfo.get(3).toString()), Integer.parseInt(rawStatsOpponent.get(0).toString())));
                //idk why but this might fix a bug
                System.out.println("[Battle] You did " + damage + "hp damage!");
                return damage;
            }
        }
        else if(kindOfDmg == 1)//special
        {
            if(hitOrMiss(Integer.parseInt(moveInfo.get(2).toString())))
            {
				//damage = ((((((2*enemylevel)/5)+2)*movePower * opponentSpecialAttack / ownSpecialDefence)/50)+2)*effectiveness
                damage = (int)((((2 * Integer.parseInt(rawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * Integer.parseInt(convertedStats.get(3).toString()) / Integer.parseInt(convertedStatsOpponent.get(4).toString())) / 50 + 2) * effectiveness(Integer.parseInt(moveInfo.get(3).toString()), Integer.parseInt(rawStatsOpponent.get(0).toString())));
                System.out.println("[Battle] You did " + damage + "hp damage!");
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
				System.out.println("[Battle] You did a status attack.");
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
/**
Berekent de schade of doet de verandering van status op de vijand met behulp van de move en andere stats. 
@author Kevin
@param opponentrawstats, opponentcovertedstats, rawstats, convertedstats
@return int schade
**/
    public int attackByEnemy(ArrayList opponentRawStats, ArrayList ownRawStats, ArrayList convertedStatsOpponent, ArrayList convertedStats)
    {

        
        //making moveset, learns a new move every 3 levels

        
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

            
               if(hitOrMissEnemy(Integer.parseInt(moveInfo.get(2).toString())))
            {
				//damage = ((((((2*enemylevel)/5)+2)*movePower * opponentAttack / ownDefence)/50)+2)*effectiveness
                damage = (int)(((((2 * Integer.parseInt(opponentRawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * (Double.parseDouble(inBattleStats.get(7).toString()) *(Integer.parseInt(convertedStatsOpponent.get(1).toString())))) / (Integer.parseInt(convertedStats.get(2).toString()) * Double.parseDouble(inBattleStats.get(1).toString())))/50 + 2) * effectiveness(Integer.parseInt(moveInfo.get(3).toString()), Integer.parseInt(ownRawStats.get(0).toString())));
                System.out.println("[Battle] Oppenent did " + damage + "hp damage!");
                return damage;
            }
        }
        else if(Integer.parseInt(moveInfo.get(1).toString()) == 1)//special
        {
            if(hitOrMissEnemy(Integer.parseInt(moveInfo.get(2).toString())))
            {
				//damage = ((((((2*enemylevel)/5)+2)*movePower * opponentSpecialAttack / ownSpecialDefence)/50)+2)*effectiveness
                damage = (int)((((2 * Integer.parseInt(opponentRawStats.get(1).toString()) / 5 + 2) * (Integer.parseInt(moveInfo.get(0).toString())) * (Integer.parseInt(convertedStatsOpponent.get(3).toString()) * Double.parseDouble(inBattleStats.get(9).toString()))/ (Integer.parseInt(convertedStats.get(4).toString()) * Double.parseDouble(inBattleStats.get(3).toString()))/50 + 2)) * effectiveness(Integer.parseInt(moveInfo.get(3).toString()), Integer.parseInt(ownRawStats.get(0).toString())));
                System.out.println("[Battle] Oppenent did " + damage + "hp damage!");
                return damage;
            }
        }

        else if(Integer.parseInt(moveInfo.get(1).toString()) == 2)//status
        {
			System.out.println("[Battle] Opponent did a status attack.");
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
                //detecting changes that already happened
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
						
                        if(stats[i] == Double.parseDouble(inBattleStats.get(indexOfStat).toString()))
                        {
                            currentStatIndex = i;
							
                        }
						

                    }
                    
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
	return 0; //when a status attack is done
	}
}

