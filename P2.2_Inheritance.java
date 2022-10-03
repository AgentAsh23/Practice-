import java.util.*;
class Arithmetic
{
    int add(int n1, int n2)
    {
        int sum;
        sum=n1+n2;
        return sum;
    }
}
class Adder extends Arithmetic
{
}

class Main
{
public static void main(String args[])
{
    Adder A=new Adder();
    Scanner sc= new Scanner(System.in);
    int num1,num2;
    num1=sc.nextInt();
    num2=sc.nextInt();
    System.out.println(A.getClass().getSuperclass().getName());
    System.out.println(A.add(num1,num2));
}
}
