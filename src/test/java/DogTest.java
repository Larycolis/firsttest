public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Kuka");
        System.out.println("The dog's name is " + dog1.getName());
        dog1.setWeight(10.5);
        System.out.println("The dog's weight is " + dog1.getWeight());
        dog1.setLength(15.2);
        System.out.println("The dog's length is " + dog1.getLength());
        System.out.println("The dog has " + dog1.getLegsCount() + " legs");
        dog1.bark();
        dog1.bite();
        dog1.run();
        System.out.println(" ");
        Dog dog2 = new Dog();
        dog2.setName("Puka");
        System.out.println("The dog's name is " + dog2.getName());
        dog2.setWeight(20.8);
        System.out.println("The dog's weight is " + dog2.getWeight());
        dog2.setLength(22.4);
        System.out.println("The dog's length is " + dog2.getLength());
        System.out.println("The dog has " + dog2.getLegsCount() + " legs");
        dog2.bark();
        dog2.bite();
        dog2.run();
    }
}
