
import java.util.Stack;

public class Prefix_Evaluation {
    public static void main(String[] args) {
        String[] arr = {"+", "*", "/", "+", "100", "200", "2", "5", "7"};
        System.out.println(evaluatePrefix(arr));
    }
    public static int evaluatePrefix(String[] arr) {
        return Prefix(arr);
    }
    public static int Prefix(String[] arr){
        Stack<Integer> st = new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--){
            
            String temp =arr[i];
            if(check(temp)){
                int a = st.pop();
                int b= st.pop();
                int res = Apply(temp,a,b);
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
