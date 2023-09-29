
//Given String as aaaabbbccccc o/p = a4b3c5
public class stringCompression {

    public static void main(String[] args) {
        String str = "aaaabbcccccc";

        StringBuilder sb = new StringBuilder();
        int i = 0;
        Character ch = str.charAt(i++);
        Integer cnt = 1;
        while (i < str.length()) {

            if (str.charAt(i) == ch) {
                cnt++;
                i++;
            } else {
                sb.append(ch.toString());
                sb.append(cnt.toString());
                ch = str.charAt(i);
                i++;
                cnt = 1;
            }

        }
        sb.append(ch.toString());
        sb.append(cnt.toString());

        String ans = sb.toString();

        System.out.println(ans);
    }

}
