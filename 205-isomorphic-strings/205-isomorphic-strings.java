class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        HashMap<Character, Character> map = new HashMap();
        int i = 0;
        while(i < c1.length){
            if(map.containsKey(c1[i])){
                if(map.get(c1[i]) != c2[i]){
                    return false;
                }
            }
            else{
                if(map.containsValue(c2[i]))
                    return false;
                map.put(c1[i], c2[i]);
            }
            i++;
        }
        return true;
    }
}