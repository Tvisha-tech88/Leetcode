class Solution {
    public int smallestEvenMultiple(int n) {
        int ans;
        if( n%2 !=0){
            ans = 2*n;
        }else{
            ans = n;
        }
        return ans;
    }
}