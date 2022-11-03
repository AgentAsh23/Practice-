import java.util.Scanner;
class NegativeException extends Exception
{
    @Override
    public String toString()
    {
        return "java.lang.Exception: n or p should not be negative.";
    }
    @Override
    public String getMessage()
    {
        return "java.lang.Exception: n or p should not be negative.";
    }
}
class ZeroException extends Exception
{
    @Override
    public String toString()
    {
        return "java.lang.Exception: n and p should not be zero.";
    }
    @Override
    public String getMessage()
    {
        return "java.lang.Exception: n and p should not be zero.";
    }
}


class MyCalculator
{
    long power(int n,int p) throws Exception 
    {
        if(n<0 || p<0)
        {
            throw new NegativeException();
        }
        else if(n==0 || p==0)
        {
            throw new ZeroException();
        }
        int prod=1;
        for(int i=0;i<p;i++)
        {
            prod=prod*n;
        }
        return prod;    
    }
}


public class Solution 
{
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try 
            {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }
}
