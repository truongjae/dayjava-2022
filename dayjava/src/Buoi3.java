import java.util.Scanner;

public class Buoi3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        a = sc.nextInt();
        System.out.println("nhap b: ");
        b = sc.nextInt();
        System.out.println("nhap c: ");
        c = sc.nextInt();
        if(a == 0){
            if(b==0){
                if(c == 0) System.out.println("phuong trinh vo so nghiem");
                else System.out.println("phuong trinh vo nghiem");
            }
            else System.out.println("phuong trinh co nghiem la: "+ (float) -c / b);
        }
        else {
            double delta =  b*b - 4*a*c;
            if(delta<0) System.out.println("phuong trinh vo nghiem");
            else if(delta == 0)
                System.out.println("phuong trinh co nghiem kep: "+(float) -b / (2*a));
            else {
                double canDelta = Math.sqrt(delta);
                System.out.println("nghiem x1= "+ (-b+canDelta)/(2*a));
                System.out.println("nghiem x2= "+ (-b-canDelta)/(2*a));
            }
        }
    }
}