class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        
        findSubsets(output, nums, new ArrayList<>(), 0);
 
        return output;
        
    }
    public static void findSubsets(List<List<Integer>> subset, int[] nums, ArrayList<Integer> output, int index)
    {
      // Base Condition
        if (index == nums.length) {
            subset.add(output);
            return;
        }
       
        // Not Including Value which is at Index
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
 
        // Including Value which is at Index
        output.add(nums[index]);
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
    }
    
}