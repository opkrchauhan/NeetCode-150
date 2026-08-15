class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int []array = new int[n];
        int index = 0;
        for(int i=n-1;i>=0;i--){
            array[index++] = arr[i];
        }
        
        for(int i=0;i<n;i++){
            arr[i] = array[i];
        }
    }
}