
import java.util.*;

public class Min_Stack {
    Stack<Integer> st;
    Stack<Integer> min;
    public Min_Stack() {
        st= new Stack<>();
        min= new Stack<>();
    }
    public void push(int val) {
        st.push(val);
        if(min.isEmpty() || min.peek()>=val){
            min.push(val);
        }
    }
    
    public void pop() {
        int temp=0;
        if(!st.isEmpty()){
            temp = st.pop();
        }
        if(temp==min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }


    public static void main(String[] args) {
        Min_Stack obj = new Min_Stack();
        obj.push(4);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }
}
