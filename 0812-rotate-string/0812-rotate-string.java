class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false; // Ensure we return false if lengths don't match
        }

        String combined = s + s;

        // If goal is found in the combined string, return true
        if (combined.contains(goal)) {
            return true;
        }

        // If goal is not found, return false
        return false;
    }
}
