import java.util.*;
class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString()";
    }
    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}
class Main
{
    public static void main(String[] args) 
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9)
        {
            try
            {
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
        else
        {
            System.out.println("No exception");
        }
    }
}
