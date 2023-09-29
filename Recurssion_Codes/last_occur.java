package Recurssion_Codes;

// T.C - O(n)
// S.C - O(n) -> because of n call stacks + n is the size of array
public class last_occur {

    public static int last_occ(int arr[], int i, int key) {
        
        if(i==arr.length)
            return -1;
        int k = last_occ(arr, i + 1, key);

        if(k==-1 && arr[i]==key)
            return i;
        
        return k;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5 };
        System.out.println(last_occ(arr, 0, 5));
    }

}
