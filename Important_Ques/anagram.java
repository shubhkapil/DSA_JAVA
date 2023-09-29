//Compare to strings are Anagram or not

public class anagram {
    public static void main(String[] args) {
        int f = 0;
        String str1 = "earth";
        String str2 = "heartu";
        str1.toLowerCase();
        str2.toLowerCase();
        int s1[] = new int[26];
        int s2[] = new int[26];

        for (int i = 0; i < str1.length(); i++)
            s1[str1.charAt(i) - 'a']++;

        for (int i = 0; i < str2.length(); i++)
            s2[str2.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (s1[i] != s2[i]) {
                f = 1;
                break;
            }
        }

        if (f == 1)
            System.out.println("Not an anagram");
        else
            System.out.println("Anagram");
    }
}
