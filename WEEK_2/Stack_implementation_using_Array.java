public class Stack_implementation_using_Array{
    private int[] arr;
    private int idx=-1;
    
    public void size(int n){
        arr= new int[n];
    }

    public void push(int item) throws Exception{
        if(idx==arr.length-1){
            throw new Exception("stack is full");
        }
        idx++;
        arr[idx]=item;
    }

    public int pop() throws Exception{
        if(idx==-1){
            throw new Exception("Stack is Empty");
        }
        int rv = arr[idx];
        idx--;
        return rv;
    }

    public int peek() throws Exception{
        if(idx==-1){
            throw new Exception("Stack is Empty");
        }
        return arr[idx];
    }

    public void Display(){
        for(int i=0; i<=idx; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        Stack_implementation_using_Array st = new Stack_implementation_using_Array();
        st.size(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.Display();
        System.out.println();
        System.out.println(st.pop());
        st.Display();
        st.peek();
        System.out.println();
        st.Display();
    }
}