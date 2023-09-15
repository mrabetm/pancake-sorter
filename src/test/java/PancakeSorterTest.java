import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PancakeSorterTest {
    PancakeSorter pancakeSorter;
    List<Pancake> pancakes;
    List<Pancake> pancakesSameDiameter;
    List<Pancake> pancakes25more;
    double random = new Random().nextDouble();

    @BeforeEach
    void setup(){
        for (int i = 0; i < 25; i++){
            pancakes.add(new Pancake(random));
            pancakesSameDiameter.add(new Pancake(5.0));
            pancakes25more.add(new Pancake(random));
        }
        pancakes25more.add(new Pancake(random));
        pancakeSorter = new PancakeSorter(pancakes);
    }

    @Test
    void unableToSortWhenPancakeStackIsLargerThan25(){
        assertEquals("Unable to sort pancake stack", pancakeSorter.sort());
    }
    @Test
    void unableToSortWhenPancakesInPancakeStackHaveSameDiameter(){
        assertEquals("Unable to sort pancake stack", pancakeSorter.sort());
    }
    @Test
    void pancakeSorterShouldGiveCorrectOutput(){
        assertEquals(Collections.sort(pancakes, Collections.<Pancake>reverseOrder()), pancakeSorter.sort());
    }

}
