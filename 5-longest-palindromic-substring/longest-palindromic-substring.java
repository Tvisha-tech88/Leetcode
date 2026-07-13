class Solution {
    int maxlength = 0;
    int mleft =0;
    public void checkThroughCenter(String s, int l, int r){
        int n = s.length();
        int length =0;
        while(l>=0 && r<n && s.charAt(l)== s.charAt(r)){
        
            if(l == r){
                length++;
            }else{
                length +=2;
            }
            l--; r++;
            
        }
        if(maxlength < length){
            maxlength = length;
            mleft = l+1;
        }
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i=0; i<n;i++){
            checkThroughCenter(s,i,i+1);
            checkThroughCenter(s,i,i);
            if(maxlength == s.length()){
                return s;
            }

        }
        return s.substring(mleft, mleft+maxlength);

    }
}