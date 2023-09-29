public class ques4 {
    public static void main(String[] args)
    {
        int h[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = h.length;

        int lm[] = new int[n];
        int rm[] = new int[n];

        lm[0]=h[0];
        rm[n-1]=h[n-1];

        for(int i=1;i<n;i++)
            lm[i]=Math.max(lm[i-1],h[i]);

        for(int i=n-2;i>=0;i--)
            rm[i]=Math.max(rm[i+1],h[i]);
        
        int ans =0;

        for(int i =0;i<n;i++)
            System.out.print(lm[i]);
        System.out.println();
        for(int i =0;i<n;i++)
            System.out.print(rm[i]);

        
        for(int i=0;i<n;i++)
        {
             ans+=(Math.min(rm[i],lm[i])-h[i]);
        }

        System.out.println(ans);
    }
    
}
