package generic;

public class NhanVien implements Nguoi<HocSinh>{



    public void language(){
        System.out.println("nhan vien ban tieng viet");
    }


    @Override
    public HocSinh hello() {
        return new HocSinh();
    }
}
