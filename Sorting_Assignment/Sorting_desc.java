public class Sorting_desc
{
    public static void selection_desc(int a[],int n)
    {
        int max_pos;

        for(int i=0;i<n;i++)
        {
            max_pos=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[max_pos]<a[j]) {
                    max_pos =j;
                }
            }

            int t = a[max_pos];
            a[max_pos] = a[i];
            a[i] = t;
            
        }
        print(a,a.length);
        
    }
    

    //Some Error of -1 Index is encountered
    
    // public static void insertion_desc(int a[],int n)
    // {

    //     for(int i=1;i<n;i++)
    //     {
    //         int temp = a[i];
    //         int j=i-1;
    //         while(a[j]<temp && j>=0)
    //         {
    //             a[j+1]=a[j];
    //             j--;
    //         }
    //         a[j+1]=temp;
    //     }
    //     print(a,a.length);
    // }

    public static void bubble_desc(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                while(a[j+1]>a[j])
                {
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
        print(a,n);
    }

    public static void Countsort_desc(int a[],int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        int arr [] = new int[max+1];

        for(int i=0;i<n;i++)
        {
            arr[a[i]]++;
        }
        int j=0;
        for(int i=0;i<max+1;i++)
        {
            while(arr[i]>0)
            {
                a[j] = arr[i];
                arr[i]--;
                j++;
            }
        }
        print(a,n);
    }

    public static void print (int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        int a[] ={3,6,2,1,8,7,4,5,3,1};
        // selection_desc(a,a.length);
        // insertion_desc(a,a.length);
        bubble_desc(a,a.length);
 
    }
}