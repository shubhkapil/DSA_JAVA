public class Indian_coins {
    public static void main(String[] args)
    {
        int denomi[] = {1,2,5,10,20,50,100,200,500,1000,2000};
        int v=590;
        int count = 0;
        int j = 0;
        while(denomi[++j]<v && j<denomi.length);
        j--;
        while(j>=0)
        {
            if(v>=denomi[j])
            {
                v-=denomi[j];
                System.out.print(denomi[j]+" ");
                count++;
            }
            else
                j--;
        }
        System.out.println();
        System.out.println(count);
    }
}
