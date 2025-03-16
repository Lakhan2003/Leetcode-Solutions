import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!numSet.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}