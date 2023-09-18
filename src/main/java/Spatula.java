import exceptions.ChefRoleException;

import java.util.Collections;
import java.util.List;

/**
 * @Author Mortada M'Rabet
 * Class meant to flip pancakes
 */
public class Spatula {
    private Chef chef;

    public Spatula(Chef chef) {
        this.chef = chef;
    }

    /**
     * @param pancakeStack
     * @param currentIndex
     *
     * Flips the pancakes between the start of the pancakeStack to the currentIndex from the pancakeStack
     */
    public void flipPancakes(List<Pancake> pancakeStack, int currentIndex){
            int start = 0;
            while (start < currentIndex) {
                Collections.swap(pancakeStack, start, currentIndex);
                start++;
                currentIndex--;
            }
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
}
