import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
        System.out.println("Printing Left DownBase Traingle");
        for (int i=0;i<10;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
        System.out.println();    
        }
        System.out.println();
//------------------------------------------//        
        System.out.println("Printing Left UpperBase Triangle");
        System.out.println();
        for (int i=10;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("#");
            }
        System.out.println();
        }
        System.out.println();
//------------------------------------------//        
        System.out.println("Printing right downbase Triangle");
        System.out.println();
        for (int i=0; i<10; i++)   
        {  
            for (int j=1; j<=10-i; j++ )   
            {   
                System.out.print(" "); 
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("^");
            }
            System.out.println();   
        }
        System.out.println();
//------------------------------------------//        
        System.out.println("Printing right upperbase Triangle");
        System.out.println();
        
        for(int i=10;i>0;i--)
        {
            for(int j=10;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();
//--------------------------------------------//        
        System.out.println("Pyramid");
        System.out.println();
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i*2;k++)
            {
                System.out.print("!");
            }    
            System.out.println();
        }
    }
}
