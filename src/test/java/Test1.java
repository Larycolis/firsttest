import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    void checkSum() {
        double weight = 60.0;
        double height = 120.0;
        Assertions.assertEquals(180.0,weight + height, "wrong sum");
    }

    @Test
    void checkDifference() {
        double weight = 60.0;
        double height = 120.0;
        Assertions.assertEquals(-60.0,weight - height, "wrong difference");
    }
}
