import java.util.*;
class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
    int b = sc.nextInt();
	  int c = sc.nextInt();
		int h = -b/ 2 *a;
		int r=-b;
		int s=2*a;
		int k =c*(s*s)- a*(b*b);
		System.out.println(r+"/"+s+" "+k+"/"+s*s );
    }
}
