import java.util.ArrayList;
public class game
{
    
 
    
    
// pokemonnumber, pokemonlevel, hpiv, atkiv,defiv,spatkiv,spdefiv,speediv, hpev, atkev, defev,spatkev, spdefev, speedev
//discussion, do i need an id? isn't it stored in the index?
//preparing variables
    int numberOfMovements;
    //define int n = 1 if bug
    int x;
    int y;
    int thesize;
    String resultMessage;
    int roomType;
    ArrayList<ArrayList<Integer> > history = new ArrayList<ArrayList<Integer> >();
    public static ArrayList<ArrayList<Integer> > rooms = new ArrayList<ArrayList<Integer> >();
    
    //constructor
    game(int size)
    {
        if (size < 4 || size > 30) 
        {
            throw new IllegalArgumentException("size must be between 4 and 30");
        }
        
        //generate rooms
        for(int ysize = 0; ysize < size; ysize++)
        {
            for(int xsize = 0; xsize < size; xsize++)
            {
                ArrayList<Integer> roomInfo = new ArrayList<Integer>();
                roomInfo.add(xsize);
                roomInfo.add(ysize);
                roomInfo.add(Room.getRandomNumber(1, 4));//roomtype
                roomInfo.add(Room.getRandomNumber(0, 2)); //content type
                if(roomInfo.get(3) == 0)
                {
                    roomInfo.add(Room.getRandomNumber(0, 3));//item type
                }
                else if(roomInfo.get(3) == 1)
                {
                    roomInfo.add(Room.getRandomNumber(0, 150)); //pokemon
                }
                else
                {
                    roomInfo.add(-1);//something has to be entered because you will get an out of range error otherwise.
                }
                rooms.add(roomInfo);
                // the arraylist will be like x coordinate, y coordinate, roomtype int, content type int, specific content type int
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
        for(int i = 0; i <Room.bag.size(); i++)
        {
            System.out.print(Room.bag.get(i));
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

    private String getRoomMessage(int x, int y) //gives message after entering a room
    {
        for(int i = 0; i < rooms.size(); i++)
        {
            //checks if coordinates matches 1 of the rooms, if it does, (which should always be the case) a message will be showed. 
           if(rooms.get(i).get(0) == x && rooms.get(i).get(1) == y)
           {
               resultMessage = Room.message(rooms.get(i).get(2)) + Room.actionFromRoomContent(i, rooms.get(i).get(3), rooms.get(i).get(4));
               return resultMessage;
           }
        }
        return "there was no return, in other words, a bug";
    }
    
    public void moveNorth()
    {
        if(y-1 < 0)
        {
            System.out.println("god said no");
        }
        else
        {
            ArrayList<Integer> coordinates = new ArrayList<Integer>();
            numberOfMovements += 1;
            y -= 1;
            coordinates.add(x);
            coordinates.add(y);
            history.add(coordinates);
            System.out.println(getRoomMessage(x, y));
        }
    }

    public void moveEast()
    {
        if(x+1 >= thesize)
        {
            System.out.println("god said no");
        }
        else
        {
            ArrayList<Integer> coordinates = new ArrayList<Integer>();
            numberOfMovements += 1;
            x += 1;
            coordinates.add(x);
            coordinates.add(y);
            history.add(coordinates);
            System.out.println(getRoomMessage(x, y));
        }
    }

    public void moveSouth()
    {
        if(y+1 >= thesize)
        {
            System.out.println("god said no");
        }
        else
        {
            ArrayList<Integer> coordinates = new ArrayList<Integer>();
            numberOfMovements += 1;
            y += 1;
            coordinates.add(x);
            coordinates.add(y);
            history.add(coordinates);
            System.out.println(getRoomMessage(x, y));
        }
    }
    
    public void moveWest()
    {
        if(x-1 < 0)
        {
            System.out.println("god said no");
        }
        else
        {
            ArrayList<Integer> coordinates = new ArrayList<Integer>();
            numberOfMovements += 1;
            x -= 1;
            coordinates.add(x);
            coordinates.add(y);
            history.add(coordinates);
            System.out.println(getRoomMessage(x, y));
        }
    }

    public void back()
    {
        numberOfMovements -= 1;
        x = history.get(numberOfMovements).get(0);
        y = history.get(numberOfMovements).get(1);
        history.remove(numberOfMovements + 1);
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
        for(int i = 0; i < getCoordinates().size(); i++)
        {
            System.out.println(getCoordinates().get(i));
        }
    }
}
