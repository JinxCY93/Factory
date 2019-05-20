/**
 * Products
 */
public class Products {

  int wheels;
  private String[] product = { "bicycle", "tricycle" };

  public boolean getProducts(String product) {
    for (int i = 0; i < product.length(); i++) {
      return this.product.equals(product(i));
    }
  }

  // public static void main(String[] args) {
  // Products product = new Products("tricycle");
  // System.out.println(product.wheels);
  // }
}