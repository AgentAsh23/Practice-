import java.util.*;
public class DaysOfMonth
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number= ");
        int num=sc.nextInt();
        int temp,sum=0,r;
        temp=num;
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
        System.out.println("Number is Palindrome ");
        else
        System.out.println("Number is not palindrome");
    }
}
