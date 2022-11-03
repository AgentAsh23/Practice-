import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try
        {
            short x=sc.nextShort();
            short y=sc.nextShort();
            int s=x/y;
            System.out.println(s);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }
    }
}
