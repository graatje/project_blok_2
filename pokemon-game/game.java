import java.util.ArrayList;
    public class Game
    {
        // pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev
        //discussion, do i need an id? isn't it stored in the index?
        //preparing variables
        int numberOfMovements;
        //define int n = 1 if bug
       static int x;
       static int y;
        int thesize;
        String resultMessage;
        int roomType;
        static ArrayList<ArrayList<Integer> > history = new ArrayList<ArrayList<Integer> >();
        public static ArrayList<ArrayList<Integer> > rooms = new ArrayList<ArrayList<Integer> >();
        
        //constructor
       Game(int size){
        if (size < 4 || size > 30) 
        {
            throw new IllegalArgumentException("size must be between 4 and 30");
        }
        
        //generate rooms
        // Location of the key (key cannot be found on the borders)
        ArrayList<Integer> keyLocation = new ArrayList<Integer>();
        keyLocation.add(Room.getRandomNumber(1, size - 1));
        keyLocation.add(Room.getRandomNumber(1, size - 1));
        for(int ysize = 0; ysize < size; ysize++)
        {
            for(int xsize = 0; xsize < size; xsize++)
            {
                ArrayList<Integer> roomInfo = new ArrayList<Integer>();
                roomInfo.add(xsize);
                roomInfo.add(ysize);

                if(ysize == (size - 1) && xsize == (size - 1)) {
                    // Location of gym
                    roomInfo.add(5);
                    roomInfo.add(3);
                } else if(ysize == (keyLocation.get(1) - 1) && xsize == (keyLocation.get(0) - 1)) {
                    // Location of key, we have to make sure the roomtype is 0 here so there must be an item spawned
                    roomInfo.add(Room.getRandomNumber(1, 4));
                    roomInfo.add(0); 
                } else {
                    roomInfo.add(Room.getRandomNumber(1, 4));//roomtype
                    roomInfo.add(Room.getRandomNumber(0, 2)); //content type
                }

                if(roomInfo.get(3) == 0)
                {
                    if(ysize == (keyLocation.get(1) - 1) && xsize == (keyLocation.get(0) - 1)) {
                        // Location of key
                        roomInfo.add(3);
                    }else roomInfo.add(Room.getRandomNumber(0, 2));//item type
                }
                else if(roomInfo.get(3) == 1)
                {
                    roomInfo.add(Room.getRandomNumber(0, 149)); //pokemon
                }
                else
                {
                    roomInfo.add(-1); //something has to be entered because you will get an out of range error otherwise.
                }
                rooms.add(roomInfo);
                // the arraylist will be like x coordinate, y coordinate, roomtype int, content type int, specific content type int
            }
			
			
        }
		int trapdoorX = Room.getRandomNumber(1, size);// cant replace gym, so thats why -1
		int trapdoorY = Room.getRandomNumber(1, size);
		while(trapdoorX == Integer.parseInt(keyLocation.get(0).toString()) && trapdoorY == Integer.parseInt(keyLocation.get(1).toString()) && (trapdoorX == size - 1 && trapdoorY == size-1))
		{
			trapdoorX = Room.getRandomNumber(1, size);
			trapdoorY = Room.getRandomNumber(1, size);
		}
		System.out.println("trapdoor");
		System.out.println(trapdoorX);
		System.out.println(trapdoorY);
		for(int i = 0; i < rooms.size(); i++)
			{ 
				if(rooms.get(i).get(0) == trapdoorX && rooms.get(i).get(1) == trapdoorY)
				{
					rooms.get(i).set(3, 4);
					rooms.get(i).set(2, 6);
				}
        }
    
        //setting up variables
        numberOfMovements = 0;
        thesize = size;
        x = 0;
        y = 0;
        ArrayList<Integer> coordinates = new ArrayList<Integer>();
        // adding starting point to variables
        coordinates.add(x);
        coordinates.add(y);
        history.add(coordinates);
    }
    public void printBag()
    {
        for(int i = 0; i < Room.bag.size(); i++)
        {
            String item = Room.bag.get(i);
            item = item.substring(0, 1).toUpperCase() + item.substring(1);
            Main.print("> " + (i + 1) + " - " + item);
        }
    }
    public void printRooms() //developer only
        {
        for(int i = 0; i < rooms.size(); i++)
        {
            for(int j = 0; j < rooms.get(i).size(); j++)
            {
                System.out.print(rooms.get(i).get(j) + " ");
            }
        }
    }
    
    public void printHistory() //developer only
    {
        for(int i = 0; i < history.size(); i++)
        {
            for(int j = 0; j < history.get(i).size(); j++)
            {
                System.out.print(history.get(i).get(j) + " ");
            }
        }
    }
    
    private void printRoomMessage(int x, int y) //gives message after entering a room
    {
        for(int i = 0; i < rooms.size(); i++)
        {
            //checks if coordinates matches 1 of the rooms, if it does, (which should always be the case) a message will be shown. 
           if(rooms.get(i).get(0) == x && rooms.get(i).get(1) == y)
           {
                int contentNumber = rooms.get(i).get(3);
                int itemNumber = rooms.get(i).get(4);

                Main.print(Room.message(rooms.get(i).get(2)) + " " + Room.actionFromRoomContent(i, contentNumber, itemNumber));

                // Check if the user can pick the item up.
                if(contentNumber == 0) {
                    Main.print("[?] Would you like to pick this item up?");
                    String answer = Main.input.next();
                    if(answer.equalsIgnoreCase("yes")) {
                        if(Room.bag.size() >= 5) {
                            Main.print("[Note] You cannot carry more than 5 items.");
                            return;
                        }
                        
                        Room.addItemToBag(i, itemNumber);
                        Main.print("[Note] You picked up the item.");
                    } else {
                        Main.print("[Note] You chose not to pick up the item.");
                    }
                }
           }
        }
    }
     
    public ArrayList getRoom(int x, int y) {
        for(int i = 0; i < rooms.size(); i++) {
           if(rooms.get(i).get(0) == x && rooms.get(i).get(1) == y) {
               return rooms.get(i);
           }
        }
        
        throw new IllegalArgumentException("Could not find a room on this location.");
    }
    
    public void move(Integer addX, Integer addY) {
        // Check if the movement will put the player out of bounds
        if(x + addX >= thesize || y + addY >= thesize || x + addX < 0 || y + addY < 0) {
            System.out.println("[Note] It seems like the road is blocked, you cannot go any further.");      
        }else{
            numberOfMovements++;
        
            x += addX;
            y += addY;
            
            ArrayList<Integer> coordinates = new ArrayList<Integer>();
            coordinates.add(x);
            coordinates.add(y);
            history.add(coordinates);
            
            printRoomMessage(x, y);
    
            ArrayList<Integer> room = getRoom(x, y);
            Integer type = room.get(3);
            
            // Whenever a pokemon was found in the room.
            if(type == 1) {                
                Main.print("[?] What would you like to do?");
                
                Main.print("> 1 - Battle");
                Main.print("> 2 - Run");

                Main.print("[?] Enter the respective number of the action you would like to perform.");

                int answer = Main.input.nextInt();
                int pokemon = room.get(4);
                switch(answer) {
                    case 1:
                        // Start battle
                        ArrayList<Integer> opponentRawStats = Pokemon.getWildPokeRawStats(pokemon, 1);

                        Battle b = new Battle();

                        // Main.print("Raw stats are " + opponentRawStats);
                        b.theBattle(opponentRawStats);
                        break;
                    default:
                        Main.print("[Note] You got away safely!");
                }
            }

        }
    }
    
    public void back()
    {
        numberOfMovements -= 1;
        x = history.get(numberOfMovements).get(0);
        y = history.get(numberOfMovements).get(1);
        history.remove(numberOfMovements + 1);
    }

	public static void setItemNumber()
	{
		for(int i = 0; i < rooms.size(); i++)
		{
			if(rooms.get(i).get(0) == x && rooms.get(i).get(1) == y)
			{
				rooms.get(i).set(3, 2);
			}
		}
	}
    private ArrayList getCoordinates()
    {
        ArrayList<Integer> coordinates = new ArrayList<Integer>();
        coordinates.add(x);
        coordinates.add(y);
        return coordinates;
    }

    public void printCoordinates()        //developer only. ?
    {
        System.out.println(getCoordinates());
    }
}
