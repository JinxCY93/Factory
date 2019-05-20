/**
 * Materials
 */
public class Materials {

  private String product;
  private String materials;
  private int weights;

  Materials(String product, String materials, int weights) {
    this.product = product;
    this.materials = materials;
    this.weights = weights;
  }

  public static void main(String[] args) {
    Materials material = new Materials("bicycle", "rubber", 2);
    Materials material2 = new Materials("bicycle", "aluminum", 5);
    Materials material3 = new Materials("tricycle", "aluminum", 3);
    Materials material4 = new Materials("tricycle", "aluminum", 6);
  }
}