
//Find x^x for any given x
import java.util.*;

class Ques1 {
    // o(logn)(DnC)
    public static int FindPow1(int x, int y) {
        if (y == 1)
            return x;
        else if (y == 0)
            return 1;

        int ans = FindPow1(x, y / 2);

        if (y % 2 == 0)
            return ans * ans;
        else
            return x * ans * ans;
    }

    // o(logn)(Fast Exponent Method)
    public static int FindPow2(int x, int y) {

        int a = x;
        int ans = 1;
        while (y > 0) {
            if ((y & 1) == 1) {
                ans *= a;
            }
            a = a * a;
            y = y >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(FindPow1(x, x));
        System.out.println(FindPow2(x, x));
        sc.close();
    }
}