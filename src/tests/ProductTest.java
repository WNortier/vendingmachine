package tests;
import org.junit.Test;
import vendingmachine.OverloadedVendingMachine;
import vendingmachine.products.Chocolate;
import vendingmachine.products.Product;
import vendingmachine.products.SaltySnack;
import vendingmachine.products.SoftDrink;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    @Test
    public void shouldBuySoftDrink() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 5, 5);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(softDrink);
        assertEquals(4, overloadedVendingMachine.getSoftDrinkQty());
    }

    @Test
    public void shouldBuySaltySnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 5, 5);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(saltySnack);
        assertEquals(3, overloadedVendingMachine.getSaltySnackQty());
    }

    @Test
    public void shouldBuyChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 5, 5);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(chocolate);
        assertEquals(2, overloadedVendingMachine.getChocolatesQty());
    }

    @Test
    public void shouldBuyProduct() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 5, 5);
        Product product = new Product();
        overloadedVendingMachine.buy(product);
        assertEquals(4, overloadedVendingMachine.getChocolatesQty());
        assertEquals(4, overloadedVendingMachine.getSaltySnackQty());
        assertEquals(4, overloadedVendingMachine.getSoftDrinkQty());
    }

    @Test
    public void shouldAddSoftDrink() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 5, 5);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.addProduct(softDrink);
        assertEquals(6, overloadedVendingMachine.getSoftDrinkQty());
    }

    @Test
    public void shouldAddSaltySnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 5, 5);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.addProduct(saltySnack);
        overloadedVendingMachine.addProduct(saltySnack);
        assertEquals(7, overloadedVendingMachine.getSaltySnackQty());
    }

    @Test
    public void shouldAddChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 5, 5);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.addProduct(chocolate);
        overloadedVendingMachine.addProduct(chocolate);
        overloadedVendingMachine.addProduct(chocolate);
        assertEquals(8, overloadedVendingMachine.getChocolatesQty());
    }

    @Test
    public void shouldAddProduct() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 5, 5);
        Product product = new Product();
        overloadedVendingMachine.addProduct(product);
        assertEquals(6, overloadedVendingMachine.getChocolatesQty());
        assertEquals(6, overloadedVendingMachine.getSaltySnackQty());
        assertEquals(6, overloadedVendingMachine.getSoftDrinkQty());
    }
}
