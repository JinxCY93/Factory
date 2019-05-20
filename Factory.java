/**
 * Factory
 */
public class Factory {
  Products products;
  boolean isTheProduct = false;
  int wheels;
  String brand;

  Factory() {
  }

  void creatingBicycle(String product) {
    this.isTheProduct = this.products.getProducts(product);
    if (this.isTheProduct && product == "bicycle") {
      this.wheels = 2;
      this.brand = "mountain";
      System.out.println("Building a " + this.brand + " bicycle required " + this.wheels + " wheels.");
    }
    if (this.isTheProduct && product == "tricycle") {
      this.wheels = 3;
      this.brand = "tricycle";
      System.out.println("Building a " + this.brand + " required " + this.wheels + " wheels.");
    }
  }

  void allocatingMaterials() {

  }

  void inspectProduct() {

  }

  public static void main(String[] args) {
    Products product = new Products();
    Factory factory = new Factory();
    factory.creatingBicycle("bicycle");

    // ===== Step 1 ======
    // "allocating materials..."
    // "- 2 kg of rubber"
    // "- 5 kg of aluminium"
    // ===== Step 2 ======
    // "Machine #6F30 constructs wheel #1"
    // ===== Step 3 ======
    // "John inspects wheel #1 for irregularities"
    // "John approves wheel #1"
    // ===== Step 4 ======
    // ...
  }
}