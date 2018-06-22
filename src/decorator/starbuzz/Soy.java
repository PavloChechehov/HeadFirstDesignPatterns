package decorator.starbuzz;

public class Soy extends Beverage {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.SMALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.MEDIUM) {
            cost += .15;
        } else if (beverage.getSize() == Size.BIG) {
            cost += .20;
        }
        return cost;
    }
}
