package Dahinh;

public class NhanVien extends Nguoi{
    private int luong;
    private int soNamKN;
    public NhanVien(String ten, int tuoi, int luong, int soNamKN) {
        super(ten, tuoi);
        this.luong = luong;
        this.soNamKN = soNamKN;
    }
    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getSoNamKN() {
        return soNamKN;
    }

    public void setSoNamKN(int soNamKN) {
        this.soNamKN = soNamKN;
    }
}
