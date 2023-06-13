class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE, start = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            if(sum >= target){
                while(sum - nums[start]>= target){
                    sum = sum - nums[start];
                    start++;
                }
                min = Math.min(min, i - start + 1);
            }
        }
        return min == Integer.MAX_VALUE? 0 : min;
    }
}