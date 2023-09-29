public class AgnivQues {

    public static int solve(int n, int m, int k, int arr[][])
    {
        int a[] = new int[n];

        for(int i =0;i<n;i++)
        {
            int s = arr[i][0];
            int d = arr[i][1];
            a[s]++;
            a[d]++;
        }
        int cnt = 0;

        for(int i = 0;i<n;i++)
        {
            if(a[i]>1)  cnt++;
        }
        return cnt*k;
    }
    public static void manin(String[] args)
    {
        int n = 8, m = 7, k= 3;
        int arr[][] = {{0,1},{1,2},{3,4},{2,4},{2,6},{5,2},{3,7}};

        int ans = solve(n,m,k,arr);

        System.out.println(ans);


    }
    
}
