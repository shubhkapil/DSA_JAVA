import java.util.*;

public class Binary_till_n_queue {

    public static void print(int n) 
    {
        String s = "";

        if(n==0)
            s="0";

        while(n>0)
        {
            Integer t = n%2;
            s+=t.toString();
            n=n/2;
        }
        System.out.println(s);

    }


    public static void main(String[] args)
    {
        int n;

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0; i<n; i++)
        {
            print(i);
        }
        sc.close();

    }
    
}
