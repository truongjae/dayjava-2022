/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formdemo;

import java.util.ArrayList;

/**
 *
 * @author truon
 */
public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int age;
    private String sex;
    private String address;
    private static ArrayList<Student> arr = new ArrayList<>();
    public Student(){
        
    }
    public Student(StudentBuilder studentBuilder){
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.sex = studentBuilder.sex;
        this.address = studentBuilder.address;
    }

    public Student(String id, String name, int age, String sex, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    
    
    public static class StudentBuilder{
            private String id;
            private String name;
            private int age;
            private String sex;
            private String address;
            
            public StudentBuilder id(String id){
                this.id = id;
                return this;
            }
            public StudentBuilder name(String name){
                this.name = name;
                return this;
            }
            public StudentBuilder age(int age){
                this.age = age;
                return this;
            }
            public StudentBuilder sex(String sex){
                this.sex = sex;
                return this;
            }
            public StudentBuilder address(String address){
                this.address = address;
                return this;
            }
            public Student build(){
                return new Student(this);
            }
    }
    
     public void info(){
                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("Sex: "+sex);
                System.out.println("Address: "+address);
    }
    


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }
    
//    public static void main(String[] args) {
//        Student st = new Student.StudentBuilder().name("nguyen van nguyen")
//                .age(20).address("thanh hoa").build();
//        
//        Student st2 = new Student.StudentBuilder().name("vu duc kien")
//                .age(20).address("hai duong").build();
//        Student st3 = new Student.StudentBuilder().name("nguyen ba toi")
//                .age(20).address("bac giang").build();
//        arr.add(st);
//        arr.add(st3);
//        arr.add(st2);
//        for(Student s : arr){
//            s.info();
//        }
//    }
    @Override
    public int compareTo(Student o) {
        if(o.getAge() < getAge())   return 1;
        else if(o.getAge() == getAge())  return 0;
        else return -1;
    }
    
 
}
