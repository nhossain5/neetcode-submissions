class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        Map<Character, Integer> letterCounts = new HashMap<>();
        tally(letterCounts, s, +1);
        tally(letterCounts, t, -1);
        return allZero(letterCounts);
    }

    private void tally(Map<Character, Integer> letterCounts, String str, int step) {
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + step);
        }
    }

    private boolean allZero(Map<Character, Integer> letterCounts) {
        for(int count : letterCounts.values()) {
            if(count!=0) {
                return false;
            }
        }
        return true;
    }
}
