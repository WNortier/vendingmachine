package tests;
import org.junit.Test;
import vendingmachine.ExtendableVendingMachine;
import vendingmachine.OverloadedVendingMachine;
import vendingmachine.products.Chocolate;
import vendingmachine.products.Product;
import vendingmachine.products.SaltySnack;
import vendingmachine.products.SoftDrink;

import static junit.framework.TestCase.assertEquals;

public class ExtendableVendingMachineTest {
    @Test
    public void should_Be_Able_To_Buy_SoftDrink_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.buy(softDrink);
        assertEquals(2, extendableVendingMachine.getSoftDrinkQty());
    }

    @Test
    public void should_Be_Able_To_Buy_SaltSnack_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        SaltySnack saltySnack = new SaltySnack();
        extendableVendingMachine.buy(saltySnack);
        extendableVendingMachine.buy(saltySnack);
        assertEquals(1, extendableVendingMachine.getSaltySnackQty());
    }

    @Test
    public void should_Be_Able_To_Buy_Chocolate_From_Extendable_Vending_Machine() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3);
        Chocolate chocolate = new Chocolate();
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(chocolate);
        assertEquals(0, extendableVendingMachine.getChocolateQty());
    }
}
