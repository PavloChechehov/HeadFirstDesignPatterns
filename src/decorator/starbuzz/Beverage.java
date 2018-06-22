package decorator.starbuzz;

public abstract class Beverage {

    public enum Size { SMALL, MEDIUM, BIG };
    Size size = Size.MEDIUM;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    String description = "Unknown Beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

