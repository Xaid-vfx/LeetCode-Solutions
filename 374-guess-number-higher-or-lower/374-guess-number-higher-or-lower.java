/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long high = n, low = 1; long mid = (n + 1)/2;
        while(low <= high){
            mid = ( high + low ) / 2;
            int res = guess((int)(mid));
            if( res == 1) low = mid + 1;
            else if( res == -1) high = mid - 1;
            else return (int)(mid);
        }
        return -1;
    }
}