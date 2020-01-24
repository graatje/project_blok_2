import java.util.ArrayList;
import java.util.Random;
//only interaction with class Pokemon is to display message of poke at the moment
// random must be imported. should generate numbers.
public class Room
{
    public static ArrayList<String> bag = new ArrayList<String> ();
    int contentNumber;
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String message(int number){
       
        switch(number)
        {
            case 1:
                return "You are in a big open field with a lot of grass.";
            case 2:
                return "You are in a dark cave with water dripping down somewhere. It is a really constant noise.";
            case 3:
                return "You are in a forest, the trees are huge, it makes you feel small.";
            case 4:
                return "You are in a vulcano, it is really hot here. Lava is flowing at some places.";
            case 5:
                return "You have found the pokemon gym!";
			case 6:
				ArrayList<Integer> coordinates = new ArrayList<Integer>();
				Game.x = Room.getRandomNumber(0, Main.size);
				Game.y = Room.getRandomNumber(0, Main.size);
				coordinates.add(Game.x);
				coordinates.add(Game.y);
				Game.history.add(coordinates);
				return "it was a trap! you were teleported to somewhere in the map.test";
				
            default:
                return "There is nothing here, if you see this, you have found a bug.";
        }
    }
    
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
                    return "It seems that the key fits..\n[?] Would you like to enter the gym and start the final battle?";
                }else return "It seems to be locked.";
			case 4:
				ArrayList<Integer> coordinates = new ArrayList<Integer>();
				Game.x = Room.getRandomNumber(0, Main.size);
				Game.y = Room.getRandomNumber(0, Main.size);
				coordinates.add(Game.x);
				coordinates.add(Game.y);
				Game.history.add(coordinates);
				return "it was a trap! you were teleported to somewhere in the map.";
				
            default:
                return "There is nothing in this room.";
        }
    }
    
    public static void addItemToBag(int roomInfo, int itemNumber)
    {
        bag.add(Item.get_Item_In_Room(itemNumber));
        Game.rooms.get(roomInfo).set(3, 2);
        Game.rooms.get(roomInfo).set(4, -1);
    }
}





