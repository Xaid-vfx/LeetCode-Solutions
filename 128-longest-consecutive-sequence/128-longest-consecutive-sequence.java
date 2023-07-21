class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet();
        int n = nums.length, max = 0;

        for(int i = 0; i < n; i++)  
            set.add(nums[i]);

        for(int i = 0; i < n; i++)  {
            if(!set.contains(nums[i] - 1)){
                int len = 1;
                while(set.contains(nums[i] + len)){
                    set.remove(nums[i] + len);
                    len++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }
}