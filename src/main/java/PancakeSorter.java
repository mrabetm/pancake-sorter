import java.util.Collections;
import java.util.List;

public class PancakeSorter {
    private List<Pancake> pancakes;

    public PancakeSorter(List<Pancake> pancakes) {
        this.pancakes = pancakes;
    }


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
        return pancakes.toString();
    }

    public void flipPancakeStack(List<Pancake> toBeSortedPancakes, int currentPos){
        int start = 0;
        while (start < currentPos){
            Collections.swap(toBeSortedPancakes, start, currentPos);
            start++;
            currentPos--;
        }
    }

    public int findIndexOfPancakeWithLargestRadius(List<Pancake> toBeSortedPancakes, int currentIndex){
        int maxIndex = 0;
        for (int i = 0; i < currentIndex; i++){
            if (toBeSortedPancakes.get(i).compareTo(toBeSortedPancakes.get(maxIndex)) > 0){
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
