public class Pancake {
    private double diameter;

    public Pancake(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public double compareTo(Pancake toBeComparedPancake){
        return Double.compare(this.diameter, toBeComparedPancake.getDiameter());
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
