import java.util.*;

class Stack{
    Deque<Integer> q = new LinkedList<Integer>();

    void push(int d)
    {
        q.addLast(d);
    }
    int pop()
    {
        int d = q.removeLast();
        return d;
    }
    int peek()
    {
        return q.getLast();
    }
}

class Stack_Using_Deque{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());

    }
}