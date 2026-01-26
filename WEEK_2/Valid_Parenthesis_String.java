public class Valid_Parenthesis_String {
    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(String(s));
    }
    public static boolean String(String s){
        int a=0;
        int b=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                a++;
                b++;
            }
            else if(ch==')'){
                a--;
                b--;
            }
            else{
                a--;
                b++;
            }
            if (b < 0) return false;   // too many ')'
            if (a < 0) a = 0;     
        }
        
        return a==0;
    }
}
