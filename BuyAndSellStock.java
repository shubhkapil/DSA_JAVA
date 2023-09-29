public class BuyAndSellStock {

    public static void main(String[] args)
    {
        int a[] = {7,1,5,3,6,4};

        int p=0;
        int bp=a[0];

        for(int i=0;i<a.length;i++)
        {
            
            bp = Math.min(bp,a[i]);

            p = Math.max(p,a[i]-bp);
        }

        System.out.println(p);
    }
    
}
