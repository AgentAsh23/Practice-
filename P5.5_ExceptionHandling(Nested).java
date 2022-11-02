import java.util.*;
class NestedTryAndCatch
{
    public static void main(String[] args) 
    {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Index");
        boolean flag=true;
        do
        {
            int ind=sc.nextInt();
            try
            {
                System.out.println("Level 1 exceuted ");
                try
                {
                    System.out.println(marks[ind]);
                    flag=false;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Sorry this level does not exist");
                    System.out.println("Exception in Level 2");
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception in Level 1");
            }
        }
        while(flag);
        System.out.println("The End");
    }
}
