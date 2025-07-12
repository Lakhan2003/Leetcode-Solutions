class Solution {
    public void rotate(int[] nums, int d) {
        int n = nums.length;

        // // If the array is empty or has only one element, no need to rotate
        // if (n <= 1) return;

        // If d is greater than n, reduce it to the effective rotations needed
        d = d % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first d elements
        reverse(nums, 0, d - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, d, n - 1);
    }

    // Helper function to reverse the array from index 'start' to 'end'
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
