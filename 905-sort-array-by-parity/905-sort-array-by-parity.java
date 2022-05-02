class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int fp = 0;
        int sp = 0;
        
        while(sp < nums.length && fp <= sp){
            if(isEven(nums[fp])){
                fp++;sp++;
            }
            else if(!isEven(nums[fp]) && sp<nums.length){
                while(!isEven(nums[sp]) && sp < nums.length-1){
                    // if(sp >= nums.length || fp >= nums.length) break;
                    sp++;
                }
                int temp = nums[fp];
                nums[fp] = nums[sp];
                nums[sp] = temp;
                fp++;
            
            }
            
        }
        return nums;
        
        
    }
    public boolean isEven(int a){
        return a%2 == 0;
        }
}