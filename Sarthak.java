// import java.util.*;
// public class Sarthak {

//     public static boolean solve(Deque<Integer> d,int n, int s,int g)
//     {
//         if(d.isEmpty())
//         {
//             if(s>=g)
//                 return true;
//             return false;
//         }

//         //choose min
        
//         //choose max
//     }
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String in = sc.nextLine();

//         String[] str = in.split(",");
//         int[] arr = new int[str.length];

//         for(int i =0;i<str.length;i++)
//         {
//             arr[i] = Integer.parseInt(str[i]);
//         }
        

//         Deque<Integer> d = new ArrayDeque<>();
//         int n = arr.length;
//         for(int i=0;i<n;i++)
//         {
//             d.add(arr[i]);
//         }

//         boolean b = solve(d,n,0,0);
//         System.out.println(b);
//     }
// }



// import java.util.*;
// public class Sarthak {
    
//     public static boolean solve(int[] arr,int n ,int m)
//     {
//         int[] l = new int[n];
//         int[] r = new int[n];
//         l[0] = arr[0];
//         r[n-1] = arr[n-1];

//         for(int i=1;i<n;i++)
//             l[i] = arr[i] + l[i-1];
        
//         for(int i=n-2;i>=0;i--)
//             r[i] = arr[i] + r[i+1];
        
//         for(int i = 0;i<n;i++)
//         {
//             if(l[i]==m)
//                 return true;
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(r[i]==m)
//                 return true;
//         }
//         return false;

//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String temp = sc.nextLine();
//         String s = sc.nextLine();
//         String[] str = s.split(",");
//         int arr[] = new int[n];
//         for(int i =0;i<n;i++)
//             arr[i] = Integer.parseInt(str[i]);
//         int m = sc.nextInt();

//         System.out.println(solve(arr,n,m));

//         double d= 12113.23312;
//         System.out.printf("%.2f",d);
//     }
// }

import java.util.*;

public class Sarthak
{

    public static int solve(int n , int[] p)
    {
        int ans = 0;
        

        return ans;
    }
    public static void main(String[] arg)
    {
        int p[] = {3,3,3,4,4,1,8};
        int n = p.length;
    }
}