import java.util.*;


/*
 ***** 
 *   *
 *   *
 *****
 */

// public class patternsAdv {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i =1;i<=n-1;i++){

//             for(int j =1;j<=n;j++){
//                 if(i==1 || i==n-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     if(j==1 || j==n)
//                     {
//                         System.out.print("*");
//                     }
//                     else
//                     {
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
    
// }


/*
    * 
   ** 
  ***
 ****
 */

// public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for(int i=0;i<n;i++) 
//             {
//                 for(int j = 0;j<n-i-1;j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int j=0;j<=i;j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
        
//     }

/*
 ***** 
 ****
 *** *
 ** **
 * ***
 *****
 */

 
// public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for(int i=0;i<n+1;i++) 
//             {
//                 if(i==0 || i==n)
//                 {
//                     for(int j=0;j<n;j++){
//                         System.out.print("*");
//                     }
//                 }
//                 else
//                 {   
//                     int j;
//                     for(j=0;j<n-i;j++)
//                     {
//                         System.out.print("*");
//                     }
//                     System.out.print(" ");
//                     j++;
//                     for(;j<n;j++)
//                     {
//                         System.out.print("*");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
        
//     }


/*
 12345
 1234
 123
 12
 1
 */

 
// public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for(int i=1;i<=n;i++) 
//             {
//                 for(int j=1;j<=n-i+1;j++)
//                 {
//                     System.out.print(j);
//                 }
//                 System.out.println(" ");
//             }
//         }
        
//     }


/*
 Floyds Triangle
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */

// public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int cnt = 1;
//             for(int i=0;i<n;i++) 
//             {
//                 for(int j=0;j<=i;j++)
//                 {
//                     System.out.print(cnt++ + " ");
//                 }
//                 System.out.println();
//             }
//         }
        
//     }

/*
 1
 01
 101
 0101
 10101
 */

// public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int cnt = 1;
//             for(int i=0;i<n;i++) 
//             {
//                 for(int j=0;j<=i;j++)
//                 {
//                     System.out.print(cnt + " ");
//                     cnt = (cnt==1)?0:1;
//                 }
//                 System.out.println();
//             }
//         }
        
//     }

/*
 ButterFly: 
 *      *
 **    **
 ***  ***
 ********  
 ********
 ***  ***
 **    **
 *      *
 
*/

//  public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();

//             for(int i=1;i<=n;i++) 
//             {

//                 for(int j=1;j<=i;j++)
//                 {
//                     System.out.print("*");
//                 }
//                 for(int j=0;j<2*(n-i);j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int j=1;j<=i;j++)
//                 {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//             for(int i=n;i>=0;i--) 
//             {

//                 for(int j=1;j<=i;j++)
//                 {
//                     System.out.print("*");
//                 }
//                 for(int j=0;j<2*(n-i);j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int j=1;j<=i;j++)
//                 {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
        
//     }

/*
     *****
    *****
   *****
  *****
 *****
 */

// public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for(int i=0;i<n;i++) 
//             {
//                 for(int j = 0;j<n-i-1;j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int j=0;j<n;j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
        
//     }


/*
     *****
    *   *
   *   *
  *   *
 *****

 */

// public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for(int i=0;i<n;i++) 
//             {
//                 if(i==0 || i==n-1)
//                 {
//                     for(int j = 0;j<n-i-1;j++)
//                     {
//                         System.out.print(" ");
//                     }

//                     for(int j=0;j<n;j++){
//                         System.out.print("*");
//                     }
//                 }
//                 else
//                 {
//                     for(int j = 0;j<n-i-1;j++)
//                     {
//                         System.out.print(" ");
//                     }

//                     for(int j=0;j<n;j++){
                        
//                         if(j==0 || j==n-1)
//                         {
//                             System.out.print("*");
//                         }
//                         else
//                         {
//                             System.out.print(" ");
//                         }
//                     }
//                 }     
//                 System.out.println();
//             }
//         }
        
//     }

/*
DiaMond: 

    *
   ***
  *****
 *******
  *****
   ***
    *
 */

 
// public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for(int i=0;i<n-1;i++) 
//             {
//                 for(int j = 0;j<n-i-1;j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int j=0;j<2*i+1;j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }


//             for(int i=0;i<2*n-1;i++){
//                 System.out.print("*");
//             }


//             System.out.println();
//             for(int i=n-2;i>=0;i--) 
//             {
//                 for(int j = 0;j<n-i-1;j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int j=0;j<2*i+1;j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
        
//     }

/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */

//  public class patternsAdv {

//         public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for(int i=1;i<=n;i++) 
//             {
//                 //total: j=2*n+1
//                 for(int j = 1;j<=n-i;j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int j=1;j<=i;j++){
//                     System.out.print(i+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

/*
    1
   212
  32123
 4321234
543212345
 */

// public class patternsAdv {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++) 
//         {
//             //total: j=2*n+1
//             for(int j = 1;j<=n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(int j=2;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }