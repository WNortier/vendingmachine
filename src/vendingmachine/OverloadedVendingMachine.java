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

    public void buy(Chocolate chocolate) {
        this.chocolatesQty++;
    }

    public void buy(SaltySnack saltySnack) {
        this.saltySnackQty++;
    }

    public void buy(SoftDrink softDrink) {
        this.softDrinkQty++;
    }

    public void buy(Product product) {
        this.chocolatesQty++;
        this.saltySnackQty++;
        this.softDrinkQty++;
    }

    public void addProduct(Chocolate chocolate) {
        this.chocolatesQty++;
    }

    public void addProduct(SaltySnack saltySnack) {
        this.saltySnackQty++;
    }

    public void addProduct(SoftDrink softDrink) {
        this.softDrinkQty++;
    }

    public void addProduct(Product product) {
        this.chocolatesQty++;
        this.saltySnackQty++;
        this.softDrinkQty++;
    }

    public int getSoftDrinkQty() {
        return softDrinkQty;
    }

    public int getSaltySnackQty() {
        return saltySnackQty;
    }

    public int getChocolatesQty() {
        return chocolatesQty;
    }
}
