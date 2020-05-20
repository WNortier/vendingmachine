package vendingmachine;

import vendingmachine.products.Chocolate;
import vendingmachine.products.Product;
import vendingmachine.products.SaltySnack;
import vendingmachine.products.SoftDrink;

public class ExtendableVendingMachine extends Product {

    int saltySnackQty;
    int chocolateQty;
    int softDrinkQty;

    public ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.saltySnackQty++;
        this.chocolateQty++;
        this.softDrinkQty++;
    }

    public void buy (Product product) {
        if (product instanceof SaltySnack){
            this.saltySnackQty++;
        } else if (product instanceof Chocolate){
            this.chocolateQty++;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty++;
        }
    }

    public int getSaltySnackQty() {
        return saltySnackQty;
    }

    public int getChocolateQty() {
        return chocolateQty;
    }

    public int getSoftDrinkQty() {
        return softDrinkQty;
    }
}
