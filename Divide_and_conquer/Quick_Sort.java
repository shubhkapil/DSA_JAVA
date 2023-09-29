public class temp {

    public static int partition(int[] arr,int si,int ei)
    {
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<=ei;j++)
        {
            if(arr[j]<= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // int temp = arr[i+1];
        // arr[i+1] = arr[ei];
        // arr[ei] = temp;
        return i;
    }
    public static void quicksort(int[] arr,int si,int ei)
    {
        if(si<ei)
        {
        int pidx = partition(arr, si,ei);
        quicksort(arr, si, pidx-1);
        quicksort(arr, pidx+1, ei);               
        }
    }
    public static void show(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[] ={7,3,9,1,5};
        show(arr);
        quicksort(arr,0,arr.length-1);
        show(arr);
       
    }
    
}
