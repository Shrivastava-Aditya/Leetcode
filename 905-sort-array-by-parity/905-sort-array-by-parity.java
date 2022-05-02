class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int i=0,j=nums.length-1;
        
        while(i < j){
            if(nums[i] % 2 > nums[j] % 2){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            if(isEven(nums[i])) i++;
            if(!isEven(nums[j])) j--;
        }
        return nums;
        
        
    }
    public boolean isEven(int a){
        return a%2 == 0;
        }
}