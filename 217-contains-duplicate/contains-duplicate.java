class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>ans = new HashSet<>();
        for(int x : nums){
            if(ans.contains(x)){
                return true;
            }
            ans.add(x);
        }
        return false;
    }
}