class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> letterCounts = new HashMap<>();
        for(char c : s.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) - 1);
        }
        for(int count : letterCounts.values()) {
            if(count!=0) {
                return false;
            }
        }
        return true;
    }
}
