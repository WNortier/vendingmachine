package vendingmachine;

import vendingmachine.products.Chocolate;
import vendingmachine.products.Product;
import vendingmachine.products.SaltySnack;
import vendingmachine.products.SoftDrink;

public class OverloadedVendingMachine extends Product {

    private int softDrinkQty;
    private int saltySnackQty;
    private int chocolatesQty;


    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    void buy(Chocolate chocolate) {
        this.chocolatesQty--;
    }

    void buy(SaltySnack saltySnack) {
        this.saltySnackQty--;
    }

    void buy(SoftDrink softDrink) {
        this.softDrinkQty--;
    }

    void buy(Product product) {
        this.chocolatesQty--;
        this.saltySnackQty--;
        this.softDrinkQty--;
    }

}
