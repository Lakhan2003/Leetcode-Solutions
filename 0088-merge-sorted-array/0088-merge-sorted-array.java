class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m + n];
        // copy only nums1 elements
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }
        // copy elements of nums 2;
        for (int i = 0; i < n; i++) {
            temp[m + i] = nums2[i];
        }
        // sort the new array
        Arrays.sort(temp);

        // copy sorted elements back to nums1

        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }
}