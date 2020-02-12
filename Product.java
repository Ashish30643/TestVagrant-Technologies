import java.util.*;
import static Utilities.Util.*;

public class Product{
    private String productName;     // name of the product
    private String productCategory; // category of the product
    private double[] rates;         // price of the product for each day in week from Monday to Sunday
    
    public Product(String productName, String productCategory){
        this.productName = productName;
        this.productCategory = productCategory;
        this.rates = new double[7];
    }
    
    public String getProductName(){
        return productName;
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public String getProductCategory(){
        return productCategory;
    }
    
    public void setProductCategory(String productCategory){
        this.productCategory = productCategory;
    }
    
    /**
     * Sets the daily rates for the week
     * @param rates: a double array of size 7 for each of the day from Monday to Sunday
     */
    public void setDailyRates(double[] rates){
        if(rates.length != 7){
            throw new IllegalArgumentException("Rates for exactly 7 days required.");
        }
        else{
            this.rates = rates.clone();
        }
    }
    
    /**
     * Returns the price of the product for a given Day
     */
    public double getDaysPrice(Day d){
        return rates[d.ordinal()];
    }

}