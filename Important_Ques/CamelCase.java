public class CamelCase {

    public static void main(String[] args) {

        String str = "hi, i am shubh";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sb.append(Character.toUpperCase(str.charAt(i++)));
        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i++));
                sb.append(Character.toUpperCase(str.charAt(i++)));
            } else
                sb.append(str.charAt(i++));
        }

        String ans = sb.toString();

        System.out.println(ans);
    }

}
