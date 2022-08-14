import java.lang.Math;
import java.util.*;
public class InputOutput
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("a=");
        double a=sc.nextDouble();
        System.out.println("b=");
        double b=sc.nextDouble();
        double c=Math.pow(a,b);
        System.out.println("Power of Two numbers is "+c);
        double d=Math.max(a,b);
        System.out.println("Maximum of Two numbers is "+d);
        double e=Math.min(a,b);
        System.out.println("Minimum of Two numbers is "+e);
        double f=Math.sqrt(a);
        System.out.println("Square root of first number is "+f);
        double g=Math.log(a);
        System.out.println("Logarithm of number is "+g);
        double h=Math.log10(a);
        System.out.println("Logarithm with base 10 of number is "+h);
        double i=Math.tan(a);
        System.out.println("Tangent of number is "+i);
        double j=Math.sin(a);
        System.out.println("Sine of number is "+j);
        double k=Math.cos(a);
        System.out.println("Cosine of number is "+k);
        double l=Math.tanh(a);
        System.out.println("Hyberic Tangent of number is "+l);
        double m=Math.sinh(a);
        System.out.println("Hyberbolic Sine of number is "+m);
        double n=Math.cosh(a);
        System.out.println("Hyperbolic Cosine of number is "+n);
        double o=Math.atan(a);
        System.out.println("Arc Tangent of number is "+o);
        double p=Math.asin(a);
        System.out.println("Arc Sine of number is "+p);
        double q=Math.acos(a);
        System.out.println("Arc Cosine of number is "+q);
        double r=Math.abs(a);
        System.out.println("Absoulute of number is "+r);
        double s=Math.round(a);
        System.out.println("Round of number is "+s);
        double t=Math.cbrt(a);
        System.out.println("Cube Root of number is "+t);
    }
}
