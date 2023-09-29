import java.util.Scanner;

public class Sanyam2 {

    double findHalfAreaPoint(Curve c, double p )
    {
        double halfArea = p/2;

        double s = 0;
        double e = p;
        double mid = p/2;

        while(s<=e)
        {
            if(c.areaUnderCurve(mid)==halfArea)
                return mid;
            else if(c.areaUnderCurve(mid)>halfArea)
                e = mid-1;
            else
                s = mid+1;
        }
        return 0;
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double x1 = sc.nextInt();
        double x2 = sc.nextInt();
        Curve c = new Curve(s,x,y);
        double p = c.areaUnderCurve(x2);

        findHalfAreaPoint(c,p);


    }
    
}
