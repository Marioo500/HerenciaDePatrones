import java.util.Enumeration;

public class HtmlStatement extends Statement{
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
        return "<h1> Rentals for <EM> " + customer.getName() + "</EM></h1><p>\n";
    }
    public String eachRentalString(Rental rental){
        return rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "<br>\n";
    }
    public String footerString(Customer customer){
        String result = "<p>You owe <EM> " + String.valueOf(customer.getTotalCharge()) + "</EM> <p>\n";
        result += "On this rental you earned <EM> " + String.valueOf(customer.getTotalFrequentPoints()) + "</EM> frequent renter points<p>";

        return result;
    }

}
