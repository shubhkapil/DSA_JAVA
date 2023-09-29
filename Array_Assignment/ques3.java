import java.util.*;

public class ques3 {
    public static void main(String[] args)
    {
        int ans = 0;
        int p[]= {7, 1, 5, 3, 6,  4};
        int buy =p[0];

        for(int i=1;i<p.length;i++)
        {
            if(buy<p[i])
                ans = Math.max(ans,(p[i]-buy));
            else
                buy = p[i];
        }

        System.out.println("Max Profit: " + ans);
    }
}
