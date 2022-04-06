public class Dog extends Animals implements Runnable, Snappish {

    void bark() {
        System.out.println("Wuf-wuf");
    }

    @Override
    public void run() {
        System.out.println("Top-top");
    }

    @Override
    public void bite() {
        System.out.println("Kus'");
    }
}
