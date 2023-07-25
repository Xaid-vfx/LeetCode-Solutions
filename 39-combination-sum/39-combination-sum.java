class Solution {
    public void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] candidates, int target, int start){
        if(0 == target) list.add(new ArrayList(temp));
        else{
            for(int i = start; i < candidates.length; i++){
                if(target - candidates[i] >= 0){
                    System.out.println(temp);
                    temp.add(candidates[i]);
                    backtrack(list, temp, candidates, target - candidates[i], i);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
}