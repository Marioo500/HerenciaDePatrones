import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private java.util.Vector rentas = new java.util.Vector<>();


    public Customer(String name){
        this.name = name;
    }

    public void addRental(Rental arg){
        rentas.addElement(arg);
    }

    public String getName(){
        return name;
    }

    public String statement(){
        return new TextStatement().value(this);
    }

    public String htmlStatement(){
        return new HtmlStatement().value(this);
    }
    public double getTotalCharge(){
        double result = 0;
        Enumeration rentals = rentas.elements();

        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    public double getTotalFrequentPoints(){
        double result = 0;
        Enumeration rentals = rentas.elements();

        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }

        return result;
    }

    public Vector getRents(){
        return rentas;
    }
}

