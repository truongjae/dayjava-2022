import java.util.Arrays;
import java.util.Scanner;
public class Buoi8 {
    public static int sum(int n){
        if( n == 0 || n==1) return 1;
        return n+sum(n-1);
    }
    public static int tich(int n){
        if( n == 0 || n==1) return 1;
        return n*sum(n-1);
    }
    public static float sum2(int n){
        if( n==1) return 1;
        return ((float) sum(n)/tich(n)) + sum2(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum2(5));
    }
}
