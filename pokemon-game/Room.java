import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Hierin staan het meeste dat te maken heeft met de contents binnen een kamer.
 *
 * @author Kevin
 * @author Martijn
 */

//only interaction with class Pokemon is to display message of poke at the moment
// random must be imported. should generate numbers.
public class Room
{
	
	static Scanner input = new Scanner(System.in);
	static boolean gymBattle = false;
    public static ArrayList<String> bag = new ArrayList<String> ();
    int contentNumber;
    /**
     * Methode die een random nummer tussen een minimum en een maximum generate.
     *
     * @param min Dit is het minimum van het gegenereerde nummer.
     * @param max Dit is het maximum van het gegenereerde nummer.
     * @return Dit is een random int tussen het min en max.
     */
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /**
     * Methode die een story-message voor het spel returned.
     *
     * @param number Dit is de extra content nummer meegegeven binnen de data van een kamer.
     * @return Dit is een respectievelijke String.
     */
    public static String message(int number){
       
        switch(number)
        {
            case 1:
                return "[Story] You are in a big open field with a lot of grass.";
            case 2:
                return "[Story] You are in a dark cave with water dripping down somewhere. It is a really constant noise.";
            case 3:
                return "[Story] You are in a forest, the trees are huge, it makes you feel small.";
            case 4:
                return "[Story] You are in a vulcano, it is really hot here. Lava is flowing at some places.";
            case 5:
                return "[Note] You have found the pokemon gym!";
			case 6:
				ArrayList<Integer> coordinates = new ArrayList<Integer>();
				Game.x = Room.getRandomNumber(0, Main.size -1);
				Game.y = Room.getRandomNumber(0, Main.size - 1);
				
				coordinates.add(Game.x);
				coordinates.add(Game.y);
				Game.history.add(coordinates);
				return "[Story] You fell into a trap! You were teleported to a random location and feel disorientated.";
				
            default:
                return "There is nothing here, if you see this, you have found a bug.";
        }
    }
    
    /**
     * Methode die de type van de contentNumber geeft, mits deze is geinitaliseert.
     *
     * @param x (Optioneel) X locatie van de kamer.
     * @param y (Optioneel) X locatie van de kamer.
     * @return Dit is de respectievelijke String dat vastzit aan het contenttype van een kamer.
     */   
    public String roomContent(int x, int y)
    {
        switch(contentNumber)
        {
            case 0:
                return "pokemon";
            case 1:
                return "item";
            case 2:
                return "nothing";
			case 3:
				//implement trapdoor
				
				return "";
				
            default:
                //must have default due to not compiling otherwise
                return "nothing";
        }
        
    }

    /**
     * Methode die het tweede deel van de story-text genereert. (bv. item, pokemon, key etc.)
     * 
     * @param roomInfo Dit de index van de kamer waar het om draait.
     * @param contentNumber Dit is de content nummer gelinked aan de kamer.
     * @param itemNumber Dit is de item nummer gelinked aan de kamer.
     *
     * Een kamer heeft altijd een contentnummer en een itemnummer, itemnummer is afgesteld op het contentnummer.
     * @return String respectievelijk aan de contentNumber (en itemNumber)
     */
    public static String actionFromRoomContent(int roomInfo, int contentNumber, int itemNumber)
    {
        switch(contentNumber)
        {
            case 0:                
                return "Something is shining in the corner, it is a " + Item.get_Item_In_Room(itemNumber) + "!";
            case 1:
                return "Something is shining in the corner, it is the pokemon " + Pokemon.getPokemon(itemNumber) + "!";
            case 2:
                return "There seems to be nothing inside this room.";
            case 3:
                // If the user has a key in his inventory, start battle, if not, make him find the key.
                if(bag.contains("key")) {
                    System.out.println("It seems that the key fits..\n[?] Would you like to enter the gym and start the final battle?");
					
						if(input.nextLine().equals("yes"))
						{
							System.out.println("[Story] Large doors opened with a scraping sound.. Inside stands a person, with an impressing pokemon next to him. He says: 'What are you waiting for? Let's fight!'\n[Battle] The opponent sent out mewtwo!");
							
							gymBattle = true;
							
							Battle b = new Battle();
							
							 b.theBattle(Pokemon.endBossPokemon());
							 System.out.println("[Winner] Congratulations! You beat the gym!");
							 System.exit(0);
						}
						else
						{
							System.out.println("[Loser] Come back whenever you're ready.");
						}
                }else return "It seems to be locked.";
				return "";
			case 4:
				
				return "";
				
            default:
                return "There is nothing in this room.";
        }
    }

    /**
     * Methode die een item vanuit een kamer aan je inventares toevoegd
     * 
     * @param roomInfo Dit is de index van de kamer.
     * @param itemNumber Dit is het nummer van de item dat aan de inventaris toegevoegd moet worden.
     */
    public static void addItemToBag(int roomInfo, int itemNumber)
    {
        bag.add(Item.get_Item_In_Room(itemNumber));
        Game.rooms.get(roomInfo).set(3, 2);
        Game.rooms.get(roomInfo).set(4, -1);
    }
}





