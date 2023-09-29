//Array sorted and rotated

public class PairSum2 {

    public static boolean FindPairs(int arr[], int k) {

        boolean f = false;
        int n = arr.length;
        int j = 0;

        int i = 0;
        while (i < n - 1) {
            if (arr[i + 1] < arr[i])
                j = i;
            i++;
        }
        i = j + 1;
        while (i != j) {
            
            //Instead of this we can use mod
            //j=(n+j-1)%n
            //i=(i+1)%n
            if (j < 0)
                j = n - 1;
            if (i > (n - 1))
                i = 0;

            int s = arr[i] + arr[j];
            if (s == k) {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
                f = true;
            } else if (s > k)
                j--;
            else
                i++;
        }

        return f;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 9, 10, 11, 1, 2, 3, 4, 5 };
        int k = 4;
        System.out.println(FindPairs(arr, k));
    }
}
