//Can be optimized using MAP

package Assignment;

import java.util.*;

// public class Lonelynumber {

//     public static int count(ArrayList<Integer> a, int k) {

//         int ans = 0;
//         for (int i = 0; i < a.size(); i++) {
//             if (a.get(i) == k)
//                 ans++;
//         }
//         return ans;
//     }

//     public static ArrayList<Integer> printans(ArrayList<Integer> a) {
//         ArrayList<Integer> ans = new ArrayList<Integer>();

//         for (int i = 0; i < a.size(); i++) {
//             if (count(a, a.get(i)) == 1 && a.contains(a.get(i) + 1) == false && a.contains(a.get(i)-1) == false) {
//                 ans.add(a.get(i));
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,3,5,3));
//         System.out.println(printans(arr));
//     }

// }

public class Lonelynumber {

    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> a) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            if (i == 0) {
                if (a.get(i + 1) != a.get(i) + 1)
                    res.add(a.get(i));
            } else if (i == a.size() - 1) {
                if (a.get(i - 1) != a.get(i) - 1)
                    res.add(a.get(i));
            }

            else if (a.get(i - 1) != a.get(i) - 1 && a.get(i - 1) != a.get(i) && a.get(i + 1) != a.get(i) + 1
                    && a.get(i + 1) != a.get(i))
                res.add(a.get(i));
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10,6,5,8));
        ArrayList<Integer> ans = lonelyNumber(arr);
        System.out.println(ans);
    }

}
