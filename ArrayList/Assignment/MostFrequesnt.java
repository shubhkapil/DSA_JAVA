package Assignment;

import java.util.*;

public class MostFrequesnt {

    public static int mostFreq(ArrayList<Integer> arr, int key) {
        int target = 0;
        int ans = 0;
        int tc = 0;
        int maxtc = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == key) {
                target = arr.get(i + 1);
                tc = 1;
                j = i + 1;
            }

            for (int k = j + 1; k < arr.size() - 1; k++) {
                if (arr.get(k) == key && arr.get(k + 1) == target)
                    tc++;
            }

            if (tc > maxtc) {
                ans = target;
                maxtc = tc;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 3));
        int k = 2;
        System.out.println(mostFreq(arr, k));
    }

}
