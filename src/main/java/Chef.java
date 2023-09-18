import exceptions.ChefRoleException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author Mortada M'Rabet
 * This class represents a chef
 */
public class Chef {
    private final int MAXIMUM_AMOUNT_OF_PANCAKES_BAKED = 25;
    private final int MIN_RADIUS = 1;
    private final int MAX_RADIUS = 50;

    private String name;
    private Boolean isSousChef;

    public Chef(String name, Boolean isSousChef) {
        this.name = name;
        this.isSousChef = isSousChef;
    }

    /**
     *
     * @return plate
     * @throws ChefRoleException
     * This method retuns a plate filled with pancakes with different diameters
     */
    public List<Pancake> bake() throws ChefRoleException{
            if (!isSousChef){
                List<Pancake> plate = new ArrayList<>();
                ThreadLocalRandom.current().ints(MIN_RADIUS, MAX_RADIUS)
                        .distinct().limit(MAXIMUM_AMOUNT_OF_PANCAKES_BAKED)
                        .forEach(randomRadius -> {
                            plate.add(new Pancake(randomRadius));
                        });
                return plate;
            }
            throw new ChefRoleException(isSousChef);
    }
    /**
     * @param plate
     * @return the plate sorted from biggest to smallest pancake through pancake sorting
     */
    public String sort(List<Pancake> plate) throws ChefRoleException{
        if (this.isSousChef){
            Spatula spatula = new Spatula(this);
            for (int i = plate.size(); i > 1; i--){
                int indexOfLargestPancake = findIndexOfPancakeWithLargestRadius(plate, i);

                if (indexOfLargestPancake != i - 1){
                    spatula.flipPancakes(plate, indexOfLargestPancake);
                    spatula.flipPancakes(plate, i - 1);
                }
            }
            System.out.println(plate);
            return plate.toString();
        }
        throw new ChefRoleException(!this.isSousChef);
    }
    /**
     * @param pancakeStack
     * @param currentIndex
     * @return the index of the pancake with the largest radius within the pancakeStack
     */
    public int findIndexOfPancakeWithLargestRadius(List<Pancake> pancakeStack, int currentIndex){
        int maxIndex = 0;
        for (int i = 0; i < currentIndex; i++){
            if (pancakeStack.get(i).compareTo(pancakeStack.get(maxIndex)) > 0){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
