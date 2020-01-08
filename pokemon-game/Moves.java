import java.util.*;
import java.util.ArrayList;

public class Moves
{
    
    Dictionary types = new Hashtable(); 
   ArrayList<Integer> moveInfo = new ArrayList<Integer>();
   //moveInfo is displayed like (movedmg, type)
    Moves()
    {
        // Bug, Dragon, Electric, Fighting, Fire, Flying, Ghost, Grass, Ground, Ice, Normal, Poison, Psychic, Rock, and Water.
        types.put("1", "grass");
        types.put("2", "water");
        types.put("3", "fire");
        types.put("4", "psychic");
        types.put("5", "bug");
        types.put("6", "electric");
        types.put("7", "dragon");
        types.put("8", "fighting");
        types.put("9", "flying");
        types.put("10", "ghost");
        types.put("11", "ground");
        types.put("12", "ice");
        types.put("13", "normal");
        types.put("14", "poison");
        types.put("15", "rock");
        //convert int to string: String str1 = Integer.toString(a);
    }
    public ArrayList absorb()
    {
        //when possible recover half of inflicted dmg
        //arraylist is like dmg, special or physical, 3 is status accuracy, type
        //0 is physical, 1 is special
        ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(20);
        moveInfo.add(1);
        moveInfo.add(100);
        moveInfo.add(1);
        moveInfo.add(-1); //-1 for indicating nothing happens, if something Does happen this number will be something else. indicating a increase or decrease in a specific stat.
        moveInfo.add(0); // indicating the amount of change, backwards or forwards.
        return moveInfo;
    }
    public ArrayList acid()
    {
        ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(40);
        moveInfo.add(1);
        moveInfo.add(100);
       moveInfo.add(14);
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList acidArmor()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(14);//type
       moveInfo.add(1);
       moveInfo.add(2);
       return moveInfo;
    }
    public ArrayList agility()
    {
        ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(4);//type
       moveInfo.add(4);//stat it modifies
       moveInfo.add(2);
       return moveInfo;
    }
    public ArrayList amnesia()
    {
        ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(4);//type
       moveInfo.add(3);
       moveInfo.add(2);
       return moveInfo;
    }
    public ArrayList auroraBeam()
    {
          ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(65);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(12);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList Barrage()
    {
          ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(15 * Room.getRandomNumber(2, 5));//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList barrier()
    {
        
        ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(4);//type
       moveInfo.add(1);
       moveInfo.add(2);
       return moveInfo;
    }
    public ArrayList bite()
    {
        
        ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(60);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList blizard()
    {
     ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(110);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(70);//accuracy
       moveInfo.add(12);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList bodySlam()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(85);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList boneClub()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(65);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(11);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList bonemerang()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(100);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(900);//accuracy
       moveInfo.add(11);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList bubble()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(40);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }  
    public ArrayList bubbleBeam()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(65);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList clamp()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(35);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList cometPunch()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(18 * Room.getRandomNumber(2, 5));//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList confusion()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(50);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(4);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList crabHammer()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(100);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(90);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList cut()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(50);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(95);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList defenseCurl()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(1);
       moveInfo.add(1);
       return moveInfo;
    }
    public ArrayList dizyPunch()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(70);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList doubleKick()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(60);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(8);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList doubleSlap()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(15 * Room.getRandomNumber(2, 5));//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList doubleTeam()
    {
         ArrayList<Integer> moveInfo = new ArrayList<Integer>();
        moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(6);
       moveInfo.add(1);
       return moveInfo;
    }
    public ArrayList doubleEdge()
    {
           moveInfo.add(120);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList drillPeck()
    {
           moveInfo.add(100);//dmg
        moveInfo.add(80);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(9);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList earthquake()
    {
           moveInfo.add(100);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(11);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList eggBomb()
    {
           moveInfo.add(100);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(75);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList ember()
    {
           moveInfo.add(40);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(3);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList fireBlast()
    {
           moveInfo.add(110);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(3);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public ArrayList fissure()
    {
           moveInfo.add(10000);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(30);//accuracy
       moveInfo.add(11);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
}
