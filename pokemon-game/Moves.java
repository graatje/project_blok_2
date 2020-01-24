import java.util.*;
import java.util.ArrayList;
public class Moves
/**
@author Kevin
@return ArrayList
The class Moves is used only to set up moves.
every method returns an ArrayList
**/
{
   static ArrayList<Integer> moveInfo = new ArrayList<Integer>();
   //moveInfo is displayed like (movedmg, damagetype, accuracy, type, stat it changes if it is a status move, amount it changes.)
   // grass, water, fire, psychic, bug, electric, dragon, fighting, flying, ghost, ground, ice, normal, poison, rock are the types. 
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
	 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
	ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
	ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
	ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
	ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
	 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
           ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
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
		 ArrayList<Integer> moveInfo = new ArrayList<Integer>();
            moveInfo.add(15);//dmg
        moveInfo.add(0);//dmgtype
        moveInfo.add(90);//accuracy
       moveInfo.add(13);//type
       moveInfo.add(-1);
       moveInfo.add(0);
       return moveInfo;
    }
}
