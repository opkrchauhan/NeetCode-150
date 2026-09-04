class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(getMax(nums,i)-getMin(nums,i)<=k){
                return i;
            }
        }

        return -1;
        


    }
    private int getMax(int nums[], int j){
        int max = nums[0];
        for(int i=1;i<=j;i++){
            if(max<=nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    private int getMin(int nums[], int j){
        int min = nums[j];
        for(int i=j;i<nums.length;i++){
            if(min>=nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}