import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check s -> t mapping
            if (mapST.containsKey(sChar)) {
                if (mapST.get(sChar) != tChar) {
                    return false;
                }
            } else {
                mapST.put(sChar, tChar);
            }

            // Check t -> s mapping
            if (mapTS.containsKey(tChar)) {
                if (mapTS.get(tChar) != sChar) {
                    return false;
                }
            } else {
                mapTS.put(tChar, sChar);
            }
        }

        return true;
    }
}
