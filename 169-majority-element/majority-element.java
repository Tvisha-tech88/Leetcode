class Solution {
    public int majorityElement(int[] nums) {
        int maxCount = nums[0];
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int i = 0;i < nums.length; i++) {
            if (counts.containsKey(nums[i]))
                counts.put(nums[i], counts.get(nums[i])+1);
            else 
                counts.put(nums[i], 1);
            if (counts.get(maxCount) < counts.get(nums[i]))
                maxCount = nums[i];
        }
        return maxCount;
    }
}