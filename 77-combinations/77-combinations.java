class Solution {
    public void helper(List <List<Integer>> list, List<Integer> temp, int j, int n, int k){
        if(k == 0){
            list.add(new ArrayList(temp));
            return;
        }
        for(int i = j; i <= n - k + 1; i++){
            temp.add(i);
            helper(list, temp, i + 1, n, k - 1);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List <List<Integer>> list =  new ArrayList <List<Integer>>();
        helper(list, new ArrayList(), 1, n, k);
        return list;
    }
}