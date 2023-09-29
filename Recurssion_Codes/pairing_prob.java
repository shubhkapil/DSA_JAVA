package Recurssion_Codes;

public class pairing_prob {

    public static int total_pair(int n)
    {
        if(n==1 || n==2)
            return n;
        int fm1 = total_pair(n-1);
        int fm2 = (n-1)*total_pair(n-2);

        return (fm1+fm2);
    }
    public static void main(String[] args)
    {
        System.out.println(total_pair(3));
        
    }
    
}
