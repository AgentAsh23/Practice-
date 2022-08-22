import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be converted in Hexadecimal");
        int n=sc.nextInt();
        System.out.println(Integer.toHexString(n)); 
    }
}
