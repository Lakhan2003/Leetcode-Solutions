class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Split by spaces (regex ensures multiple spaces are treated as one)
        String[] words = s.split("\\s+");

        // Reverse the words array
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0)
                result.append(" "); // Add space between words
        }

        s = result.toString();
        return s;
    }
}
