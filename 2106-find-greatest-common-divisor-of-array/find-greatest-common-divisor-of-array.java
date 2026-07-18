class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int n= nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] <min){
                min = nums[i];
            }
        }

        for(int i=0; i<n;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        
        return gcd(min,max);
    }
}