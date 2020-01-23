import java.util.ArrayList;
import java.util.Random;
//only interaction with class Pokemon is to display message of poke at the moment
// random must be imported. should generate numbers.
public class Room
{
    public static ArrayList<String> bag = new ArrayList<String> ();
    int contentNumber;
    
    public static int getRandomNumber(int min, int max) 
    {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String message(int number){
       
        switch(number)
        {
            case 1:
                return "you are in a big open field with a lot of grass";
            case 2:
                return "you are in a dark cave with water dripping down somewhere. It is a really constant noise.";
            case 3:
                return "you are in a forrest, the trees are huge, it makes you feel small";
            case 4:
                return "you are in a vulcano, it is really hot here. Lava is flowing at some places.";
            default:
                return "there is nothing here, if you see this, it's a bug.";
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
                addItemToBag(roomInfo, itemNumber);
                return "Something is shining in the corner, it is a " + Item.get_Item_In_Room(itemNumber) + "!";
            case 1:
                return "Something is shining in the corner, it is the pokemon " + Pokemon.getPokemon(itemNumber) + "!";
            case 2:
                return "There seems to be nothing inside this room.";
            default:
                return "there is nothing in this room";
        }
    }
    
    public static void addItemToBag(int roomInfo, int itemNumber)
    {
        bag.add(Item.get_Item_In_Room(itemNumber));
        game.rooms.get(roomInfo).set(3, 2);
        game.rooms.get(roomInfo).set(4, -1);
    }
}





