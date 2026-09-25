import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(':
                  stack.push(s.charAt(i));
                  break;
                case '[':
                  stack.push(s.charAt(i));
                  break;
                case '{':
                  stack.push(s.charAt(i));
                  break;
                case ')':
                if(!stack.isEmpty()){
                if(stack.peek()=='('){
                    stack.pop();
                    //return true;
                    break;
                }
                else{
                    return false;
                }
                }
                else if(stack.isEmpty()){
                    return false;
                }
                  break;
                case ']':
                if(!stack.isEmpty()){
                if(stack.peek()=='['){
                    stack.pop();
                    //return true;
                    break;
                }
                else{
                    return false;
                }
                }
                else if(stack.isEmpty()){
                    return false;
                }
                
                  break;
                case '}':
                if(!stack.isEmpty()){
                if(stack.peek()=='{'){
                    stack.pop();
                    //return true;
                    break;
                }
                else {
                    return false;
                }
                }
                else if(stack.isEmpty()){
                    return false;
                }
                break;
            }
        }
        return stack.isEmpty();
    }
}