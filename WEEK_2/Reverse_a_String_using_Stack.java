public class Reverse_a_String_using_Stack {
    public static void main(String[] args) {
        String s ="GeeksforGeeks";
        System.out.println(Reverse(s));
    }
    public static String Reverse(String s){
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
    }
}
