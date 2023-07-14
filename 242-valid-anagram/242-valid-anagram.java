class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int i = 0;
        HashMap <Character, Integer> map = new HashMap();
        while(i < s.length()){
            char ch = s.charAt(i);
            if( map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
            i++;
        }
        i = 0;
        while(i < t.length()){
            char ch = t.charAt(i);
            if( map.containsKey(ch) && map.get(ch) != 0) map.put(ch, map.get(ch) - 1);
            else return false;
            i++;
        }
         return true;
    }
}