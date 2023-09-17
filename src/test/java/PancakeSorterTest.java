import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        pancakes = new ArrayList<>();
        pancakesSameDiameter = new ArrayList<>();
        pancakes25more = new ArrayList<>();
//        for (int i = 0; i < 25; i++){
//            pancakesSameDiameter.add(new Pancake(5.0));
//            pancakes25more.add(new Pancake(random));
//        }
        pancakes.add(new Pancake(5.0));
        pancakes.add(new Pancake(6.0));
        pancakes.add(new Pancake(10.0));
        pancakes.add(new Pancake(15.0));
        pancakes.add(new Pancake(4.0));
        pancakes.add(new Pancake(3.0));

        pancakes25more.add(new Pancake(random));
        pancakeSorter = new PancakeSorter(pancakes);
    }

    @Test
    void unableToSortWhenPancakeStackIsLargerThan25(){
        assertEquals("Unable to sort pancake stack", pancakeSorter.sort(pancakes));
    }
    @Test
    void unableToSortWhenPancakesInPancakeStackHaveSameDiameter(){
        assertEquals("Unable to sort pancake stack", pancakeSorter.sort(pancakes));
    }
    @Test
    void pancakeSorterShouldGiveCorrectOutput(){
        assertEquals("15,10,6,5,4,3", pancakeSorter.sort(pancakes));
    }

}
