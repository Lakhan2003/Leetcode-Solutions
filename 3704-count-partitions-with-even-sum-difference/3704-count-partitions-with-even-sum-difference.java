class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // If total sum is odd, no valid partitions exist
        if (totalSum % 2 != 0) {
            return 0;
        }

        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) { // Must be nums.length - 1
            leftSum += nums[i];
            int rightSum = leftSum - (totalSum - leftSum); // Corrected formula

            // If both left and right sums are even, count the partition
            if (rightSum % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
