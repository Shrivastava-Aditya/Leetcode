class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        /*
        Simple recursion approach with shifting the index single step at every recursive step
        1. shift the index and again recursively solve. (discluding the current element)
        2. store the element in array. (including the current element)
        3. again recursively solve by incrementing the index
        */
        List<List<Integer>> output = new ArrayList<>();
        
        findSubsets(output, nums, new ArrayList<>(), 0);
 
        return output;
        
    }
    public static void findSubsets(List<List<Integer>> output, int[] nums, ArrayList<Integer> list, int index)
    {
      // Base Condition
        if (index == nums.length) {
            output.add(list);
            return;
        }
       
        // Not Including Value which is at Index
        findSubsets(output, nums, new ArrayList<>(list), index + 1);
 
        // Including Value which is at Index
        list.add(nums[index]);
        findSubsets(output, nums, new ArrayList<>(list), index + 1);
    }
    
}