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
}
