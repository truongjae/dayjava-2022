package Interface;

public class Chim implements Animal{
    public String tenLoai(){
        return "dai bang";
    }
    @Override
    public String diChuyen() {
        return "bang canh";
    }

    @Override
    public String thucAn() {
        return "an sau";
    }

    @Override
    public int soChan() {
        return 2;
    }

    @Override
    public String tiengNoi() {
        return "chip chip";
    }
}
