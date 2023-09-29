public class ques1 {

    public static int check(int a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[j]==a[i])
                    return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,1,1,2,3};

        int ans = check(a);

        if(ans==0)
            System.out.println("True");
        else
            System.out.println("False");
    }
    
}
