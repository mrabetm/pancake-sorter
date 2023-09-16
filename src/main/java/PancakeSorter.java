import java.util.Collections;
import java.util.List;

public class PancakeSorter {
    private List<Pancake> pancakes;

    public PancakeSorter(List<Pancake> pancakes) {
        this.pancakes = pancakes;
    }

    public void sort(List<Pancake> toBeSortedPancakes){
        for (Pancake pancake : toBeSortedPancakes){
            int pancakeWithLargestRadius = getLargestRadius(toBeSortedPancakes);
            int currentPancake = toBeSortedPancakes.indexOf(pancake);

            if (pancakeWithLargestRadius != currentPancake - 1){
                flip(toBeSortedPancakes, pancakeWithLargestRadius);
                flip(toBeSortedPancakes, currentPancake - 1);
            }
        }
    }
    public void flip(List<Pancake> toBeSortedPancakes, int currentPos){
        int start = 0;

        while (start < currentPos){
            Collections.swap(toBeSortedPancakes, start, currentPos);
            start++;
            currentPos--;
        }
    }

    public int getLargestRadius(List<Pancake> toBeSortedPancakes){
        int maxIndex = 0;
        for (Pancake pancake : toBeSortedPancakes){
            int currentPancakeIndex = toBeSortedPancakes.indexOf(pancake);
            if (toBeSortedPancakes.get(currentPancakeIndex).compareTo(toBeSortedPancakes.get(maxIndex)) > 0){
                maxIndex = currentPancakeIndex;
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
