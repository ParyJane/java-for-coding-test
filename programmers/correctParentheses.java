// 올바른 괄호
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> st = new Stack<Character>();
        char[] arr = s.toCharArray();
        
        for(char c : arr) {
            if(c == '(') {
                st.push(c);
            } else {
                if(!st.empty()) st.pop();
                else return false;
            }
        }

        return st.empty();
    }
}
