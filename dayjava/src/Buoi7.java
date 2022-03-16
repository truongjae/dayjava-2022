import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Buoi7 {
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
    /*
    1. in ra 3 số lớn nhất của mảng( không sắp xếp lại mảng)
    Vd [1,5,7,2,6,3] => 5 7 6 là 3 số lớn nhất
     */
    public static void threeMax(int arr[], int n){
        int max1=-100000001,max2=-100000001,max3=-100000001;
        for(int i=0;i<n;i++){
            if(max1<arr[i]){   // [1,4,3,5,2]   max1 = 5   max2 = 4     max3 = 3
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(max2<arr[i]){
                max3 = max2;
                max2 = arr[i];
            }
            else if(max3<arr[i]){
                max3 = arr[i];
            }
        }
        System.out.println(max1+"---"+max2+"---"+max3);
    }

    /*

    2. Tìm chữ số xuất hiện nhiều nhất trong số
    Vd 123232223 => số 2 xuất hiện nhiều nhất

     */
    public static void luaGa(int so){
        int temp = so;
        int arr[] = new int[10];
        while(temp!=0){
            arr[temp%10]++;
            temp/=10;
        }
        int max=arr[0];
        int x=-1;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                x = i;
            }
        }
        if(x!=-1)
            System.out.println(x+" xuat hien nhieu nhat");
    }
    /*
    3. Nhập vào 1 số kiểm tra xem số đó có phải số đối xứng không vd 123321 là số đối xứng
     */
    public static boolean checkDX(int n){
        int temp = n;
        int so=0;
        while(temp!=0){
            int du = temp%10;
            so = so*10+du;
            temp/=10;
        }
        return so==n;
    }
    /*

    Vd [1,3,1,4,6,4] => [4,6,4,1,3,1]

     */
    public static void daoNguocMang(int arr[], int n){
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static boolean checkSNT(int n){
        if(n<2) return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void printSNT(int arr[], int n){
        for (int i = 0; i < n; i++)
            if(checkSNT(arr[i])) System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String chuoi = sc.nextLine();
        System.out.println("nhap ki tu");
        char kyTu = sc.next().charAt(0);
        boolean check = false;
        for(char x : chuoi.toCharArray()){
            if(kyTu == x){
                check = true;
                break;
            }
        }
        System.out.println(check);
    }
}
