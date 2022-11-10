import java.util.HashSet;
import java.util.Iterator;
public class Hashing
{
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//set does not allow unique values .It removes duplicate values.
        System.out.println("Size of set is: "+set.size());
        System.out.println(set);
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        if(set.contains(1))
        {
            System.out.println("Set Contains 1");
        }
        if(!set.contains(6))
         {
            System.out.println("Set not Contains 6");
        }
        set.remove(1);
         if(!set.contains(1))
         {
            System.out.println("Set not Contains 1");
        }
    }
}
