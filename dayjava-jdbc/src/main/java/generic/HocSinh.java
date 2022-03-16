package generic;

import annotationdemo.DayLaDemo;

public class HocSinh implements Nguoi<NhanVien>{

    private String  username;
    private String password;
    private String quequan;
    private float diem;
   public void language(){
       System.out.println("hoc sinh ban tieng anh");
   }

    @Override
    public NhanVien hello() {
        return new NhanVien();
    }
}
