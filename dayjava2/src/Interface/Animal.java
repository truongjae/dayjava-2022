package Interface;

public interface Animal {
    String diChuyen();
    String thucAn();
    int soChan();
    default String tiengNoi(){
        return "gau gau";
    }
}
