class Solution {
    public boolean isHappy(int n) {
        
        int sum = 0;
        while(true){
            while( n != 0){
                sum = sum + (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
            if( sum == 1 || sum == 7){
                return true;
            }
            if( sum < 10 && sum != 1){
                return false;
            }
            sum = 0;
        }
    }
}