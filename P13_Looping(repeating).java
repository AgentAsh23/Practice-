import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int value1 =random.nextInt(100);
        System.out.println(value1);
        System.out.println("Enter the value to be checked");
        int num=sc.nextInt();
        int n=1;
        for(int i=0;i<n;i++)
        {
            if(value1==num)
            {
                System.out.println("Matched");
            }
        n++;
        break;
        }
    }
}
