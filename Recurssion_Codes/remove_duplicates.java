package Recurssion_Codes;

public class remove_duplicates {

    public static void remove_dupli(int i, String s, StringBuilder newstr, boolean map[]) {

        if (i == s.length()) {
            System.out.println(newstr);
            return;
        }

        if (map[s.charAt(i) - 'a'] == false) {
            map[s.charAt(i) - 'a'] = true;
            newstr.append(s.charAt(i));
        }

        remove_dupli(i + 1, s, newstr, map);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        boolean arr[] = new boolean[26];
        remove_dupli(0, "shubhshubhkasu", str, arr);
    }

}
