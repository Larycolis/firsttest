import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CatTest {
    public static void main (String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Fluffy");
        System.out.println("The cat's name is " + cat1.getName());
        System.out.println("Fluffy has " + cat1.getLegsCount() + " legs");
        cat1.meow(5);
    }

    @Test
    void name() {
        Cat cat1 = new Cat();
        cat1.setName("Fluffy");
        Cat cat2 = new Cat();
        cat2.setName("Yammy");
        Cat cat3 = new Cat();
        cat3.setName("Ku");
        Cat[] cats = new Cat[3];
        System.out.println(cats.length);
        cats[2] = cat3;
        System.out.println(Arrays.asList(cats));
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
