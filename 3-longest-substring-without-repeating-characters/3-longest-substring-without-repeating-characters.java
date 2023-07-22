class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> map = new HashSet<Character>();
        int start = 0, max = 0;
        for(int end = 0; end < s.length(); end++){
            while(map.contains(s.charAt(end))){
                map.remove(s.charAt(start));
                start++;
            }
            max = Math.max(max, end - start + 1);
            map.add(s.charAt(end));
        }
        return max;
    }
}