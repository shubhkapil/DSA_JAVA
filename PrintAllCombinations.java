// Java program to print all the combinations of balanced
// parenthesis.
import java.util.*;
 
class PrintAllCombinations {
    public static void
    generateParenthesis(int n, int open, int close,
                        String s, ArrayList<String> ans)
    {
        if (open == n && close == n) {
            ans.add(s);
            return;
        }
        if (open < n) {
            generateParenthesis(n, open + 1, close, s + "{",
                                ans);
        }
        if (close < open) {
            generateParenthesis(n, open, close + 1, s + "}",
                                ans);
        
        }
    }

    public static void
    generateParenthesisDfs(int open,int close,String s, ArrayList<String> ans)
    {
        if(open==0 && close==0)
        {
            ans.add(s);
            return;
        }

        if(open < close || open<0 || close<0)
            return ;

        s+=")";
        generateParenthesisDfs(open-1,close,s,ans );
        s=s.substring(0,(s.length()-1));

        s+="(";
        generateParenthesisDfs(open,close-1,s,ans );
        s = s.substring(0, (s.length()-1));
    }
 
    public static void main(String[] args)
    {
        int n = 3;
 
        ArrayList<String> ans = new ArrayList<>();
 
        //generateParenthesis(n, 0, 0, "", ans);
        generateParenthesisDfs(n, n, "", ans);
        System.out.println(ans);
        for (String s : ans) {
            System.out.println(s);
        }
    }
}