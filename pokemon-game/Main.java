import java.util.Scanner;

public class Main
{
    static final Scanner input = new Scanner(System.in);
    static boolean isMovable;
    
    public static void main(String args[]) { 
        print("[?] How big would you like the map to be?\n[?] Enter a size from 5 to 30.\n[Note] You should keep in mind that having a smaller map does not mean the game will be easier.");

        int size = input.nextInt();
        Game game = new Game(size);

        // print("[Note] It is time for you to make your first few steps in this mythical world full of creatures.");
        // print("[Note] Your goal will be to defeat your first pokemon gym and obtain a badge.");
        print("[Note] It is time for you to pick your starter pokemon! Which will it be?");
        
        // Starter pokemons: Bulbasaur = 0, Charmander = 3, Squirtle = 6
        print("> 1 - Bulbasaur\n> 2 - Charmander \n> 3 - Squirtle");
        print("[?] Enter the number of the pokemon you would like to obtain.");

        String pickedPokemon = "";
        while(pickedPokemon == "") {
            int pokemon = input.nextInt();
            switch(pokemon) {
                // Bulbasaur
                case 1:
                    Pokemon.addPoke(Pokemon.getWildPokeRawStats(0, 1));
                    pickedPokemon = "Bulbasaur";
                    break;
                // Charmander
                case 2:
                    Pokemon.addPoke(Pokemon.getWildPokeRawStats(3, 1));
                    pickedPokemon = "Charmander";
                    break;
                // Squirtle
                case 3:
                    Pokemon.addPoke(Pokemon.getWildPokeRawStats(6, 1));
                    pickedPokemon = "Squirtle";
                    break;
                default:
                    print("[Note] That is not a valid pokemon, please try again.");
                    break;
            }
        }

        print("[Note] You have bonded with " + pickedPokemon + "!");
        print("[Note] It is your task now to become strong enough to defeat the first gym.");
        print("[Note] You can now navigate the map using the commands left, up, right, down.");
        
        // When the user is NOT in a battle it means he may roam the map freely, thus we need to be listening to commands.
        // We should think of something where we can detect if the user is within a battle, or a non-movable situation.
        isMovable = true;
        while(isMovable) {
            String command = input.next().toLowerCase();

            // Check if the user is in a battle, these only have a preset amount of commands
            // end check 

            if(command.equals("up")) {
                game.move(0, 1);
            } else if(command.equals("down")) {
                game.move(0, -1);
            } else if(command.equals("left")) {
                game.move(-1, 0);
            } else if(command.equals("right")) {
                game.move(1, 0);
            } else if(command.equals("bag")) {
                game.printBag();
            } else if (command.equals("pokemon")){
                // print user their pokemon
            }else {
                print("Could not find the command \"" + command + "\".");
            }
            // game.printCoordinates();
        }    
    }
    
    public static void print(String message) {
        System.out.println(message);
    }
}
