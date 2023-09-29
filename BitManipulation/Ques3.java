public class Ques3 {

    public static int addOne(int x) {
        return -~x;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.println(addOne(x));
    }
}
