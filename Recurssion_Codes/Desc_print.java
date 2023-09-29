package Recurssion_Codes;

public class Desc_print {

    public static void print_desc(int n)
    {
        if(n==0)
            return;
        
        System.out.println(n);
        print_desc(n-1);
    }
    
    public static void main(String[] args)
    {
        print_desc(9);
    }
}
