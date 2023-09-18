/**
 * @Author Mortada M'Rabet
 * This class represents a pancake
 */
public class Pancake {
    private int diameter;

    public Pancake(int diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    /**
     * @param toBeComparedPancake
     * @return 1 if tobeComparedPancake is bigger than the current diameter, -1 if to beComparedPancake is smaller than the current diameter
     */
    public double compareTo(Pancake toBeComparedPancake){
        return Double.compare(toBeComparedPancake.getDiameter(), this.diameter);
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.format("Pancake: %.1f diameter", diameter);
    }
}
