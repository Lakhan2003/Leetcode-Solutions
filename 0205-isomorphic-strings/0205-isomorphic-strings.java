class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> mapSt = new HashMap<>();
        Map<Character, Character> mapTs = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (mapSt.containsKey(sChar)) {
                if (mapSt.get(sChar) != tChar)
                    return false;
            } else {
                mapSt.put(sChar, tChar);
            }

            if (mapTs.containsKey(tChar)) {
                if (mapTs.get(tChar) != sChar)
                    return false;

            } else {
                mapTs.put(tChar, sChar);
            }
        }
        return true;
    }
}