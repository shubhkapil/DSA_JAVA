public class ques5 {

    public static void main(String[] args)
    {
        int a[] = {-1, 0,  1, 2, -1, -4};
        int n = a.length;
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k]==0)
                    {
                        System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
                    }
                }
            }
        }
    }
    
}
