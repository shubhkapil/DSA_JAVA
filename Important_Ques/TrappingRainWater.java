public class TrappingRainWater {

    static int trw(int a[])
    {
        int n = a.length;
        int lm[] = new int[n];
        int rm[] = new int[n];
        int ans = 0;
        //edge case;
        if(n<=2) return ans;

        lm[0]=a[0];
        rm[n-1]=a[n-1];
        for(int i=1;i<a.length;i++)
        {
            lm[i] = (a[i]>lm[i-1])? a[i]:lm[i-1];
        }

        for(int i = n-2;i>=0;i--)
        {
            rm[i] = (a[i]>rm[i+1])?a[i]:rm[i+1];
        }

        for(int i =0;i<a.length;i++)
            ans+= (Math.min(lm[i],rm[i])-a[i]);

        return ans;
    }
    public static void main(String[] args)
    {
        int a[] = {4,2,0,6,3,2,5};

        int ans = trw(a);

        System.out.println(ans);
    }
    
}
