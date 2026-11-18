class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> noDuplicates = new HashSet<>(nums.length);
        for(int i=0;i<nums.length;i++) {
            if(!noDuplicates.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}