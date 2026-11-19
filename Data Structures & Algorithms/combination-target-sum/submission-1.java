class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int[] nums;
    int target;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
       
        List<Integer> current = new ArrayList<>();
        backtrack(0,0, current);
        return result;
    }
    private void backtrack(int sum, int index, List<Integer> current){
        if(sum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(index == nums.length || sum > target){
            return;
        }
        
        current.add(nums[index]);
        backtrack(sum + nums[index],index,current);
        current.remove(current.size()-1);

        backtrack(sum, index+1, current);
    }
}
