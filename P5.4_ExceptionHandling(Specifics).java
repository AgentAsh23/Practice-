import java.util.*;
class TryAndCatch
{
    public static void main(String[] args) 
    {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Index");
        int ind=sc.nextInt();
        System.out.println("Enter the no. you wanna divide");
        int num=sc.nextInt();
        try
        {
            System.out.println("Value of Array index entered is = "+ marks[ind]);
            System.out.println("Value of Array index/num is ="+ marks[ind]/num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of bound Exception");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Other Exception");
            System.out.println(e);
        }
    }
}
