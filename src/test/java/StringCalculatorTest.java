import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    String sc = "";

    @Test
    public void stringCalculator_addingWithNegativeNumber_throwException(){
        sc = "3,-2,1";

        assertThrows(IllegalArgumentException.class, ()->
                StringCalculator.add(sc));
    }

}
