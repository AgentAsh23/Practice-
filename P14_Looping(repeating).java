import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is 5 + 9?");
        int n=sc.nextInt();
        int numbersRead = 0;
        int num = 1;

        while (num>0) 
        {
            if (n == 14) 
            {
                System.out.println("You got it");
                break;
            }
            else
            {
                System.out.println("Wrong choice");
                System.out.println("What is 5 + 9?");
                num++;
                break;
                
            }
        }
    
    }
}
