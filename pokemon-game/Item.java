import java.util.ArrayList;
public class Item
{
    static String retrievedItem;
    public static ArrayList<String> items;
    Item(){
        ArrayList<String> items = new ArrayList<String>();
        items.add("potion");
        items.add("revive");
        items.add("Poké Ball");
        items.add("key");
    }
    public static String get_Item_In_Room(int itemNumber)
    {
        ArrayList<String> items = new ArrayList<String>();
        items.add("potion");
        items.add("revive");
        items.add("Poké Ball");
        items.add("key");
        retrievedItem = items.get(itemNumber);
        return retrievedItem;
    }

    /**
        Method used to drop an item from the users inventory

        @param itemNumber the index - 1 position from the item in the inventory.
     */
    public static void drop(int itemNumber) {
        String item = Room.bag.get((itemNumber - 1));

        if(!item.equalsIgnoreCase("key")) {
            Room.bag.remove((itemNumber - 1));
            Main.print("[Note] You dropped the " + item + ".");
        } else Main.print("[Note] You cannot drop the key.");
    }
}
