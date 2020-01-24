import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Main
{
	static int size = 0; //this is needed for trapdoor implementation
    static final Scanner input = new Scanner(System.in);
    static boolean isMovable;
  
    public static void main(String args[]) { 
        print("[?] How big would you like the map to be?\n[?] Enter a size from 5 to 30.\n[Note] You should keep in mind that having a smaller map does not mean the game will be easier.");
		size = input.nextInt();
				
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
                    Pokemon.addPoke(Pokemon.getWildPokeRawStats(0, 5));
                    pickedPokemon = "Bulbasaur";
                    break;
                // Charmander
                case 2:
                    Pokemon.addPoke(Pokemon.getWildPokeRawStats(3, 5));
                    pickedPokemon = "Charmander";
                    break;
                // Squirtle
                case 3:
                    Pokemon.addPoke(Pokemon.getWildPokeRawStats(6, 5));
                    pickedPokemon = "Squirtle";
                    break;
                default:
                    print("[Note] That is not a valid pokemon, please try again.");
                    break;
            }
        }

        print("[Note] You have bonded with " + pickedPokemon + "!");
        print("[Note] It is your task now to become strong enough to defeat the first gym.");
        print("[Note] You are now able to navigate the map.");

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
                print("[Note] You are carrying the following items");                
                game.printBag();
            } else if(command.equals("use")) {
                // I'm going to apologize for the nesting beforehand. Sorry.
                
                print("[?] What item would you like to use?");
                game.printBag();
                print("[?] Enter the number of the item.");  

                int toUse = input.nextInt(); 

                // We can only use an item that is in the bag, which means the number has to be lower than the size of the bag and cannot be 0.
                if(toUse > Room.bag.size() || toUse == 0) {
                    print("[Note] Could not find the item to use.");
                }else {
                    String item = Room.bag.get(toUse - 1);             
                    
                    // Users are only able to use revives and potions
                    if(item.equalsIgnoreCase("potion") || item.equalsIgnoreCase("revive")) {
                        print("[Note] Which pokemon would you like to use the " + item + " on?");                
                        Pokemon.printPokemon();
                        print("[?] Enter the number of the pokemon.");  

                        int pokemonNumber = input.nextInt();

                        // Pokemon number cannot be more than the amount of pokemon the user has.
                        if(pokemonNumber <= Pokemon.obtainedPokemonStats.size() && pokemonNumber > 0) {
                            // Apply the item
                            item = item.toLowerCase();

                            int index = pokemonNumber - 1;
                            ArrayList<Integer> pokemon = Pokemon.obtainedPokemonStats.get(index);
                            ArrayList<Integer> raw = Pokemon.convertToStats(pokemon);
                            int currentHealthPoints = Pokemon.hpOfPokes.get(index);
                            switch(item) {
                                case "potion":
                                    // Check if the pokemon is dead.
                                    if(currentHealthPoints > 0) {
                                        int maxHealthPoints = raw.get(0);
                                        
                                        int newHealthPoints = 0;
                                        if(currentHealthPoints + 20 > maxHealthPoints) {
                                            newHealthPoints = maxHealthPoints;
                                        } else {
                                            newHealthPoints = currentHealthPoints + 20;
                                        }

                                        Pokemon.setCurrenthp(index, newHealthPoints);
                                        Room.bag.remove(toUse - 1);
                                        print("[Note] You successfully used the potion!");
                                    } else print("[Note] You cannot use a potion on a dead pokemon.");
                                    break;
                                case "revive":
                                    // Check if the pokemon is dead
                                    if(currentHealthPoints <= 0) {
                                        Pokemon.setCurrenthp(index, 1);
                                        Room.bag.remove(toUse - 1);
                                        print("[Note] You successfully used the revive!");
                                    } else print("[Note] You can only use a revive on a dead pokemon.");
                                    break;
                                default:
                            }
                        } else {
                            print("[Note] Could not find the specified pokemon.");
                        }

                        // potion - Add healthpoints to a pokemon, pokemon can not be dead.  
                        // revive - Add 1 to the healthpoints, only if the pokemon is dead.
                    } else {
                        print("[Note] This item is not usable.");
                    }
                }
            } else if(command.equals("drop")) {
                print("[?] What item would you like to drop?");
                game.printBag();
                print("[?] Enter the number of the item.");

                int toDrop = input.nextInt();
                if(toDrop > Room.bag.size() || toDrop == 0) {
                    print("[Note] Could not find the item to drop.");
                } else {
                    print("[Note] Are you sure? This action is irreversible.");
                    String confirm = input.next();

                    if(confirm.equalsIgnoreCase("yes")) {
                        Item.drop(toDrop);
                    }else print("[Note] You did not drop the item.");    
                }
            } else if(command.equals("back")) {
                print("[Note] You were moved back to your previous position.");
                game.back();  
            } else if (command.equals("pokemon")){
                print("[Note] You are carrying the following pokemon");                
                Pokemon.printPokemon();
            } else if(command.equals("menu")) {
                print("[Note] What would you like to do?");
                print("> Resume");
                print("> About");
                print("> Quit");

                String action = input.next();
                if(action.equalsIgnoreCase("resume")) {
                    print("[Note] Game was resumed.");
                }else if(action.equalsIgnoreCase("about")) {
                    print("[Note] This game was created by Kevin and Martijn for a schoolproject.");
                }else if(action.equalsIgnoreCase("quit")) {
                    System.exit(0);
                }
            } else {
                print("Could not find the command \"" + command + "\".");
            }
            // game.printCoordinates();
        }    
    }
    
    public static void print(String message) {
        System.out.println(message);
    }
}
