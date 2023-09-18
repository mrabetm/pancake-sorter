import exceptions.ChefRoleException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chef {
    final int MAXIMUM_AMOUNT_OF_PANCAKES_BAKED = 25;
    final double MIN_RADIUS = 1.0;
    final double MAX_RADIUS = 15.0;

    String name;
    Boolean isSousChef;

    public Chef(String name, Boolean isSousChef) {
        this.name = name;
        this.isSousChef = isSousChef;
    }

    public List<Pancake> bake() throws ChefRoleException{
            if (!isSousChef){
                List<Pancake> plate = new ArrayList<>();
                ThreadLocalRandom.current().doubles(MIN_RADIUS, MAX_RADIUS)
                        .distinct().limit(MAXIMUM_AMOUNT_OF_PANCAKES_BAKED)
                        .forEach(randomRadius -> {
                            plate.add(new Pancake(randomRadius));
                        });
                System.out.println(plate);
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
