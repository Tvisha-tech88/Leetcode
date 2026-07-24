class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0, new ArrayList<>());
        return ans;
    }
    void backtrack(int[] nums, int idx, List<Integer> current){
        if(idx == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        backtrack(nums, idx+1, current);

        current.remove(current.size()-1);

        backtrack(nums, idx +1, current);
    }
}