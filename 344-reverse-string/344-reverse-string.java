class Solution {
    public void reverseString(char[] s) {
        int i = 0 ,j = s.length - 1, l = 0;
        if( s.length % 2 == 0){
            l = s.length/2 - 1;
        }
        else{
            l = s.length/2;
        }
        while( i <= l){
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
            // System.out.println(i + " " + j);
        }
    }
}