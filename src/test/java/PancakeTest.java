import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PancakeTest {
    Pancake pancake1;
    Pancake pancake2;

    @BeforeEach
    void setup(){
        pancake1 = new Pancake(5.06);
        pancake2 = new Pancake(2.0);
    }
    @Test
    void compareToTest(){
        assertEquals(1, pancake1.compareTo(pancake2));
    }
}
