
import java.util.Stack;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(Remove(s));
    }
    public static String Remove( String s){
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    str.append(ch);
                }
                st.push(ch);
            }
            else{
                char c = st.pop();
                if(!st.isEmpty()){
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}
