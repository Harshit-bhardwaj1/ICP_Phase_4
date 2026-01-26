
import java.util.Stack;

public class Baseball_Game {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<operations.length; i++){
            String s = operations[i];
            if(s.equals("+")){
                int a =st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(2* st.peek());
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
