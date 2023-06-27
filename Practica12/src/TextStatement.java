import java.util.Enumeration;

public class TextStatement extends Statement{
    public String value(Customer customer){
        Enumeration rentals = customer.getRents().elements();
        String result = headerString(customer);

        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalString(each);
        }

        result += footerString(customer);

        return result;
    }

    public String headerString(Customer customer){
        return "Rentals for " + customer.getName() + "\n";
    }
    public String eachRentalString(Rental rental){
        return rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "\n";
    }
    public String footerString(Customer customer){
        String result = "You owe " + String.valueOf(customer.getTotalCharge()) + "\n";
        result += "On this rental you earned " + String.valueOf(customer.getTotalFrequentPoints()) + "frequent renter points";

        return result;
    }
}
