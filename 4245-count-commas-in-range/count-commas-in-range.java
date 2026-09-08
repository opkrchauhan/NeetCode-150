class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        return digit(n);
    }
    private int digit(int n){
        int count = 0;
        for(int i=1000;i<=n;i++){
            count++;
        }
        return count;
    }
}