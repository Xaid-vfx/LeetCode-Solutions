class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1; int[] result = new int[nums.length];
        for ( int i = nums.length - 1 ; i >= 0 ; i-- ){
            if( Math.abs(nums[left]) > Math.abs(nums[right])){
                result[i] = nums[left] * nums[left];
                left++;
            }
            else{
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}