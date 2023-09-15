import java.util.List;

public class PancakeSorter {
    private List<Pancake> pancakes;

    public PancakeSorter(List<Pancake> pancakes) {
        this.pancakes = pancakes;
    }

    public void sort(List<Pancake> toBeSortedPancakes){
        for (Pancake pancake : toBeSortedPancakes){
            int pancakeWithLargestRadius = getLargestRadius(toBeSortedPancakes);
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
