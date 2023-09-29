package Recurssion_Codes;

// T.C - O(n)
// S.C - O(n) -> because of n call stacks + n is the size of array
public class First_occur {

    public static int first_occ(int arr[], int i, int key) {
        if (i == arr.length)
            return -1;

        if (arr[i] == key)
            return i;

        return first_occ(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(first_occ(arr, 0, 5));
    }

}
