//Find all index of the key.

package recursion_assignment;


public class Ques1 {

public static void print_index(int arr[],int i,int k)
{
    if(i==arr.length)
        return;
    if(arr[i]==k)
        System.out.println(i);
    print_index(arr,i+1,k);
}

public static void main(String[] args)
{
    int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    print_index(arr, 0, 2);
}
    
}
