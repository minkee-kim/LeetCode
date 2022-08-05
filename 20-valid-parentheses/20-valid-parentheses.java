import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack = new Stack<>();
        char[] parenthesis = s.toCharArray();
        int ed = parenthesis.length;
        if(parenthesis[0]==')' || parenthesis[0]==']' || parenthesis[0]=='}'
          || parenthesis[ed-1]=='(' || parenthesis[ed-1]=='{' || parenthesis[ed-1]=='['
                || (ed%2) !=0
        ) {
            return false;
        }

        for(char pa : parenthesis) {
            if (pa== '(' || pa=='{' || pa=='['){
                stack.push(pa);
            }
                        if (stack.isEmpty()== true) 
                return false;

            if (pa==')' && stack.peek() =='(')  {
                stack.pop();
                continue;
            } else if (pa==')' &&  stack.peek() !='(') {
                return false;
            }
            if(pa=='}' && stack.peek() == '{') {
                stack.pop();
                continue;
            } else if (pa=='}' && stack.peek()!='{') {
                return false;
            }
            if (pa==']' && stack.peek() == '[') {
                stack.pop();
                continue;
            } else if (pa == ']' && stack.peek()!= '[') {
                return false;
            }
        }

        return stack.isEmpty();

    }
}