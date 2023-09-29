import java.util.HashMap;

public class Rohan {

    public static void main(String[] args)

    {
        int arr[] = {1,7,7,7,1,1};

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++)
            mp.put(arr[i],mp.get(arr[i])!=null ? mp.get(arr[i])+1 : 1);

        int n = mp.size();

        int temp[] = new int[n];
        int i = 0;
        int minVal = Integer.MAX_VALUE;
        for(Integer j : mp.values())
        {
            temp[i++] = j;
            minVal = Math.min(minVal,j);
        }

        int ans = 0;

        for(i =0;i<n;i++)
        {
            if(temp[i]==minVal || temp[i] == (minVal+1))
                ans+=1;
            else  
                ans+= (temp[i]/(minVal+1))+1;
        }
        System.out.println(ans);
            
        
        
        
    }
    
}
