
import java.util.*;

public class Delete_middle_element_of_a_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        deleteMid(st);
        System.out.println(st);
    }
    public static void deleteMid(Stack<Integer> st) {
        List<Integer> ll = new ArrayList<>();
        
        while(!st.isEmpty()){
            ll.add(st.pop());
        }
        int mid = ll.size()/2;
        ll.remove(mid);
        
        for(int i=ll.size()-1; i>=0; i--){
            st.push(ll.get(i));
        }
    }
}
