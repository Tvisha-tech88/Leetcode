class Solution {
    public int maxProduct(int n) {
        int max =0;
        int second =0;
        while(n>0){
            int digit = n%10;
            n = n/10;
            if(digit > second && digit < max){
                second = digit;
            }else if(digit >= max){
                second = max;
                max = digit;
            }
            

        }
        return second*max;
        
    }
}