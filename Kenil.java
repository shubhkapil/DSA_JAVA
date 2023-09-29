// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class Kenil {

//     public static int getMinTime(List<Integer> task_memory, List<Integer> task_type, int max_memory) {
//         int n = task_memory.size();
//         Map<Integer, Integer> memoryMap = new HashMap<>();

//         int minTime = 0;
//         for (int i = 0; i < n; i++) {
//             int currentMemory = task_memory.get(i);
//             int currentType = task_type.get(i);

//             if (memoryMap.containsKey(currentType)) {
//                 int pairedMemory = memoryMap.get(currentType);
//                 if (currentMemory + pairedMemory <= max_memory) {
//                     minTime += 2; // Two tasks are processed in parallel
//                     memoryMap.remove(currentType);
//                 } else {
//                     memoryMap.put(currentType, currentMemory);
//                 }
//             } else {
//                 memoryMap.put(currentType, currentMemory);
//             }
//         }
//        int remainingTasks = memoryMap.size();
//         minTime += remainingTasks;

//         return minTime;
//     }

//     public static void main(String[] args) {
//         List<Integer> task_memory = List.of(1, 2, 5);
//         List<Integer> task_type = List.of(1, 2,3);
//         int max_memory = 6;
//         int minTime = getMinTime(task_memory, task_type, max_memory);
//         System.out.println(minTime); // Output: 4
//     }
// }

import java.util.Stack;

class Result {
    public static String getString(String input_str) {
        int n = input_str.length();
        Stack<Character> st = new Stack<>();
        int[] visited = new int[26];
        int[] cnt = new int[26];

        for (int i = 0; i < 26; i++) {
            visited[i] = 0;
            cnt[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            cnt[input_str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            cnt[input_str.charAt(i) - 'a']--;

            if (visited[input_str.charAt(i) - 'a'] > 0) {
                continue;
            }

            while (!st.empty() && st.peek() < input_str.charAt(i) && cnt[st.peek() - 'a'] != 0) {
                visited[st.peek() - 'a'] = 0;
                st.pop();
            }

            st.push(input_str.charAt(i));
            visited[input_str.charAt(i) - 'a'] = 1;
        }
        StringBuilder result = new StringBuilder();
        while (!st.empty()) {
            result.insert(0, st.peek());
            st.pop();
        }

        return result.toString();
    }
}


public class Kenil {
    public static void main(String[] args) {
        String input_str = "abacaba";
        String output = Result.getString(input_str);
        System.out.println("Input: " + input_str);
        System.out.println("Output: " + output);
    }
}


// When you run the `Main` class, it will call the `getString` function with the input string "abacaba" and print the output:


// Input: abacaba
// Output: cba

