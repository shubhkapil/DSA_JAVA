public class transpose {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5, 6 }, { 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8 } };
        int n = arr.length;
        int m = arr[0].length;

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }

    }
}