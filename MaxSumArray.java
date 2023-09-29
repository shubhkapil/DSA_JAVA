public class MaxSumArray {
    
    public static void main(String[] args)
    {
        int mi=0,mj=0;
        int arr[] = {1,-1,24,5,-231,23,1,1};
        int maxi = Integer.MIN_VALUE;
        int csum = 0;
        int ps[] = new int[arr.length];
        ps[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ps[i] = arr[i] + ps[i-1];
        }
        int i,j;
        for( i=0;i<arr.length;i++)
        {
            for(j=i;j<arr.length;j++)
            {
                csum = (i==0)?ps[j]:(ps[j]-ps[i-1]);
            }
            if(maxi<csum) 
            {
                maxi = csum;
                
                mi=i;
                mj=(j==arr.length)?(arr.length-1):j;
            }
        }

        System.out.println("The maximum sum is: "+maxi);
        System.out.println("Indexes at: "+mi +" and "+mj);

    }
}
