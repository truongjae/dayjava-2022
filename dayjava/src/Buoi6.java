import java.util.Scanner;

public class Buoi6 {
    public static void nhapMang(int arr[], int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao pt thu "+i+": ");
            arr[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void ptLe(int arr[],int n){
        for (int i = 0; i < n; i++) {
           if(arr[i]%2 !=0){
               System.out.print(arr[i]+" ");
           }
        }
    }
    // tinh tong chan cac pt trong mang viet ham


    public static void tongChan(int arr[], int n){
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                tong=tong + arr[i];
            }
        }
        System.out.println("tong la: "+tong);
    }
    // viet ham kiem tra xem so do co ton tai trong mang hay khong
    public static boolean timKiem(int arr[], int n, int x){
        for (int i = 0; i < n; i++) {
            if(x==arr[i]) return true;
        }
        return false;
    }
    public static void sapXep(int arr[], int n){
        for(int i=0;i<n-1;i++){
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    public static int binarySearch(int arr[], int n, int left, int right,int x){
        int mid;
        while(left<=right){
            mid = (left+right) / 2;
            if(arr[mid]<x) left = mid+1;
            else if(arr[mid] > x) right = mid -1;
            else if(arr[mid] == x) return mid;
        }
        return -1;
    }
    // dem so lan xuat hien cac chu so trong mang
    // a = [1,1,1,1,2,33,1,33,2,1,55,6,2,11,3]
    /*
    1 - 1
    2 - 2
    33 -2
    55 - 1
    6 - 1
    11 - 1
    3-1
     */
    public static void demSoLanXuatHien(int arr[], int n){
        int b[] = new int[n];
        for (int i = 0; i < n-1; i++) {
            if (b[i] == 0) {
                int dem = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        b[j] = 1;
                        dem++;
                    }
                }
                System.out.println(arr[i] +" xuat hien "+dem + " lan");
            }
        }

        }
    public static void main(String[] args) {
        int arr[] = new int[100];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        n = sc.nextInt();
        nhapMang(arr,n);
        xuatMang(arr,n);
        System.out.println("tan suat xuat hien\n");
        demSoLanXuatHien(arr,n);





//        sapXep(arr,n);
//        System.out.println("mang sau khi sap xep");
//        xuatMang(arr,n);
//        System.out.println("nhap so can kiem tra: ");
//        int x = sc.nextInt();
//        System.out.println(timKiem(arr,n,x));
//        if(binarySearch(arr,n,0,n-1,x)!= -1){
//            System.out.println("co ton tai");
//        }
//        else {
//            System.out.println("khong ton tai");
//        }


    }
}
