package Recurssion_Codes;

public class inc_print {

    public static void print_inc(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        print_inc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        print_inc(6);
    }
    
}
