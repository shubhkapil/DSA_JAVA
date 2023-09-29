import java.util.*;

class Max_length_chain_in_pair {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        int cnt = 1;
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int last_end = pairs[0][1];
        System.out.print(pairs[0][0] + " " + pairs[0][1] + " ");
        for (int i = 1; i < pairs.length; i++) {
            if (last_end < pairs[i][0]) {
                cnt++;
                last_end = pairs[i][1];
                System.out.print(pairs[i][0] + " " + pairs[i][1] + " ");
            }
        }
        System.out.println();
        System.out.println(cnt);

    }
}