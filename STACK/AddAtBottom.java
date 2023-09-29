import java.util.Stack;

class AddAtBottom
{

    public static void addToBottom(Stack<Integer> s,int d)
    {
        if(s.isEmpty())
        {
            s.push(d);
            return;
        }
        int t = s.pop();
        addToBottom(s,d);
        s.push(t);
    }

    public static void print(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            int t = s.pop();
            System.out.print(t+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        addToBottom(stack,6);
        print(stack);
    }

}