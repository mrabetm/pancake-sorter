import java.util.Collections;
import java.util.List;


/**
 * @Author Mortada M'Rabet
 * Class for sorting pancakes
 */
public class PancakeSorter {
    private List<Pancake> pancakes;

    public PancakeSorter(List<Pancake> pancakes) {
        this.pancakes = pancakes;
    }
    /**
     * @param plate
     * @return the plate sorted from biggest to smallest pancake through pancake sorting
     */
    public String sort(List<Pancake> plate){
        if (plate.isEmpty() && plate.size() > 25){
            return "unable to sort pancake stack";
        }
        for (int i = plate.size(); i > 1; i--){
            int indexOfLargestPancake = findIndexOfPancakeWithLargestRadius(plate, i);

            if (indexOfLargestPancake != i - 1){
                flipPancakeStack(plate, indexOfLargestPancake);
                flipPancakeStack(plate, i - 1);
            }
        }
        return plate.toString();
    }

    /**
     * @param pancakeStack
     * @param currentIndex
     *
     * Flips the pancakes within the pancakeStack from the start to currentPosition
     */
    public void flipPancakeStack(List<Pancake> pancakeStack, int currentIndex){
        int start = 0;
        while (start < currentIndex){
            Collections.swap(pancakeStack, start, currentIndex);
            start++;
            currentIndex--;
        }
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

    public List<Pancake> getPancakes() {
        return pancakes;
    }

    public void setPancakes(List<Pancake> pancakes) {
        this.pancakes = pancakes;
    }
}
