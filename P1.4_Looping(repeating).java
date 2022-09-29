import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=1;
        while (num>0)
        {
            System.out.println("What is 5 + 9?");
            int n=sc.nextInt();
            if (n == 14) 
            {
                System.out.println("You got it");
                num=0;
            }
            else
            {
                System.out.println("Wrong choice");
                num=1;
            }
        }
    }
}
