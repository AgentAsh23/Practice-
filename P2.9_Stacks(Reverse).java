import java.util.ArrayList;
import java.util.*;
public class StackClass {
    public static void PushAtBottom(int data,Stack<Integer>stack)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }
        int top=stack.pop();
        PushAtBottom(data,stack);
        stack.push(top);
    }
    
    public static void reverse(Stack<Integer>stack)
    {
        if(stack.isEmpty())
        {
            return;
        }
        int top=stack.pop();
        reverse(stack);
        PushAtBottom(top,stack);
    }
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        reverse(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
