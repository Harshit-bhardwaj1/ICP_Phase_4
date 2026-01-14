import java.util.*;

public class Count_Primes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(PrimeSeive(n));
    }
    public static int PrimeSeive(int n){
        if(n<2) return 0;
        boolean [] arr = new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=arr[1]=false;
        for(int i=0; i*i<=n; i++){
            if(arr[i]){
                for(int j=i*i; j<n; j+=i){
                    arr[j]=false;
                }
            }
        }
        int count=0;
        for(boolean x:arr){
            if(x) count++;
        }
        return count;
    }
}
