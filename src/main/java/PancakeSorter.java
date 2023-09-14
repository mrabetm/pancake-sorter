import java.util.List;

public class PancakeSorter {
    private List<Pancake> pancakes;

    public PancakeSorter(List<Pancake> pancakes) {
        this.pancakes = pancakes;
    }

    public List<Pancake> getPancakes() {
        return pancakes;
    }

    public void setPancakes(List<Pancake> pancakes) {
        this.pancakes = pancakes;
    }
}
