public class Cat extends Animals implements Runnable, Snappish {

    void meow() {
        System.out.println("Meow-meow");
    }

    void meow(String name) {
        System.out.println("Khhhhhhh");
    }

    void meow(int name) {
        System.out.println("Ghhhhhhh");
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
