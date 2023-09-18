import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PancakeTest {
    Pancake pancake1;
    Pancake pancake2;

    @BeforeEach
    void setup(){
        pancake1 = new Pancake(5);
        pancake2 = new Pancake(2);
    }
    @Test
    void compareSmallPancakeToLargePancakeGives1(){
        assertEquals(1, pancake2.compareTo(pancake1));
    }
}
