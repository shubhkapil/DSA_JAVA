import java.util.*;

public class ques2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {0,1,2,3,4,5,6,7,8,9};
        int ra[] = new int[a.length];
        int k = sc.nextInt();
        int t = sc.nextInt();
        int n = a.length;
        int i,j=0;

        //Rotating The array:
        for(i =k;i<n;i++) {
            ra[j]=a[i];
            j++;
        }
        i=0;
        for(i=0;i<k;i++) {
            ra[j] = a[i];
        }

        int f=0;
        i=0;j=n-1;
        int m =k;
        while(i<m && k<j)
        {
            int mi = (i+m)/2;
            int mj = (k+j)/2;

            if(ra[mi]==t){
                System.out.println("Found at: "+mi);
                f=1;
                break;
            }
            else if(ra[mj]==t){
                System.out.println("Found at: "+mj);
                f=1;
                break;
            }
            else if(t>ra[mi])
                i=mi+1;
            else if(t<ra[mi])
                m=mi-1;
            else if(t>ra[mj])
                k=mj+1;
            else if(t<ra[mj])
                j=mj-1;
        }
        
        if(f==0)
        {
            System.out.println("Not Found");
        }

        sc.close();
    }
    
}
