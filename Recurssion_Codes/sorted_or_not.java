package Recurssion_Codes;

public class sorted_or_not {

    public static boolean is_sorted(int arr[], int i) {
        if (i == arr.length - 1)
            return true;
        if (arr[i] > arr[i + 1])
            return false;
        i++;
        return is_sorted(arr, i);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 2, 5, 3, 2, 4, 6, 1 };

        System.out.println(is_sorted(arr, 0));
    }

}
