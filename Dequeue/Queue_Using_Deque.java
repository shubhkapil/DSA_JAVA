import java.util.*;

class Queue{
    Deque<Integer> q = new LinkedList<Integer>();

    void push(int d)
    {
        q.addLast(d);
    }
    int pop()
    {
        int d = q.removeFirst();
        return d;
    }
    int peek()
    {
        return q.getFirst();
    }
    void print()
    {
        System.out.println(q);
    }
}


public class Queue_Using_Deque {

    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.print();
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.pop());

    }
    
}
