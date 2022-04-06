import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2 {
    @Test
    void checkWeekdayTest() {
        Assertions.assertEquals("Friday", generateWeekday(5), "wrong day");
        Assertions.assertEquals("Wrong day", generateWeekday(8), "wrong day");
    }

    private String generateWeekday(int dayNumber) {
        String day = "";
        if (dayNumber == 1) {
            day = "Monday";
        } else if (dayNumber == 2) {
            day = "Tuesday";
        } else if (dayNumber == 3) {
            day = "Wednesday";
        } else if (dayNumber == 4) {
            day = "Thursday";
        } else if (dayNumber == 5) {
            day = "Friday";
        } else if (dayNumber == 6) {
            day = "Saturday";
        } else if (dayNumber == 7) {
            day = "Sunday";
        } else {
            day = "Wrong day";
        }
        return day;
    }

    private String walk(String option) {
        String decision = "";
        if (option.equals("Sun")) {
            decision = "Go to walk";
        }
        else if (option.equals("Rain")) {
            decision = "Stay at home";
        }
        else {
            decision = "Look out the window";
        }
        return decision;
    }
}
