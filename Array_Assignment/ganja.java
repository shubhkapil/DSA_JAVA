public class ganja{

    public static void FillnPrint(int arr[],int i)
    {
        if(i==5)
            return;
             
    
        arr[i] = i+1;
        FillnPrint(arr,i+1);
        System.out.println(arr[i]);

    }
    public static void main(String[] args)
    {
        int arr[] = new int[5];

        FillnPrint(arr,0);
    }
}