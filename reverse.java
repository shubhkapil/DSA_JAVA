import java.util.*;
import java.math.*;

//revese a number without using %;
public class reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n,d=0;
        while(t>0)
        {
            d++;
            t/=10;
        }

        int[] arr = new int[d];
        int i=0;
        while(i<d)
        {
            int temp = (int)Math.pow(10,d-i-1);
            arr[i] = n/temp;
            n-=(temp*arr[i]);
            i++;
        }
        d--;
        int ans=0;
        while(d>=0)
        {
            ans=(ans*10) + arr[d];
            d--;
        }

        System.out.println(ans);



    }
}
