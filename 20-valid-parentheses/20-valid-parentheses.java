class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < ch.length; i++ ){
            if( ch[i] == '(' || ch[i] == '{' || ch[i] == '[')
                stack.push(ch[i]);
            else if(!stack.empty() && Math.abs(stack.peek() * 1 - ch[i] * 1) <= 2){
                stack.pop();
            }      
            else return false;
        }
        
        return stack.empty();
    }
}