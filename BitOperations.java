import java.util.*;

public class BitOperations {

    public static int CheckBit(int n, int i) {
        int t = (1 << i);
        if ((n & t) == 0)
            return 0;
        return 1;
    }

    public static int CheckBitLoop(int n, int i) {
        while (i-- > 0) {
            n = n >> 1;
        }
        return (n & 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int i = 0;
        i = sc.nextInt();

        System.out.println(CheckBit(n, i));
        System.out.println(CheckBitLoop(n, i));
    }

}
