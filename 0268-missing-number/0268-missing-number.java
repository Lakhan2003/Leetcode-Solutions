class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int val : nums){
            sum += val;
        }
        int actualSum = ((nums.length)*(nums.length + 1))/2;
        int missingNum = actualSum - sum;
        return missingNum;
    }
}