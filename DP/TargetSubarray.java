package DP;

public class TargetSubarray {

    public static void print(boolean[][] dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }
    }

    public static boolean solve(int[] val,int tar)
    {
        int n = val.length;
        boolean[][] dp = new boolean[n+1][tar+1];

        for(int i= 0;i<n+1;i++)
            dp[i][0] = true;
        //for d[0][1-(tar+1)]=false -> already has false when declared.
        
        for(int i = 1; i<n+1;i++)
        {
            for(int j =1;j<tar+1;j++)
            {
                int v = val[i-1];
                if(v<=j && dp[i-1][j-v]==true)
                    dp[i][j] = true;
                else if(dp[i-1][j] == true)
                    dp[i][j] = true;
                // else  dp[i][j] = false ->Already is
            }
        }
        print(dp);
        return dp[n][tar];
    }
    public static void main(String[] args)
    {
        int val[] = {4,2,7,1,3};
        int tar = 1;

        boolean ans = solve(val,tar);
        System.out.println(ans);
    }
    
}
