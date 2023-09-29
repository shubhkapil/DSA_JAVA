import java.util.Stack;

public class ReverseAStack {

    public static void addAtBottom(Stack<Integer> s,int data)
    {
        if(s.empty())
        {
            s.push(data);
            return ;
        }
        int curr = s.pop();
        addAtBottom(s, data);
        s.push(curr);

    }
    public static void reverseStack(Stack<Integer> s)
    {
        if(s.empty())
            return;
        int curr = s.pop();
        reverseStack(s);
        addAtBottom(s, curr);
    }
    public static void reverseStack2(Stack<Integer> s)
    {
        int n = s.size();
        while(n-- > 0)
        {
            int curr = s.pop();
            addAtBottom(s, curr);
        }
    }

    public static void print(Stack<Integer> s)
    {
        while(!s.empty())
        {
            int curr = s.pop();
            System.out.println(curr);
        }
    }
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        addAtBottom(s, 0);
        reverseStack2(s);
        print(s);
    }
    
}
