import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n=input.nextInt();
        for (int i = 0; i < n; i++) list1.add(input.nextInt());
        int f=input.nextInt();
        for (int i = 0; i < f; i++) list2.add(input.nextInt());
        System.out.println(union(list1, list2).toString().replace("[","").replace("]","").replace(",",""));


    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(list1);
        temp.addAll(list2);
        return temp;
    }
}
