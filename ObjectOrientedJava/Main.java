public class Main {
  public static void main(String[] args) {

    SavingsAccount savings = new SavingsAccount(2000);
        
    //Check balance:
    savings.checkBalance();
        
    //Withdrawing:
    savings.withdraw(300);
        
    //Check balance:
    savings.checkBalance();
        
    //Deposit:
    savings.deposit(600);
        
    //Check balance:
    savings.checkBalance();
        
    //Deposit:
    savings.deposit(600);
        
    //Check balance:
    savings.checkBalance();
        
    System.out.println(savings);

    Store coffeeShop = new Store("Coffee", 100, 2.99);
    Store cookieShop = new Store("cookies", 12, 3.75);

    // Accessing instance variables and calling methods on the coffeeShop and cookieShop objects.
    System.out.println(coffeeShop.productType);

    // Accessing the inventoryCount instance variable of the cookieShop object and printing it to the console.
    System.out.println(cookieShop.inventoryCount);

    // Calling the advertise method on the coffeeShop object, which prints a message to the console advertising the coffee shop.
    coffeeShop.advertise();
    coffeeShop.greetCustomer("Jack");
    System.out.println(coffeeShop.inventoryPrice);
    coffeeShop.increasePrice(0.50);
    System.out.println(coffeeShop.inventoryPrice);
    System.out.println(coffeeShop.getPriceWithTax());
    System.out.println(coffeeShop);

  }
}