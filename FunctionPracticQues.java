import java.util.*;


public class FunctionPracticQues{


    public static void calAvg(int a,int b,int c)
    {
        System.out.println("The avg is: "+ (double)(a+b+c)/3);
    }

    public static void checkEven(int a)
    {
       if(a%2==0)
       {
        System.out.println(a+" is even");
       }
       else
       {
        System.out.println(a+" is odd");
       }
    }

    public static void checkPalin(int b)
    {
        int n  =b;
        int rev=0;
        while(n>0)
        {
            System.out.println(rev);
            rev = rev*10 + n%10;
            n/=10;
        }
        if(rev==b)
        {
            System.out.println("It is a pallindrom");
        }
        else{
            System.out.println("naah not a pallin");
        }
    }

    public static void digiSum(int c )
    {
        int sum=0;
        while(c>0)
        {
            sum+= c%10;
            c/=10;
        }
        System.out.println("The sum of digit is :"+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        calAvg(a,b,c);
        checkEven(a);
        checkPalin(b);
        digiSum(c);
    }
}