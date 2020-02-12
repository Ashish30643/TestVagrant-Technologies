import java.util.*;

public class Catalogue{
  private static Map<String, Product> products;

  // ideally the products should be picked up from database at the application startup
  // Filling out values statically for the sake of assignment
  static{
    products = new HashMap<String, Product>();

    double[] rates = new double[]{3, 3, 3, 3, 3, 5, 6};
    Product p = new Product("TOI", "Books & Periodical category");
    p.setDailyRates(rates);
    products.put("TOI", p);

    rates = new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 4, 4};
    p = new Product("Hindu", "Books & Periodical category");
    p.setDailyRates(rates);
    products.put("Hindu", p);

    rates = new double[]{2, 2, 2, 2, 2, 2, 10};
    p = new Product("ET", "Books & Periodical category");
    p.setDailyRates(rates);
    products.put("ET", p);

    rates = new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5};
    p = new Product("BM", "Books & Periodical category");
    p.setDailyRates(rates);
    products.put("BM", p);

    rates = new double[]{2, 2, 2, 2, 2, 4, 4};
    p = new Product("HT", "Books & Periodical category");
    p.setDailyRates(rates);
    products.put("HT", p);
  }

  public static Product getProduct(String productName){
    if(products.containsKey(productName)){
      return products.get(productName);
    }
    return null;
  }
}