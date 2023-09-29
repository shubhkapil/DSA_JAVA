package Assignment;
import java.util.*;

public class Monotonic {

    public static boolean check(ArrayList<Integer> arr)
    {
        if(arr.get(0)<arr.get(1))
        {
            int i =0;
            while(i<arr.size()-1)
            {
                if(arr.get(i)>arr.get(i+1))
                    return false;
                i++;
            }
        }
        else
        {
            int i =0;
            while(i<arr.size()-1)
            {
                if(arr.get(i)<arr.get(i+1))
                    return false;
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,8,4,4,5,5,6)); 

        System.out.println(check(arr));
    }
    
}

//Or APNA ANS:

// public static boolean isMonotonic(Array<Integer> a) {
//     boolean inc = true;
//     boolean dec = true;

//     for(int i=0;i<a.size()-1,i++)
//     {
//         if(a.get(i)>a.get(i+1))
//             inc= false;
//         if(a.get(i)<a.get(i+1))
//             dec=false;
//     }

//     return inc||dec;
// }
