public class LolQues {

    public static int solve(int a,int b,char c)
    {
        if(c=='A')
            return a|b;
        else if(c=='B')
            return a&b;
        else if(c=='C')
            return a^b;
        
        return -1;
    }
    public static void main(String[] args)
    {
        String s = "1C0A1B0C1A1B0";
        int ans =  (s.charAt(0)=='0') ? 0 : 1;

        for(int i=1;i<s.length()-1;i+=2)
        {
            int num = (s.charAt(i+1)=='0') ? 0 : 1;
            ans = solve(ans,num,s.charAt(i));
        }
        System.out.println(ans);

    }
    
}
