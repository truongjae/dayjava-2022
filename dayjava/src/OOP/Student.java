package OOP;

public class Student {
    private String name;
    private int age;
    private int math;
    private int physics;
    private int chemistry;

    // tinh diem trung binh tung hoc sinh
    // sap xep hoc sinh do theo thu tu giam dan thong qua diem tb
    // tim hoc sinh co diem tb lon nhat

    public Student(String name, int age, int math, int physics, int chemistry) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public float AVG(){
        return (float)(this.math+this.physics+this.chemistry) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }

}
