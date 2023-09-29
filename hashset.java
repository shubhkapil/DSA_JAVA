import java.util.*;

public class hashset {
    public static void main(String[] args){



        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        h.put(1,1);
        h.put(23,4);

        System.out.println(h);

        for(Map.Entry e:h.entrySet())
        {
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
