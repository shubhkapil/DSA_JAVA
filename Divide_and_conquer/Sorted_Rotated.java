
//Find the given element in a sorted and rotated Array with distinct elements.
package Divide_and_conquer;


public class Sorted_Rotated {


    public static int find(int arr[],int si,int ei,int k)
    {
        if(si>ei)
            return -1;
        
        int mid = si + (ei-si)/2;

        if(k==arr[mid])
            return mid;

        if(arr[si]<=arr[mid])
        {
            if(k>=arr[si] && k<=arr[mid])
                return find(arr,si,mid-1,k);
            else
                return find(arr,mid+1,ei,k);
        }
        
        else
        {
            if(k>=arr[mid] && k<=arr[ei])
                return find(arr,mid+1,ei,k);
            else
                return find(arr,si,mid-1,k);
        }
     
    }

    public static void main(String[] args)
    {
        int arr[] = {4,5,6,7,0,1,2};

        int ans = find(arr,0,arr.length-1,0);
        System.out.println(ans);
    }
    
}
