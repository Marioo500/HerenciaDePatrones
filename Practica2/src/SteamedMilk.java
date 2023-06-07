public class SteamedMilk extends CondimentDecorator{
    Beverage beverage;

    public SteamedMilk(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed milk";
    }

    public double cost(){
        return beverage.cost() + .10;
    }
}
