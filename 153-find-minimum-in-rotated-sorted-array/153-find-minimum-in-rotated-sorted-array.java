class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE, low = 0, high = nums.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return Math.min(nums[low],nums[high]);
    }
}