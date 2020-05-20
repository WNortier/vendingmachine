package vendingmachine;

import vendingmachine.products.Product;

public class Main {
    public static void main(String[] args) {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(5, 5,5);
        extendableVendingMachine.getStock(new Product());
    }
}
