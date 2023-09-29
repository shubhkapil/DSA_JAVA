import java.util.*;

public class ShortestPath {

    public static void main(String[] args)
    {
        String str = "WNEENESENNN";
        int fi=0;
        int fj=0;
        for(int i=0;i<str.length();i++)
        {
            switch(str.charAt(i))
            {
                case 'N':   fj++;
                            break;
                case 'S':   fj--;
                            break;
                case 'W':   fi--;
                            break;
                case 'E':   fi++;
                            break;
            }
        }

        System.out.println("Total Distance: "+ Math.sqrt(Math.pow(fi,2) + Math.pow(fj,2) ));

    }
    
}
