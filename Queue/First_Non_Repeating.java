import java.util.*;

class First_Non_Repeating{

    public static void main(String[] args)
    {
        String input = "aabccxb";
        String ans = "";

        int freq[] = new int[26];
        Queue<Character> queue = new LinkedList<Character>();

        for(int i=0;i<input.length();i++)
        {
            Character c = input.charAt(i);
            queue.add(c);
            freq[c-'a']++;

            while(!queue.isEmpty() && freq[queue.peek()-'a']>1)
                queue.remove();
            if(queue.isEmpty())
                ans+="-1";
            else
                ans+=queue.peek();

        }

        System.out.println(ans);

    }
}
