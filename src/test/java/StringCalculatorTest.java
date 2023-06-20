import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    String sc;

    @BeforeEach
    public void setUp() {
        String sc = "";
    }

    @AfterEach
    public void tearDown() {
        String sc = "";
    }

    @Test
    public void stringCalculator_addingWithNegativeNumber_throwException(){
        sc = "3,-2,1";

        assertThrows(IllegalArgumentException.class, ()->
                StringCalculator.add(sc));
    }

}
