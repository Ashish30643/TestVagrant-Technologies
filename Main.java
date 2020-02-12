import java.util.*;
import static Utilities.Util.*;

class Main {
  public static void main(String[] args) {
    // create a user
    User user = new User("Ashish");

    // take the user input
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    String user_input = sc.next();
    String[] products = user_input.split(",");    
    
    // subscribing for 4 days for all products, (you may choose any days for any product)
    Day[] days_subscribed = new Day[]{Day.MONDAY, Day.WEDNESDAY, Day.SATURDAY, Day.SUNDAY};
    for(String p: products){
      Product product = Catalogue.getProduct(p.trim());
      user.subscribe(product, days_subscribed);
    }

    // displaying the monthly expense for February
    System.out.println("Total monthly expense for all the subscriptions for the month: " + user.getMonthlyCost(MONTH.FEB));
  }
}