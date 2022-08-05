import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
      // 스트링 길이가 홀수면 무조건 거짓
        if(s.length()%2!=0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] parenthesis = s.toCharArray();
        // 인덱스 0번에 ], }, ) 가 나오거나 마지막에 [. {. (가 나오면 안됨
        int end = parenthesis.length-1;
        if(parenthesis[0]==']' || parenthesis[0]=='}' || parenthesis[0] == ')' ||
            parenthesis[end] =='[' || parenthesis[end] == '{'  || parenthesis[end] =='('
        ) return false;
        // 루프를 돌리고, switch를 사용해서 (, {, [ 가 나오면 stack에 추가하고, 만약 ), ] } 가 나오면 현재 stack에 peek해서 나온 값과
        // 일치시 뺌, 매 루프마다 stack size가 0인지 확인( EmptyStackException 방지),
        for(char pa : parenthesis) {

            switch(pa) {
                case '(', '{', '[' :
                    stack.push(pa);
            }
            if(stack.isEmpty()==true) {
                return false;
            } else {
                switch(pa) {
                    case ')', ']', '}':
                        if (pa==')' && stack.peek() =='(') {
                            stack.pop();
                            break;
                        } else if (pa==')' && stack.peek() != '(') return false;
                        if (pa==']' && stack.peek() =='[') {
                            stack.pop();
                            break;
                        } else if (pa==']' && stack.peek() != '[') return false;
                        if (pa=='}' && stack.peek() =='{') {
                            stack.pop();
                            break;
                        } else if (pa=='}' && stack.peek() != '{') return false;
                        
                   
                }
            }

        }
        return stack.empty();


        
    }
}