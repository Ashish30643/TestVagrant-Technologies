import static Utilities.Util.*;

public class Subscription{
    private Product product;      //Product for which subscription is made
    private Day[] daysSubsribed;  //Days of week on which this subscription is applied

    public Subscription(Product product, Day[] daysSubsribed){
      this.product = product;
      this.daysSubsribed = daysSubsribed.clone();
    }

    /**
    * Returns the expense of this subscription for the given month
    */
    public double getMonthlyCost(MONTH month){
      double cost = 0;
      for(Day d : daysSubsribed){
        /* get the Day's rate and multiply it by the total number 
         * of those days in the given month
         */
        cost += product.getDaysPrice(d)*month.getDayCount(d);
      }
      return cost;
    }

}