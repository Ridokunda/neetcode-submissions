class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> seen = new ArrayList<>();
    int[] candidates;
    int target;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        Arrays.sort(this.candidates);
        List<Integer> current = new ArrayList<>();
        backtrack(0,0,current);
        return result;
    }
    private void backtrack(int sum, int index, List<Integer> current){
        if(sum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(sum > target || index == candidates.length){
            return;
        }
        
        current.add(candidates[index]);
        backtrack(sum + candidates[index], index+1, current);
        current.remove(current.size()-1);
        while(index+1 < candidates.length && candidates[index] == candidates[index+1]){
            index++;
        }
        backtrack(sum, index+1, current);
    }
}
