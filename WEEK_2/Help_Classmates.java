
import java.util.Stack;

public class Help_Classmates {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {3, 8, 5, 2, 25};
        System.out.println(help_classmate(arr, n));
    }
    public static int[] help_classmate(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        
        for (int i = n - 1; i >= 0; i--) {
            // Remove all students who are not weaker
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            
            // If stack is empty, no weaker student exists
            ans[i] = st.isEmpty() ? -1 : st.peek();
            
            // Push current student into stack
            st.push(arr[i]);
        }
        return ans;
    }
}
