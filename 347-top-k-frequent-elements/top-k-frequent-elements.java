class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         if(nums.length==k){
            return nums;
         }
         Map<Integer, Integer>map = new HashMap<>();
         for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
         }

         PriorityQueue<Integer>heap = new PriorityQueue<>(
            (a,b)->map.get(a)-map.get(b));

        for(int n : map.keySet()){
            heap.offer(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int [] result = new int[k];
        for(int i=k-1;i>=0;i--){
            result[i] = heap.poll();
        }
        return result;

    }
}