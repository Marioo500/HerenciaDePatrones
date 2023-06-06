import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StatisticsDisplay implements Observer, DisplayElement{
    private ArrayList temps;
    private float tempAvg;
    private float tempMax;
    private float tempMin;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData)
    {
        temps = new ArrayList();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure)
    {
        temps.add(temp);
        tempMax = temp;
        tempMin = temp;
        tempAvg = 0;
        for (int i = 0; i < temps.size(); i++)
        {
            if (tempMax < (float) temps.get(i))
            {
                tempMax = (float) temps.get(i);
            }
            tempAvg = tempAvg + (float) temps.get(i);
            if (tempMin > (float) temps.get(i))
            {
                tempMin = (float) temps.get(i);
            }
        }
        tempAvg = tempAvg / temps.size();
        display();
    }

    public void display(){
        System.out.println("Avg/Max/Min: " + tempAvg +"/" + tempMax +"/"+ tempMin);
    }
}
