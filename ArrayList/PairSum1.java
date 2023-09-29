import java.util.*;

import javax.lang.model.util.ElementScanner14;

class PairSum1
{

    public static boolean FindPairSum(ArrayList<Integer> arr,int k)
    {
        int i=0;
        int j= arr.size()-1;
        boolean f = false;

        while(i<j)
        {
            int s = arr.get(i)+arr.get(j);
            if(s==k)
            {
                System.out.println(arr.get(i)+" "+arr.get(j));
                i++;
                j--;
                f=true;
            }
            else if(s>k)
                j--;
            else
                i++;
                
        }
        return f;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
        int k = 10;
        System.out.println(FindPairSum(list,k));

    }
}