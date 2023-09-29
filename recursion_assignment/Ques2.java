//print number to english -> 2019 = two zero one nine

package recursion_assignment;

public class Ques2 {

        static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        public static void convert(int n) {
                if (n == 0)
                        return;

                // int t = n/10;
                int t = n % 10;
                convert(n / 10);
                System.out.println(digit[t] + " ");
        }

        public static void main(String[] args) {
                convert(2019);
        }
}