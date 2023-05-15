class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        if( k >= nums.length){
            k = k % nums.length;
        }
        int i = 0, j = k, l = 0;
        while( i < nums.length){
            temp[i] = nums[j];
            if( i < k ){
                nums[j] = nums[i];
            }
            else{
                nums[j] = temp[l];
                l++;
            }
            i++;
            if( j == nums.length - 1 ) j = 0;
            else j++;
        }
    }
}