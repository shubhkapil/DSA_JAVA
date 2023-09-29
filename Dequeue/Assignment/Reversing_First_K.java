package Assignment;

import java.util.*;

public class Reversing_First_K {

    public static void reverse(Queue q, int k) {
        int n = q.size() - k;
        Stack<Integer> s = new Stack<Integer>();
        while (k-- > 0) 
            s.push(q.remove());

        while (!s.isEmpty())
            q.add(s.pop());
        while (n-- > 0)
            q.add(q.remove());

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
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
        int k = 5;
        reverse(q, k);
        System.out.println(q);

    }

}
