//GALAT H

// package Greedy;

// import java.util.Arrays;
// import java.util.Comparator;

// public class FractionKnapSack {

//     public static void main(String[] args)
//     {
//         int ans = 0;
//         int W =50;
//         int[] v = {60,100,200};
//         int[] w = {10,20,30};
//         int n = v.length;
//         double[][] r = new double[n][2];

//         for(int i=0;i<n;i++)
//         {
//             r[i][0] =v[i]/(double)w[i];
//             r[i][1] = i;
//         }
//         Arrays.sort(r,Comparator.comparingDouble(O->O[0]));

//         for(int i=n-1;i>=0;i--)
//         {
//             int idx = (int)r[i][1];
//             if(w[idx]<=W)
//             {
//                 ans+=v[idx];
//                 W-=w[idx];
//             }
//             else
//             {   
//                 ans+=(r[i][0])*W;
//                 break;
//             }
//         }

//         System.err.println(ans);

//     }
    
// }
