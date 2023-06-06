import java.lang.Math;
public class HeatIndexDisplay implements DisplayElement, Observer {
    private Subject weatherData;;
    private double heat_index;

    public HeatIndexDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){
        heat_index = 16.923 + 1.85212e-1 * temp + 5.37941 * (humidity/100) - 1.00254e-1 * temp
                * (humidity/100) + 9.41695e-3 * Math.pow(temp, 2) + 7.28898e-3 + Math.pow((humidity/100), 2) + 3.45372e-4
                * Math.pow(temp, 2) * (humidity/100) - 8.14971e-4 * temp * Math.pow((humidity/100), 2)  + 1.02102e-5 *  Math.pow((humidity/100), 2) * Math.pow(temp, 2) -
                3.8646e-5 * Math.pow(temp, 3) + 2.91583e-5 + Math.pow((humidity/100), 3)  + 1.42721e-6 * Math.pow(temp, 3) * humidity
                + 1.97483e-7 * temp * Math.pow((humidity/100), 3) - 2.18429e-8 * Math.pow(temp, 3) * Math.pow((humidity/100), 2) + 8.43296e-10
                * Math.pow(temp, 2) * Math.pow((humidity/100), 3) - 4.81975e-11 * Math.pow(temp, 3) * Math.pow((humidity/100), 3);
        display();
    }

    public void display(){
            System.out.println("Heat Index:" + heat_index);
    }
}
