public class StairCase {

    // BRUTE FORCE FOR FINDING A KEY IN SORTED 2D ARRAY
    public static void BruteForce(int arr[][], int k) {
        int n = arr.length;
        int m = arr[0].length;
        int f = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    System.out.println("Found");
                    f = 1;
                    break;
                }
            }
        }
        if (f == 0)
            System.out.println("N0t F0und");
    }

    public static int Binary(int a[], int f, int l, int k) {
        if (f > l)
            return 0;

        int m = (f + l) / 2;
        if (a[m] == k)
            return 1;
        if (a[m] > k)
            return Binary(a, f, m - 1, k);
        else
            return Binary(a, m + 1, l, k);

    }

    // O(nlogn) approach to find a key in sorted 2d array
    public static void RowWiseBinary(int arr[][], int k) {
        int n = arr.length;
        int m = arr[0].length;
        int f = 0;
        for (int i = 0; i < n; i++) {
            if (Binary(arr[i], 0, m - 1, k) == 1) {
                System.out.println("Found");
                f = 1;
                break;
            }
        }

        if (f == 0)
            System.out.println("Not Found");

    }

    // O(n) approach for Finding a key in a Sorted 2D array

    public static int Staircase(int arr[][], int i, int j, int k) {
        if (i < 0 || i > arr.length || j > arr[0].length || j < 0)
            return 0;
        if (arr[i][j] == k) {
            System.out.println((i + 1) + " " + (j + 1));
            return 1;
        }

        else if (arr[i][j] > k)
            return Staircase(arr, i, j - 1, k);
        else
            return Staircase(arr, i + 1, j, k);

    }

    public static void main(String[] args) {

        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

        int k = 37;

        // RowWiseBinary(arr, k);
        int ans = Staircase(arr, 0, arr[0].length - 1, k);
        if (ans == 1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
