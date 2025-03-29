// class Solution {
//     public int maximumDifference(int[] nums) {
//         int max=-1;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j]-nums[i]>max){
//                     max=nums[j]-nums[i];
//                 }
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    int diff = nums[j] - nums[i];
                    max = Math.max(max, diff);
                }
            }
        }
        return max;
    }
}