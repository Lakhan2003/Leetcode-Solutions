class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string - keep only alphanumeric and convert to lowercase
        StringBuilder cleanStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanStr.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Use two-pointer approach to check for palindrome
        int left = 0, right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }
}
