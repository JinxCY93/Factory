import java.util.ArrayList;

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

  void Materials(String pname) {
    Materials material = new Materials("bicycle", "rubber", 2);
    Materials material2 = new Materials("bicycle", "aluminum", 5);
    Materials material3 = new Materials("tricycle", "aluminum", 3);
    Materials material4 = new Materials("tricycle", "aluminum", 6);

    List<Materials> pmaterial = new ArrayList<Materials>();
    pmaterial.add(material);
    pmaterial.add(material1);
    pmaterial.add(material2);
    pmaterial.add(material3);

    if (pname == "bicycle") {
      return "Required materials " + pmaterial(0) + pmaterial(1);
    }
    if (pname == "tricycle") {
      return "Required materials " + pmaterial(2) + pmaterial(3);
    }
  }
}