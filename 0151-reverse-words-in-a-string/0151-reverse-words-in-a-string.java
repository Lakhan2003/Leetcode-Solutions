class Solution {
    public String reverseWords(String s) {
        // first we trim
        s = s.trim();

        // then we split remove wordspaces
        String words[] = s.split("\\s+");

        // reverse the array and build a string builder
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0)
                result.append(" ");
        }
        s = result.toString();
        return s;

    }
}