class Solution {
    public void backtrack(List <List<Integer>> list, List <Integer> temp, int[] n){
        if(temp.size() == n.length){
            list.add(new ArrayList(temp));
            return;
        }
        for(int i = 0; i < n.length; i++){
            if(temp.contains(n[i])){
                continue;
            }
            temp.add(n[i]);
            backtrack(list, temp, n);
            temp.remove(temp.size() - 1);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List <List<Integer>> list =  new ArrayList <List<Integer>>();
        backtrack(list, new ArrayList(), nums);
        return list;
    }
}