import java.util.*;
class NegativeRadiusException extends Exception
{
    @Override
    public String toString()
    {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage()
    {
        return "Radius cannot be negative";
    }
}
class throw_throws
{
public static double area(int r) throws NegativeRadiusException
{
    if(r<0)
    {
        throw new NegativeRadiusException();
    }
    double ar=Math.PI*r*r;
    return ar;
}

public static int divide(int a,int b) throws ArithmeticException
{
    int result=a/b;
    return result;
}
public static void main(String[] args) 
{
        try
        {
            int c=divide(6,0);
            System.out.println(c);
            double ar=area(-6);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        try
        {
            double ar=area(6);
            System.out.println(ar);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}
