class Solution {
    public void backtrack(List <List<Integer>> list, List <Integer> temp, int[] n, boolean[] used){
        if(temp.size() == n.length){
            list.add(new ArrayList(temp));
            return;
        }
        for(int i = 0; i < n.length; i++){
            if(used[i]){
                continue;
            }
            temp.add(n[i]);
            used[i] = true;
            backtrack(list, temp, n, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
            while(i < n.length - 1 && n[i] == n[i + 1]) i++;
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List <List<Integer>> list =  new ArrayList <List<Integer>>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList(), nums, new boolean[nums.length]);
        return list;
    }
}