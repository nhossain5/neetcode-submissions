class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        return letterCounts(s).equals(letterCounts(t));
    }

    private Map<Character, Integer> letterCounts(String str) {
        Map<Character, Integer> counts = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        return counts;
    }
}
