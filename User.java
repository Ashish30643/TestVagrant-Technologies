import java.util.*;
import static Utilities.Util.*;

public class User{
    private int userId;       // unique id of the user which should be incrementally stored in database, skipping setting this for the assignment
    private String userName;  // Name of the user which can be duplicate
    private List<Subscription> subscriptions; // List of all the subscriptions subscribed by the user

    public User(String userName){
        this.userName = userName;
        this.subscriptions = new LinkedList<Subscription>();
    }
    
    /**
     * Creates a new subscription for the given product and the given weekdays
     */
    public void subscribe(Product product, Day[] daysSubscribed){
      subscriptions.add(new Subscription(product, daysSubscribed));
    }

    /**
     * Returns the total subscription cost for all the products 
     * subscribed by the user for the given month
     */
    public double getMonthlyCost(MONTH month){
      double cost = 0;
      for(Subscription subscription : subscriptions){
        cost += subscription.getMonthlyCost(month);
      }
      return cost;
    }

     /**
      * Returns the total subscription cost for all the products
      * subscribed by the user for the current year
      */
    public double getYearlyCost(){
      double cost = 0;
      for(MONTH m: MONTH.values()){
        cost += getMonthlyCost(m);
      }
      return cost;
    } 
}