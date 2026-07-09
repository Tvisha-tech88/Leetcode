class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> rem = new HashMap<>();
        rem.put(0,-1);
        int sum =0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int remainder = sum %k;
        
        if(rem.containsKey(remainder)){
            int prev = rem.get(remainder);

            if(i - prev >= 2){
                return true;
            }
        }else{
            rem.put(remainder,i);
        }

        }
        return false;



        
    }
}