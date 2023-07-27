class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList();
        
        for(String s : words ){
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < s.length(); j++){
                if(s.charAt(j) != separator){
                    sb.append(s.charAt(j));
                }
                if(j == s.length() - 1 || s.charAt(j) == separator && j != 0){
                    if(sb.length() > 0) list.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
        }
        return list;
    }
}