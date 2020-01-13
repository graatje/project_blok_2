import java.util.Scanner;

public class Main
{
    static final Scanner input = new Scanner(System.in);
    static boolean isMovable;
    
    public static void main(String args[]) {        
        print("How big do you want the map to be? Enter a size from 5 to 30.");
        
        Integer size = input.nextInt();
        Game game = new Game(size);
                
        // Just for debugging; print room coordinates
        // game.printRooms();
        
        // When the user is NOT in a battle it means he may roam the map freely, thus we need to be listening to commands.
        // We should think of something where we can detect if the user is within a battle, or a non-movable situation.
        isMovable = true;
        while(isMovable) {
            String command = input.next().toLowerCase();
            switch(command) {
               case "up":
                game.move(0, 1);
                break;
               case "down":
                game.move(0, -1);
                break;
               case "left": 
                game.move(-1, 0);
                break;
               case "right":
                game.move(1, 0);
                break;
               case "bag":
                game.printBag();
                break;
               
               default:
                print("Could not find the command \"" + command + "\".");
            }
            // game.printCoordinates();
        }    
    }
    
    public static void print(String message) {
        System.out.println(message);
    }
}
