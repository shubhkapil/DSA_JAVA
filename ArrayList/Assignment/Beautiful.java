//Check Apna Soln

//imp

package Assignment;
import java.util.*;

public class Beautiful {

public static void main(String[] args)
{
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>();
    for(int i=0;i<n;i++)
        a.add(i+1);
    
    for(int i=1;i<n-1;i++)
    {
        if(2*a.get(i)==a.get(i-1)+a.get(i+1))
            Collections.swap(a,i-1,i);
    }

    System.out.println(a);

}
    
}
