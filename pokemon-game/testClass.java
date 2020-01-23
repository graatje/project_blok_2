import java.util.ArrayList;
public class testClass
{
    ArrayList<Double> inBattleStats = new ArrayList<Double>();
    int damage;
    public void doSomething(double some_double)
    {
        for(int i = 0; i <= 14; i++)
        {
        inBattleStats.add(some_double);
        System.out.println(i);
    }
    }
}
