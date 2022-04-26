class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i : nums){
            set.add(i);
        }
        return set.size() != nums.length;
        
    }
}