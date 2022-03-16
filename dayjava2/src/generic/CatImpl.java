package generic;

public class CatImpl implements Cat{
    @Override
    public Meow data() {
        return new Meow();
    }
}
