
import java.util.Stack;

public class Postfix_Evaluation {
    public static void main(String[] args) {
        String[] arr = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println(Postfix(arr));
    }
    public static int Postfix(String[] arr){
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            String temp = arr[i];
            
            if(check(temp)){
                int a = st.pop();
                int b = st.pop();
                int res = Apply(temp,b,a);
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(temp));
            }
        }
        return st.pop();
    }
    public static boolean check(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
    }
    
    public static int Apply(String temp, int a, int b){
        if (temp.equals("+")) return a + b;
        if (temp.equals("-")) return a - b;
        if (temp.equals("*")) return a * b;
        if (temp.equals("/")) return Math.floorDiv(a, b); 
        if (temp.equals("^")) return (int)Math.pow(a, b);
        return 0;
    }
}
