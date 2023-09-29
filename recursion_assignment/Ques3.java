//length of string using recurssion
package recursion_assignment;

public class Ques3 {

    public static int length(int i, String s) {

        if (i == s.length())
            return 0;

        return (1 + length(i + 1, s));

    }

    public static void main(String[] args) {

        String s = "Shubh Kapil";

        System.out.println(length(0, s));
    }

}
