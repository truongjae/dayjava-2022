import java.util.Scanner;

public class Buoi2 {

    public static void main(String[] args){
        int a,b,c;

        Scanner thayChieuDepTrai = new Scanner(System.in);
        System.out.println("nhap vao a: ");
        a = thayChieuDepTrai.nextInt();
        System.out.println("nhap vao b: ");
        b = thayChieuDepTrai.nextInt();
        System.out.println("nhap vao c: ");
        c = thayChieuDepTrai.nextInt();

        int max = (a>b) ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println(max);
    }
}
