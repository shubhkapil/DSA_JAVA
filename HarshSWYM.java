import java.util.*;

public class HarshSWYM {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n ;
    //     n = sc.nextInt();
    //     double[] arr = new double[n];
    //     for(int i=0;i<n;i++)
    //         arr[i] = sc.nextDouble();

        
    //     double maxV = Integer.MIN_VALUE;
    //     int maxi = 0;
    //     double minV = Integer.MAX_VALUE;
    //     int mini = 0;

    //     for(int i =0;i<n;i++)
    //     {
    //         if(arr[i]>maxV)
    //         {
    //             maxV = arr[i];
    //             maxi = i;
    //         }
    //         if(arr[i]<minV)
    //         {
    //             minV = arr[i];
    //             mini = i;
    //         }
    //     }

    //     System.out.println(maxV);
    //     System.out.println(maxi);
    //     System.out.println(minV);
    //     System.out.println(mini);
    // }

    //QUES 2
    static int solve(int n)
        {
        int count=1;
            while (n != 1)
            {
                count++;
            
                if (n % 2 == 1)
                    n = 3 * n + 1;
        
                else
                    n = n / 2;
            }
        
            return count;
        }  
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int res=0,max=-1,j=0;
    for(int i=1;i<=m;i++)
    {
    res=solve(i);
    max=Math.max(res,max);
    if(max==res)
        j=i;
    }
    System.out.println(j);
    } 

    
}
