package kethua;

public class Nguoi {
    private String ten;
    private String queQuan;
    private int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Nguoi(String ten, String queQuan, int tuoi) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.tuoi = tuoi;
    }
}
