package Recurssion_Codes;

public class fac {
    
    public static int fac(int n)
    {
        if(n==0)
            return 1;
        return n*fac(n-1);
    }
    public static void main(String[] args) {

        System.out.println(fac(5));
    }
}
