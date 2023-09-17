import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChefTest {
    Chef chef1;
    Chef chef2;

    @BeforeEach
    void setup(){
       chef1 = new Chef("Gerard",false);
       chef2 = new Chef("Maron",true);
    }

    @Test
    void chefCanBakePancakes(){

    }
    @Test
    void onlySousChefCanFlipPancakes(){

    }
}
