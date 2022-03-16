package Interface;

public class Dog implements Animal{

    @Override
    public String diChuyen() {
        return "bang chan";
    }

    @Override
    public String thucAn() {
        return "an thit";
    }

    @Override
    public int soChan() {
        return 4;
    }

    @Override
    public String tiengNoi() {
        return "hong pe oi";
    }
}
