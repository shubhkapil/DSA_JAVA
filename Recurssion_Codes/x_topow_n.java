package Recurssion_Codes;

public class x_topow_n {

    public static int power(int x,int n)
    {
        if(n==0)
            return 1;
        if(n==1)
            return x;
        int ans;
        if(n%2==0)
            ans = power(x,n/2)*power(x,n/2);
        else
            ans = x*power(x,n-1);
        
        return ans;
    }

    public static void main(String[] args)
    {
        System.out.println(power(2,9));
    }
    
}
