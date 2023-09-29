import java.util.*;

public class Interleave_2_Queue {
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        int n = q.size()/2;
        while(n-->0)
            q2.add(q.remove());

        while(!q2.isEmpty())
        {
            q.add(q2.remove());
            q.add(q.remove());
        }
        
        System.out.println(q);
            

    }
    
}
