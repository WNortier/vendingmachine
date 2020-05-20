package tests;

import org.junit.Test;
import vendingmachine.ExtendableVendingMachine;
import vendingmachine.OverloadedVendingMachine;
import vendingmachine.products.Chocolate;
import vendingmachine.products.Product;
import vendingmachine.products.SaltySnack;
import vendingmachine.products.SoftDrink;

import static junit.framework.TestCase.assertEquals;

public class ExtendableVendingMachineBuyTests {
    @Test
    public void should_Be_Able_To_Buy_SoftDrink_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.buy(softDrink);
        assertEquals(2, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void should_Be_Able_To_Buy_SaltSnack_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        SaltySnack saltySnack = new SaltySnack();
        extendableVendingMachine.buy(saltySnack);
        extendableVendingMachine.buy(saltySnack);
        assertEquals(1, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void should_Be_Able_To_Buy_Chocolate_To_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        Chocolate chocolate = new Chocolate();
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(chocolate);
        assertEquals(0, extendableVendingMachine.getStock(chocolate));
    }

    @Test
    public void should_Be_Able_To_Buy_SoftDrink_Specifying_Amount_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.buy(softDrink, 1);
        assertEquals(2, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void should_Be_Able_To_Buy_SaltSnack_Specifying_Amount_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        SaltySnack saltySnack = new SaltySnack();
        extendableVendingMachine.buy(saltySnack, 2);
        assertEquals(1, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void should_Be_Able_To_Buy_Chocolate_Specifying_Amount_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        Chocolate chocolate = new Chocolate();
        extendableVendingMachine.buy(chocolate, 3);
        assertEquals(0, extendableVendingMachine.getStock(chocolate));
    }

    @Test
    public void should_Be_Able_To_Add_SoftDrink_To_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.addProduct(softDrink);
        assertEquals(4, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void should_Be_Able_To_Add_SaltSnack_To_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        SaltySnack saltySnack = new SaltySnack();
        extendableVendingMachine.addProduct(saltySnack);
        extendableVendingMachine.addProduct(saltySnack);
        assertEquals(5, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void should_Be_Able_To_Buy_Chocolate_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        Chocolate chocolate = new Chocolate();
        extendableVendingMachine.addProduct(chocolate);
        extendableVendingMachine.addProduct(chocolate);
        extendableVendingMachine.addProduct(chocolate);
        assertEquals(6, extendableVendingMachine.getStock(chocolate));
    }

    @Test
    public void should_Return_Stock_Level_For_SoftDrink() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(15, 3, 3);
        SoftDrink softDrink = new SoftDrink();
        assertEquals(15, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void should_Return_Stock_Level_For_SaltySnack() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 12, 3);
        SaltySnack saltySnack = new SaltySnack();
        assertEquals(12, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void should_Return_Stock_Level_For_Chocolate() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 7);
        Chocolate chocolate = new Chocolate();
        assertEquals(7, extendableVendingMachine.getStock(chocolate));
    }

    @Test
    public void should_Return_Stock_Level_For_All_Products_Combined() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(5, 8, 12);
        Chocolate chocolate = new Chocolate();
        assertEquals(25, extendableVendingMachine.getStock(new Product()));
    }
}
