public class SpiralMatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };
        // int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        // int a[][] = {{1}};
        int n = a.length;
        int m = a[0].length;
        int up = 0;
        int bottom = n - 1;
        int right = m - 1;
        int left = 0;

        while (up <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(a[up][i] + " ");

            for (int i = up + 1; i <= bottom; i++)
                System.out.print(a[i][right] + " ");

            for (int i = right - 1; i >= up; i--)
                System.out.print(a[bottom][i] + " ");

            for (int i = bottom - 1; i > up; i--)
                System.out.print(a[i][left] + " ");

            up++;
            bottom--;
            right--;
            left++;
        }

    }
}