package OOP;

import java.util.Scanner;


public class main {
    public static void input(Student student[],int n,Scanner sc){
        for (int i = 0; i < n; i++) {
            System.out.println("nhap ten: ");
            String name = sc.nextLine();
            System.out.println("nhap tuoi: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("nhap toan: ");
            int math = Integer.parseInt(sc.nextLine());
            System.out.println("nhap li: ");
            int physics =Integer.parseInt(sc.nextLine());
            System.out.println("nhap hoa: ");
            int chemistry = Integer.parseInt(sc.nextLine());
            Student st = new Student(name,age,math,physics,chemistry);
            student[i] = st;
        }
    }
    public static void output(Student student[],int n){
        for (int i = 0; i < n; i++) {
            System.out.println(student[i].toString());
            System.out.println("DTB: "+student[i].AVG());
            System.out.println("------------------");
        }
    }
    public static void SX(Student student[],int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(student[i].AVG() < student[j].AVG()){
                    Student st = student[i];
                    student[i] = student[j];
                    student[j] = st;
                }
            }
        }
        System.out.println("sau khi sap xep giam dan theo DTB: ");
        output(student,n);
    }
    public static float maxAVG(Student student[],int n){
        float max = student[0].AVG();
        for (int i = 0; i < n; i++) {
            if(max<student[i].AVG()) max= student[i].AVG();
        }
        return max;
    }
    public static void searchMax(Student student[],int n){
        float max = maxAVG(student,n);
        for (int i = 0; i < n; i++) {
            if(student[i].AVG() == max)
                System.out.println(student[i].toString());
        }
    }
    public static void main(String[] args) {
        Student student[] = new Student[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        input(student,n,sc);
        System.out.println("danh sach sinh vien vua nhap: ");
        output(student,n);
        SX(student,n);
        System.out.println("cac sinh vien co diem cao nhat");
        searchMax(student,n);
    }
}
