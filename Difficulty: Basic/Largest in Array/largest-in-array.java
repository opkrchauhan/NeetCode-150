class Solution {
    public static int largest(int[] arr) {
        int max = 0;
        for(int x : arr){
            if(x>max){
                max = x;
            }
        }
        int second = max;
        for(int x : arr){
            if(x>second){
                second = x;
            }
        }
        return second;
    }
}
