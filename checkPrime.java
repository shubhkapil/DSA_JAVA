import java.util.*;


public class checkPrime
{
    static void check(int a)
    {
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0)
            {
                System.out.println("No");
                return;
            }
           
        }
        System.out.println("Yes");
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        check(n);
        sc.close();
    }
}