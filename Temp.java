import java.util.*;

public class Temp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            pq.add(num);
        }
        scanner.close();

        int ans=0;
        while(!pq.isEmpty())
        {
            int ele = pq.poll();

            if(!pq.isEmpty() && pq.peek()==ele)
            {
                while(!pq.isEmpty() && pq.peek()==ele)
                    pq.remove();
            }
            else
            {
                ans++;
                if((ele/2)!=0)
                    pq.add(ele/2);
            }
        }
        
        
        System.out.println(ans);
    
    }

 
}