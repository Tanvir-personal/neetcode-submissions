class Solution {
    public boolean isValid(String s) {
        if((s.length() % 2) != 0)
            return false;
        Stack<Character> openP = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '{' || bracket == '['){
                openP.push(bracket);
            }
            else if(openP.isEmpty()){
                return false;
            }
            else if(bracket == ')' && openP.peek() == '('){
                openP.pop();
            }
            else if(bracket == '}' && openP.peek() == '{'){
                openP.pop();
            }
            else if(bracket == ']' && openP.peek() == '['){
                openP.pop();
            }
            else
                return false;
        }
        return openP.isEmpty();
    }
}
