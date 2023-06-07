public abstract class  Beverage {
    String description = "Bebida desconocida";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
