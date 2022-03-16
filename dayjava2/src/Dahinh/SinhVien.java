package Dahinh;

public class SinhVien extends Nguoi {
    private String maSV;
    private float dtb;


    public SinhVien(String ten, int tuoi, String maSV, float dtb) {
        super(ten, tuoi);
        this.maSV = maSV;
        this.dtb = dtb;
    }
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

}
