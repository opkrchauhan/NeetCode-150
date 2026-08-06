class Solution {
    public int smallestNumber(int n, int t) {
        int smallest = Integer.MIN_VALUE;
        while(true){
            if(getProductOfNumber(n)%t==0){
                smallest = Math.max(smallest, n);
                break;
            }
            n = n+1;
        }
        return smallest;
    }
    public int getProductOfNumber(int n){
        int product = 1;
        while(n!=0){
            product = product * (n%10);
            n/=10; 
        }
        return product;
    }
}