
import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        System.out.println(Check(s).equals(Check(t)));
    }
    public static String Check(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()) st.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}
