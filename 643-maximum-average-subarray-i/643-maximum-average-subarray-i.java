class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, avg = 0;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        avg = sum;
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i - k];
            avg = Math.max(sum , avg);
        }
        return avg / 1.0 / k;
    }
}