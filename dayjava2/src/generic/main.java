package generic;

public class main {
    public static void main(String[] args) {
        Animal animal = new DogImpl();
        Tun tun = (Tun) animal.data();
        tun.print();

        Animal animal1 = new CatImpl();
        Meow meo = (Meow) animal1.data();
        meo.print();

    }
}
