public class Store {
    public String productType;
    public int inventoryCount;
    public double inventoryPrice;
    public static double tax = 0.07;

    // The constructor is a special method that is called when you create a new object.
    // It is used to initialize the instance variables of the object.
    // The constructor has the same name as the class and does not have a return type.
    // In this constructor, we take three parameters: product, count, and price, and we use them to initialize the instance variables of the Store object.
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    public void greetCustomer(String customerName) {
        System.out.println("Welcome to the " + productType + " store, " + customerName + "!");
    }

    public void increasePrice(double priceToAdd){
      double newPrice = inventoryPrice + priceToAdd;
      inventoryPrice = newPrice;
    }

    public double getPriceWithTax(){
      double priceWithTax = inventoryPrice + (inventoryPrice * tax);
      return Math.round(priceWithTax * 100.0) / 100.0;
    }

    // The toString method is a special method that is called when you try to print an object.
    // It should return a string that represents the object in a human-readable way.
    public String toString() {
        return "This store sells " + productType + " and has " + inventoryCount + " items in stock, each for $" + inventoryPrice;
    }
}

// This code defines a class called Store with three instance variables: productType, inventoryCount, and inventoryPrice. 
// The constructor initialises these variables when a new Store object is created. 
// In the main method, two Store objects are created with different values, 
// and then the product type of the first store and the inventory count of the second store are printed to the console.     