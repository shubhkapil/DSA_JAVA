public class Harsh {

    public static int solve(int[] arr,int k,int val)
    {
        int minOp = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==val)
                continue;
            else if((arr[i]==1 && val == k) || (arr[i]==k && val==1))
                minOp += 1;
            else if(arr[i]<val)
            {
                int left = (arr[i]-1) + (k-val+1);
                int right = val-arr[i];

                minOp += Math.min(left,right);
            }
            else
            {
                int left = arr[i] - val;
                int right = (k-arr[i]+1) + (val-1);
                minOp += Math.min(left,right);
            }
        }

        return minOp;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,98};
        int k = 100;

        int avg=0; 
        int n = arr.length;

        for(int i = 0;i<n;i++)
        {
            avg+=arr[i];
        }
        avg=(avg/n);

        int ansAvg = solve(arr,k,avg);
        int ansOne = solve(arr,k,1);
        int ansK = solve(arr,k,k);


        System.out.println(ansAvg+" "+ansK+" "+ansOne);
        int ans = Math.min(ansAvg,Math.min(ansOne,ansK));
        System.out.println(ans);
    }
    
}


