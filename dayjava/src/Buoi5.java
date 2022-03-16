import java.util.Scanner;

public class Buoi5 {
    public static void main(String[] args) {
        int arrayA[] = new int [100];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu: ");
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+i+": ");
            arrayA[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arrayA[i]+" ");
        }
        // sap xep noi bot

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arrayA[i]>arrayA[j]){
                    int t = arrayA[i];
                    arrayA[i] = arrayA[j];
                    arrayA[j] = t;
                }
            }
        }
        System.out.println("mang sau khi sap xep");
        for(int i=0;i<n;i++){
            System.out.print(arrayA[i]+" ");
        }
    }
}