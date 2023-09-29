import java.util.*;


public class Functions {

    public static int cal(int a,int b)
{
    return (a+b);
}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a= sc.nextInt();
  
        b = sc.nextInt();
        System.out.println(cal(a,b));

        sc.close();

    }


    
}
