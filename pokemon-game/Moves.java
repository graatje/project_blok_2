import java.util.*;
import java.util.ArrayList;

public class Moves
{
    
    Dictionary types = new Hashtable(); 
   static ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
    public static ArrayList absorb()
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
    public static ArrayList acid()
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
    public static ArrayList acidArmor()
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
    public static ArrayList agility()
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
    public static ArrayList amnesia()
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
    public static ArrayList auroraBeam()
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
    public static ArrayList barrage()
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
    public static ArrayList barrier()
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
    public static ArrayList bite()
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
    public static ArrayList blizard()
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
    public static ArrayList bodySlam()
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
    public static ArrayList boneClub()
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
    public static ArrayList bonemerang()
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
    public static ArrayList bubble()
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
    public static ArrayList bubbleBeam()
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
    public static ArrayList clamp()
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
    public static ArrayList cometPunch()
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
    public static ArrayList confusion()
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
    public static ArrayList crabHammer()
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
    public static ArrayList cut()
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
    public static ArrayList defenseCurl()
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
    public static ArrayList dizyPunch()
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
    public static ArrayList doubleKick()
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
    public static ArrayList doubleSlap()
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
    public static ArrayList doubleTeam()
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
    public static ArrayList doubleEdge()
    {
           moveInfo.add(120);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList drillPeck()
    {
           moveInfo.add(100);//dmg
        moveInfo.add(80);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(9);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList earthquake()
    {
           moveInfo.add(100);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(11);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList eggBomb()
    {
           moveInfo.add(100);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(75);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList ember()
    {
           moveInfo.add(40);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(3);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList fireBlast()
    {
           moveInfo.add(110);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(3);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList fissure()
    {
           moveInfo.add(10000);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(30);//accuracy
       moveInfo.add(11);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList flamethrower()
    {
        moveInfo.add(90);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(3);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList flash()
    {
           moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(12);
       moveInfo.add(-1);
       return moveInfo;
    }
    public static ArrayList furyAttack()
    {
           moveInfo.add(15 * Room.getRandomNumber(2, 5));//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList furySwipes()
    {
           moveInfo.add(18 * Room.getRandomNumber(2, 5));//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(80);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList growl()
    {
           moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(7);
       moveInfo.add(-1);
       return moveInfo;
    }
    public static ArrayList guillotine()
    {
       moveInfo.add(10000);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(30);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList gust()
    {
                moveInfo.add(40);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(9);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList harden()
    {
           moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(3);
       moveInfo.add(1);
       return moveInfo;
    }
    public static ArrayList headButt()
     {  
         moveInfo.add(70);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList highJumpKick()
    {
           moveInfo.add(130);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(90);//accuracy
       moveInfo.add(8);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList hornAttack()
    {
            moveInfo.add(65);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList hornDrill()
    {
           moveInfo.add(10000);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(30);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList hydroPump()
    {
           moveInfo.add(110);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(80);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList hyperBeam()
    {
           moveInfo.add(150);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(90);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList hyperFang()
    {
           moveInfo.add(80);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(90);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList iceBeam()
    {
           moveInfo.add(90);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(12);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList icePunch()
      {
          moveInfo.add(75);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(12);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList jumpKick()
    {
           moveInfo.add(100);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(95);//accuracy
       moveInfo.add(8);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList karateChop()
    {
           moveInfo.add(50);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(8);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList kinesis()
    {
           moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(80);//accuracy
       moveInfo.add(4);//type
       moveInfo.add(12);
       moveInfo.add(-1);
       return moveInfo;
    }
    public static ArrayList leechLife()
    {
           moveInfo.add(80);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(5);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList leer()
    {
           moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(8);
       moveInfo.add(-1);
       return moveInfo;
    }
    public static ArrayList lick()
    {
            moveInfo.add(30);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(10);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList meditate()
    {
            moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(4);//type
       moveInfo.add(0);
       moveInfo.add(1);
       return moveInfo;
    }
    public static ArrayList megaDrain()
    {
            moveInfo.add(40);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(1);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    
    public static ArrayList megaKick()
    {
               moveInfo.add(120);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(75);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList megaPunch()
    {
               moveInfo.add(80);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList minimize()
    {
        moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(110);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(6);
       moveInfo.add(2);
       return moveInfo;
    }
    public static ArrayList payDay()
    {
               moveInfo.add(40);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList peck()
    {
               moveInfo.add(35);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(9);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList pinMissile()
    {
               moveInfo.add(25 * Room.getRandomNumber(2, 5));//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(95);//accuracy
       moveInfo.add(5);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList poisonSting()
    {
                moveInfo.add(15);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(14);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList pound()
    {
                   moveInfo.add(40);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList psybeam()
    {
                   moveInfo.add(65);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(4);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList psychic()
    {
                      moveInfo.add(90);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(4);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList quickAttack()
    {
                     moveInfo.add(40);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo; 
    }
    public static ArrayList razorLeaf()
    {
                      moveInfo.add(55);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(95);//accuracy
       moveInfo.add(1);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList rockSlide()
    {
                      moveInfo.add(75);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(90);//accuracy
       moveInfo.add(15);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList rockThrow()
    {
                      moveInfo.add(50);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(90);//accuracy
       moveInfo.add(15);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList rollingKick()
    {
                      moveInfo.add(60);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(8);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    
    public static ArrayList sandAttack()
    {
                      moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(11);//type
       moveInfo.add(12);
       moveInfo.add(-1);
       return moveInfo;
    }
    public static ArrayList scratch()
    {
                      moveInfo.add(40);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList screech()
    {
                                moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(85);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(10);
       moveInfo.add(-2);
       return moveInfo;    
    }
    public static ArrayList sharpen()
    {
                                moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(120);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(0);
       moveInfo.add(1);
       return moveInfo;    
    }
    public static ArrayList slam()
    {
        moveInfo.add(80);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(75);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;    
    }
    public static ArrayList slash()
    {
            moveInfo.add(70);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;    
    }
    public static ArrayList sludge()
    {
            moveInfo.add(65);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(14);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;    
    }
    public static ArrayList smog()
    {
             moveInfo.add(30);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(70);//accuracy
       moveInfo.add(14);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;   
    }
    public static ArrayList smokescreen()
    {
                      moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(12);
       moveInfo.add(-1);
       return moveInfo;
    }
    public static ArrayList spikeCannon()
    {
                      moveInfo.add(20 * Room.getRandomNumber(2, 5));//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList splash()
    {
                      moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(1);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList stomp()
    {
                      moveInfo.add(65);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList strength()
    {
                   moveInfo.add(80);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList stringShot()
    {
                   moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(95);//accuracy
       moveInfo.add(5);//type
       moveInfo.add(11);
       moveInfo.add(-2);
       return moveInfo;
    }
    public static ArrayList submission()
    {
                   moveInfo.add(80);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(80);//accuracy
       moveInfo.add(8);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList surf()
    {
                moveInfo.add(90);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(80);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList swift()
    {
                  moveInfo.add(60);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(1000);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList swordsDance()
    {
                         moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(1000);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(0);
       moveInfo.add(2);
       return moveInfo;
    }
    public static ArrayList tackle()
    {
                   moveInfo.add(40);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList tailWhip()
    {
                        moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(8);
       moveInfo.add(-1);
       return moveInfo;
    }
    public static ArrayList thrash()
    {
          moveInfo.add(120);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList thunder()
    {
          moveInfo.add(110);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(70);//accuracy
       moveInfo.add(6);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList thunderPunch()
    {
          moveInfo.add(75);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(6);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList thunderShock()
    {
          moveInfo.add(40);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(6);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList thunderbolt()
    {
           moveInfo.add(90);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(6);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList triAttack()
    {
         moveInfo.add(80);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList twineedle()
    {
              moveInfo.add(50);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(5);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList vineWhip()
    {
          moveInfo.add(45);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(1);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList viseGrip()
    {
          moveInfo.add(55);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList waterGun()
    {
        moveInfo.add(40);//dmg
        moveInfo.add(1);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList waterfall()
    {
             moveInfo.add(80);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList wingAttack()
    {
             moveInfo.add(60);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(100);//accuracy
       moveInfo.add(9);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    public static ArrayList withdraw()
    {
         moveInfo.add(0);//dmg
        moveInfo.add(2);//dmgtype
        moveInfo.add(1000);//accuracy
       moveInfo.add(2);//type
       moveInfo.add(1);
       moveInfo.add(1);
       return moveInfo;
    }
    public static ArrayList wrap()
    {
            moveInfo.add(15);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(90);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
    

}
