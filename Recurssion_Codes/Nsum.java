package Recurssion_Codes;

public class Nsum {

    // public static int sum(int n,int ans)
    // {
    //     if(n==0)
    //         return ans;
    //     ans+=n;
    //     return sum(n-1,ans);

    // }

    public static int sum(int n){
        
        if(n==1)
            return 1;
        
        int s = n + sum(n-1);
        return s;
    }
    public static void main(String[] args)
    {
        System.out.println(sum(6));
    }
}
