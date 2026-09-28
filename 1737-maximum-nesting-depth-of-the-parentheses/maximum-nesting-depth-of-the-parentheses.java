class Solution {
    public int maxDepth(String s) {
        int count =0;
        int maxLen= 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}