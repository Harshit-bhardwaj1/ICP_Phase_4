
import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int [] nums1= {1,2,3,4};
        int [] nums2 = {2,4,6,8};
        System.out.println(Median(nums1, nums2));
    }
    public static double Median(int[] num1, int[] num2){
        int [] arr = new int[num1.length+num2.length];
        int c=0;
        for(int i=0; i<num1.length; i++){
            arr[i]= num1[i];
            c++;
        }
        for(int i=0; i<num2.length; i++){
            arr[c]= num2[i];
            c++;
        }
        Arrays.sort(arr);
        if(c%2!=0){
            int k= arr[c/2];
            return k;
        }
        else{
            double k= (double)(arr[c/2]+arr[c/2-1])/2;
            return k;
        }
    }
}
