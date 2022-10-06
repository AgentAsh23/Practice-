import java.util.*;
class Stack
{
    int stack[]= new int[5];
    int top=0;
    public void push(int data)
    {
        stack[top]=data;
        top++;
    }
    public int pop()
    {
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public int peek()
    {
        int data;
        data=stack[top-1];
        stack[top]=0;
        return data;
    }
    public void show()
    {
        for(int i:stack)
        {
            System.out.print(i + " ");
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        st.push(15);
        st.push(20);
        st.push(100);
        st.show();
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.show();
    }
}
