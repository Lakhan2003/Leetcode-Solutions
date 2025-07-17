class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> S = new HashMap<>();
        HashMap<Character, Character> T = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (S.containsKey(ss)) {
                if (S.get(ss) != tt)
                    return false;
            } else {
                S.put(ss, tt);
            }
            if (T.containsKey(tt)) {
                if (T.get(tt) != ss)
                    return false;
            } else {
                T.put(tt, ss);
            }
        }
        return true;
    }
}