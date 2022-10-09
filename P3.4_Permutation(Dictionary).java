import java.util.*;
class Main
{
static int factorial(int n)
{
    if(n==0 |n==1)
    {
        return 1;
    }
    else
    {
        return n*factorial(n-1);
    }
}
static void remove(char []array,int b)
{
    for (int i = b; i < array.length - 1; i++) {
    array[i] = array[i + 1];
}
    
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char []a=s.toCharArray();
    char []b=s.toCharArray();
    Arrays.sort(b);
    int l=s.length();
    int tag=0;
    for(int i=0;i<s.length();i++)
    {
        int ans=0;
        int count=0;
        for(int j=0;j<s.length();j++)
        {
            if(b[j]== a[i])
            {
                ans =j;
            break;
            }
            else
            {
                count++;
            }
        }
        remove(b,ans);
        tag+=count*factorial(l-1);
        l--;
    }
    System.out.println(tag+1);
}
}
