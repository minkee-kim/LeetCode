/*Stack에 넣어서 비교하자고 생각해서, 먼저 스트링 s를 문자열 배열로 바꿔주었음
만약 배열의 크기가 홀수면 무조건 거짓이고, 처음에 ')', ']', '}' 이 나오면 무조건 거짓, 마지막에 '(', '[', '{' 나오면 거짓이기 때문에 
이 조건에 부합하지 않는다면 나머지 코드는 실행할 의미가 없어서 바로 false를 반횐

위의 조건을 부합한 경우엔 이제 '(', '[', '{' 이 나오면 스택에 push해줘야 함.
그리고 짝이 맞을 경우엔 pop()해서 값을 빼야 한다.
만약 stack의 크기가 0인 상태에서 stack에서 값을 빼야하면 EmptyStackException이 발생할 수 있기 때문에 매 루프마다 stack의 크기를 확인하고
stack 크기가 0이라면 바로 false를 반환해야함.


*/
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
            if (stack.isEmpty()== true) {
                return false;
            }
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
