public class GridWays {

    static int cnt = 0;

    public static void findWays(int i, int j, int n, int m, String str) {
        if(i==n-1 && j==m-1)
        {
            System.out.println(str);
            cnt++;
            return;
        }
            
        // else if (i == n - 1 || j == m - 1) 
        //     return 1;
        // else if (i == n || j == m)
        //     return 0;
        // go right
        // int w1 = 
        if(j<m)
            findWays(i, j + 1, n, m, str + "R");
        // go down:
        // int w2 = 
        if(i<n)
            findWays(i + 1, j, n, m, str + "D");

        return;

    }

    public static void main(String[] args) {
        int n = 5, m = 5;

        String str = "";

        //System.out.println(findWays(0, 0, n, m, str));
        findWays(0, 0, n, m, str);
        System.out.println(cnt);
    }
}
