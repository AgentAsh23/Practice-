import java.util.*;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three sides of the triangle");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int sum=s1+s2+s3;
        if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1)
        {
            System.out.println("Perimeter="+sum);
            System.out.println("Valid Triangle");
        }
        else 
        {
            System.out.println("InValid Triangle");
        }
    }
}
