import exceptions.ChefRoleException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ChefTest {
    Chef chef1;
    Chef chef2;

    List<Pancake> pancakes;

    @BeforeEach
    void setup(){
       chef1 = new Chef("Gerard",false);
       chef2 = new Chef("Maron",true);

        pancakes = new ArrayList<>();
        pancakes.add(new Pancake(5));
        pancakes.add(new Pancake(6));
        pancakes.add(new Pancake(10));
        pancakes.add(new Pancake(15));
        pancakes.add(new Pancake(4));
        pancakes.add(new Pancake(3));
    }

    @Test
    void onlyChefCanBakePancakes(){
        assertThrows(ChefRoleException.class, () ->{
            chef2.bake();
        });
    }

    @Test
    void bakingPancakesShouldHaveUniqueDiameters() throws ChefRoleException {
        pancakes = chef1.bake();
        assertTrue(arePancakeUnique(pancakes), "Pancakes are unique");
    }

    @Test
    void pancakeSorterShouldGiveCorrectOutput() throws ChefRoleException {
        assertEquals("[Pancake: 15 diameter, " +
                "Pancake: 10 diameter, " +
                "Pancake: 6 diameter, " +
                "Pancake: 5 diameter, " +
                "Pancake: 4 diameter, " +
                "Pancake: 3 diameter]", chef2.sortPancakes(pancakes));
    }

    private boolean arePancakeUnique(List<Pancake> pancakes){
        Set<Pancake> uniquePancakes = new HashSet<>(pancakes);
        return uniquePancakes.size() == pancakes.size();
    }
}
