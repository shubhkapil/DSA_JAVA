public class Ques4 {

    public static String changeToLower(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += (char)(str.charAt(i) | ' ') ;
        }
        return ans;
    }
    public static String changeToUpper(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += (char)(str.charAt(i) & ~32) ;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(changeToLower("ABC"));
        System.out.println(changeToUpper("abc"));
    }
}
