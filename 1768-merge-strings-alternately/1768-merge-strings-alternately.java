class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();
        char[] res = new char[word1.length() + word2.length()];
        int p = 0,q = 0;

        for( int i = 0; i < word1.length() + word2.length(); i++){
            if( i % 2 == 0 && p < s1.length){
                res[i] = s1[p];
                p++;
            }
            else if(q < s2.length){
                res[i] = s2[q];
                q++;
            }
            else{
                res[i] = s1[p];
                p++;
            }
        }
        return new String(res);  
    }
}