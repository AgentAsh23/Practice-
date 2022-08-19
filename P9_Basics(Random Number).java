import java.util.*;
public class Randomnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int value1 =random.nextInt(10);
        int value2 =random.nextInt(10);
        System.out.println(value1);
        System.out.println(value2);
        int sum=value1+value2;
        System.out.println("Enter the value to be checked");
        int Num=sc.nextInt();
        if(Num==sum)
        {
            System.out.println(+value1+"+"+value2+" is true");
        }
        else
        {
             System.out.println(+value1+"+"+value2+" is false");
        }
    }
}
