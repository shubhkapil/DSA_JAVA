//TC: O(N)
//SC: O(1)

// Java implementation of the approach

class GFG {

    static int maxWater(int[] arr, int n) {

        // Indices to traverse the array
        int left = 0;
        int right = n - 1;

        // To store Left max and right max
        // for two pointers left and right
        int l_max = 0;
        int r_max = 0;

        // To store the total amount
        // of rain water trapped
        int result = 0;
        while (left <= right) {

            // We need check for minimum of left
            // and right max for each element
            if (r_max <= l_max) {

                // Add the difference between
                // current value and right max at index r
                result += Math.max(0, r_max - arr[right]);

                // Update right max
                r_max = Math.max(r_max, arr[right]);

                // Update right pointer
                right -= 1;
            } else {

                // Add the difference between
                // current value and left max at index l
                result += Math.max(0, l_max - arr[left]);

                // Update left max
                l_max = Math.max(l_max, arr[left]);

                // Update left pointer
                left += 1;
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 8, 4, 2 };
        int N = arr.length;
        System.out.print(maxWater(arr, N));
    }
}

// This code is contributed by rutvik_56.

// TC: O(max(MAX_LENGTH,N))
// SC: O(1)

// Java program to determine how much amount of water can an
// elevation map store given in the form of an array of
// height of n points

// class GFG {

// public static int trappedWater(int arr[])
// {
// // To store the number of blocks
// int n = arr.length;

// // To store the sum of all the heights
// int num_blocks = 0;

// // To store the maximum height in the array
// int max_height = Integer.MIN_VALUE;

// // Compute the sum of all heights and the
// // maximum height given in the array
// for (int i = 0; i < n; i++) {
// max_height = Math.max(max_height, arr[i]);
// num_blocks += arr[i];
// }

// // To store the answer and initialise
// // the left and right pointers
// int total = 0, left = 0, right = n - 1;

// for (int i = 1; i <= max_height; i++) {

// // Compute the leftmost point greater than
// // current row (i)
// while (arr[left] < i) {
// left++;
// }

// // Compute the rightmost point greater than
// // current row (i)
// while (arr[right] < i) {
// right--;
// }

// // Water in this row = right - left + 1
// total += (right - left + 1);
// }

// total -= num_blocks;
// return total;
// }

// // Driver Code
// public static void main(String[] args)
// {
// int arr[] = { 5,2,4,8,4,2};

// // Function call
// System.out.println(trappedWater(arr));
// }
// }

// // this code is contributed by shruti456rawal
