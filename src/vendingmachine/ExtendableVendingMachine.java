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
        this.saltySnackQty = saltySnacksQty;
        this.chocolateQty = chocolatesQty;
        this.softDrinkQty = softDrinkQty;
    }

    public void buy(Product product) {
        if (product instanceof SaltySnack) {
            this.saltySnackQty--;
        } else if (product instanceof Chocolate) {
            this.chocolateQty--;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty--;
        }
    }

    public void buy(Product product, int amount) {
        if (product instanceof SaltySnack) {
            this.saltySnackQty -= amount;
        } else if (product instanceof Chocolate) {
            this.chocolateQty -= amount;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty -= amount;
        }
    }

    public void addProduct(Product product, int amount) {
        if (product instanceof SaltySnack) {
            this.saltySnackQty += amount;
        } else if (product instanceof Chocolate) {
            this.chocolateQty += amount;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty += amount;
        }
    }

    public void addProduct(Product product) {
        if (product instanceof SaltySnack) {
            this.saltySnackQty++;
        } else if (product instanceof Chocolate) {
            this.chocolateQty++;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty++;
        }
    }

    public int getStock(Product product) {
        int stockLevel = 0;
        if (product instanceof SaltySnack) {
            stockLevel = this.saltySnackQty;
        } else if (product instanceof Chocolate) {
            stockLevel = this.chocolateQty;
        } else if (product instanceof SoftDrink) {
            stockLevel = this.softDrinkQty;
        } else if (product instanceof Product) {
            stockLevel = this.saltySnackQty + this.chocolateQty + this.softDrinkQty;
        }
        return stockLevel;
    }
}
