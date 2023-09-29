//Some Error in This Code
// Infinite time print';


public class Sudoku {

    public static boolean f = false;

    public static boolean check(int r, int c, int k, int[][] arr) {
        for (int i = 0; i <= 8; i++) {
            if (arr[i][c] == k)
                return false;
        }

        for (int j = 0; j <= 8; j++) {
            if (arr[r][j] == k)
                return false;
        }

        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == k)
                    return false;
            }
        }

        return true;
    }

    public static boolean solvesudoku(int r, int c, int[][] arr) {
        // Base Case
        if (r == 9) {
            print(arr);
            return true;
        }

        int nextR = r;
        int nextC = c + 1;

        if (c+1 == 9) {
            nextR += 1;
            nextC = 0;
        }

        if (arr[r][c] != 0) {
            solvesudoku(nextR, nextC, arr);
        }

        for (int digi = 1; digi <=9; digi++) {
            if (check(r, c, digi, arr)) {
                arr[r][c] = digi;
                if(solvesudoku(nextR, nextC, arr))
                    return true;
                arr[r][c] = 0; // backtracking
            }
        }
    
        return false;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                        { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                        { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                        { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                        { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                        { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                        { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                        { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                        { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if(solvesudoku(0, 0, arr))
           System.out.println("ANS EXIST");
        else
            System.out.println("Does Not"); 
    }

}
