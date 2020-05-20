package vendingmachine;

import vendingmachine.products.*;

public class ExtendableVendingMachine extends Product {

    int saltySnackQty;
    int chocolateQty;
    int softDrinkQty;
    int bubblegumQty;

    public ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty, int bubblegum) {
        this.saltySnackQty = saltySnacksQty;
        this.chocolateQty = chocolatesQty;
        this.softDrinkQty = softDrinkQty;
        this.bubblegumQty = bubblegum;
    }

    public void buy(Product product) {
        if (product instanceof SaltySnack) {
            this.saltySnackQty--;
        } else if (product instanceof Chocolate) {
            this.chocolateQty--;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty--;
        } else if (product instanceof Bubblegum) {
            this.bubblegumQty--;
        }
    }

    public void buy(Product product, int amount) {
        if (product instanceof SaltySnack) {
            this.saltySnackQty -= amount;
        } else if (product instanceof Chocolate) {
            this.chocolateQty -= amount;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty -= amount;
        } else if (product instanceof Bubblegum) {
            this.bubblegumQty -= amount;
        }
    }

    public void addProduct(Product product) {
        if (product instanceof SaltySnack) {
            this.saltySnackQty++;
        } else if (product instanceof Chocolate) {
            this.chocolateQty++;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty++;
        } else if (product instanceof Bubblegum) {
            this.bubblegumQty++;
        }
    }

    public void addProduct(Product product, int amount) {
        if (product instanceof SaltySnack) {
            this.saltySnackQty += amount;
        } else if (product instanceof Chocolate) {
            this.chocolateQty += amount;
        } else if (product instanceof SoftDrink) {
            this.softDrinkQty += amount;
        } else if (product instanceof Bubblegum) {
            this.bubblegumQty += amount;
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
        } else if (product instanceof Bubblegum) {
            stockLevel = this.bubblegumQty;
        } else if (product instanceof Product) {
            stockLevel = this.saltySnackQty + this.chocolateQty + this.softDrinkQty + this.bubblegumQty;
        }
        return stockLevel;
    }
}
