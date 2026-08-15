class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer>ans = new ArrayList<>();
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for(int x : arr){
            minElement = Math.min(minElement,x);
            maxElement = Math.max(maxElement,x);
        }
        ans.add(minElement);
        ans.add(maxElement);
        return ans;
    }
}
