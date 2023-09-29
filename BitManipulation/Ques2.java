public class Ques2 {

    public static void swap1(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + " " + y);
    }

    public static void swap2(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap1(a, b);
        swap2(a, b);
    }
}
