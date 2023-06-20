import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    String sc;

    @Test
    public void stringCalculator_addingWithNegativeNumber_throwException(){
        sc = "-5,1";

        assertThrows(IllegalArgumentException.class, ()->
                StringCalculator.add(sc));
        sc = "";
    }

    @Test
    public void stringCalculator_addingNumbersGreaterThan1000_ignoreThem(){
        sc = "1,1000";

        int expected = 1;
        int actual = StringCalculator.add(sc);

        assertEquals(expected, actual);

    }

}
