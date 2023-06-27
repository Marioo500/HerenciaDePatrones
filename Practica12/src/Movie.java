public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;

    private String title;
    private Price price;

    public Movie(String title, int priceCode){
        this.title = title;

    }

    public int getPriceCode(){
        return price.getPriceCode();
    }

    public void setPrice(int arg){
        switch (arg){
            case REGULAR -> {
                price = new RegularPrice();
                break;
            }
            case CHILDREN -> {
                price = new ChildenPrice();
                break;
            }
            case NEW_RELEASE -> {
                price = new NewReleasePrice();
                break;
            }

            default -> {
                throw new IllegalArgumentException("Incorrect price code");
            }
        }
    }
    public String getTitle(){
        return title;
    }

    double getCharge(int daysRented){
       return price.getCharge(daysRented);
    }

    double getRenterPoints(){
        double result = 0;
        return result;
    }
}
