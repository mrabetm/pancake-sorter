import exceptions.ChefRoleException;

import java.util.Collections;
import java.util.List;

public class Spatula {
    Chef chef;

    public Spatula(Chef chef) {
        this.chef = chef;
    }

    /**
     * @param pancakeStack
     * @param currentIndex
     *
     * Flips the pancakes within the pancakeStack from the start to currentPosition
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
