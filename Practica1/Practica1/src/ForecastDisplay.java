public class ForecastDisplay implements DisplayElement, Observer{
    private Subject weatherData;
    private String str;
    private int i;

    public ForecastDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){
        i++;
        switch (i){
            case 1:
                str = "Improving weather";
                break;
            case 2:
                str = "Watch out for cooler, rainy weather";
                break;
            case 3:
                str = "More of the same";
                break;
        }
        display();
    }

    public void display(){
        System.out.println(str);
    }
}
