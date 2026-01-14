
import java.util.Scanner;

public class Find_Idx_of_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(Check(s2, s2));
    }
    public static int Check(String haystack, String needle){
        if(needle.length()>haystack.length()){
            return -1;
        }
        else if(needle.length()==haystack.length() && needle.equals(haystack)){
            return 0;
        }
        else{
            int n= needle.length();
            for(int i=0; i<=haystack.length()-n; i++){
                if(haystack.substring(i,i+n).equals(needle)){
                    return i;
                    
                }
            }
        }
        return -1;
    }
}
