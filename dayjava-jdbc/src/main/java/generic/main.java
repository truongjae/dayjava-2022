package generic;

import annotationdemo.DayLaDemo;

import java.lang.reflect.Field;

public class main {
    public static void main(String[] args) {
        Field []fields = HocSinh.class.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }
}
