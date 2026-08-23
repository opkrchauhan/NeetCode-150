class Solution {
    private Map<Integer,Integer>mapHelper(int [] nums){
        Map<Integer,Integer>counts= new HashMap<>();
        for(int num : nums){
            if(!counts.containsKey(num)){
                counts.put(num,1);
            }
            else{
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>maps = mapHelper(nums);
        Map.Entry<Integer,Integer>majority = null;
        for(Map.Entry<Integer,Integer>entry:maps.entrySet()){
            if(majority==null || entry.getValue() > majority.getValue()){
                majority = entry;
            }
        }
        return majority.getKey();
    }
}