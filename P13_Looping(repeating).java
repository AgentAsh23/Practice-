import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int value1 =random.nextInt(100);
        System.out.println(value1);
        int n=1;
        while(n>0)
        {
            System.out.println("Enter the value to be checked");
            int num=sc.nextInt();
            if(value1==num)
            {
                System.out.println("Matched");
                n=0;
            }
            else if(value1<num)
            {
                System.out.println("Value is too high");
                n=1;
            }
            else if(value1>num)
            {
                System.out.println("Value is too low");
                n=1;
            }
        }
    }
}
