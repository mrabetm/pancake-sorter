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
    }

    @Test
    void onlyChefCanBakePancakes(){
        assertThrows(ChefRoleException.class, () ->{
            chef2.bake();
        });
    }

    @Test
    void bakingProcessShouldGoCorrectly() throws ChefRoleException {
        pancakes = chef1.bake();
        assertTrue(arePancakeUnique(pancakes), "Pancakes are unique");
        chef2.sort(pancakes);
    }

    @Test
    void pancakeSorterShouldGiveCorrectOutput() throws ChefRoleException {
        assertEquals("[Pancake: 15,0 diameter, " +
                "Pancake: 10,0 diameter, " +
                "Pancake: 6,0 diameter, " +
                "Pancake: 5,0 diameter, " +
                "Pancake: 4,0 diameter, " +
                "Pancake: 3,0 diameter]", chef2.sort(pancakes));
    }

    private boolean arePancakeUnique(List<Pancake> pancakes){
        Set<Pancake> uniquePancakes = new HashSet<>(pancakes);
        return uniquePancakes.size() == pancakes.size();
    }
}
