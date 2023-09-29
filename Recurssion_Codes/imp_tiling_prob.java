package Recurssion_Codes;

public class imp_tiling_prob {

    public static int tiling(int n)
    {
        if(n==0||n==1)
            return 1;
        
        //vertical placed
        int fm1 = tiling(n-1);

        //horizontal placed
        int fm2 = tiling(n-2);

        return (fm1+fm2);
    }
    public static void main(String[] args)
    {
        System.out.println(tiling(4));
    }
    
}
