package kethua;

public class NhanVien extends Nguoi{
    private float luong;
    private int namKN;

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public int getNamKN() {
        return namKN;
    }

    public void setNamKN(int namKN) {
        this.namKN = namKN;
    }

    public NhanVien(String ten, String queQuan, int tuoi, float luong, int namKN) {
        super(ten, queQuan, tuoi);
        this.luong = luong;
        this.namKN = namKN;
    }


    @Override
    public String getTen() {
        return super.getTen() + " hello";
    }

    @Override
    public String getQueQuan() {
        return "vo gia cu";
    }

    public String info(){
        return this.getTen()+" - "+this.getQueQuan()+" - "+ this.getTuoi()+ " - "+
                this.getLuong()+ " - "+this.getNamKN();
    }
}
