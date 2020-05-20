package tests;

import org.junit.Test;
import vendingmachine.ExtendableVendingMachine;
import vendingmachine.OverloadedVendingMachine;
import vendingmachine.products.*;

import static junit.framework.TestCase.assertEquals;

public class ExtendableVendingMachineBuyTests {
    @Test
    public void should_Be_Able_To_Buy_SoftDrink() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3, 3);
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.buy(softDrink);
        assertEquals(2, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void should_Be_Able_To_Buy_SaltSnack() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3,3 );
        SaltySnack saltySnack = new SaltySnack();
        extendableVendingMachine.buy(saltySnack);
        extendableVendingMachine.buy(saltySnack);
        assertEquals(1, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void should_Be_Able_To_Buy_Chocolate() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3,3 );
        Chocolate chocolate = new Chocolate();
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(chocolate);
        assertEquals(0, extendableVendingMachine.getStock(chocolate));
    }

    @Test
    public void should_Be_Able_To_Buy_Bubblegum() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3, 5);
        Bubblegum bubblegum = new Bubblegum();
        extendableVendingMachine.buy(bubblegum);
        extendableVendingMachine.buy(bubblegum);
        extendableVendingMachine.buy(bubblegum);
        assertEquals(2, extendableVendingMachine.getStock(bubblegum));
    }

    @Test
    public void should_Be_Able_To_Buy_SoftDrink_Specifying_Amount() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3, 3);
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.buy(softDrink, 1);
        assertEquals(2, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void should_Be_Able_To_Buy_SaltSnack_Specifying_Amount() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3, 3);
        SaltySnack saltySnack = new SaltySnack();
        extendableVendingMachine.buy(saltySnack, 2);
        assertEquals(1, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void should_Be_Able_To_Buy_Chocolate_Specifying_Amount() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3, 3);
        Chocolate chocolate = new Chocolate();
        extendableVendingMachine.buy(chocolate, 3);
        assertEquals(0, extendableVendingMachine.getStock(chocolate));
    }

    @Test
    public void should_Be_Able_To_Buy_Bubblegum_Specifying_Amount() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3, 3, 3, 3);
        Bubblegum bubblegum = new Bubblegum();
        extendableVendingMachine.buy(bubblegum, 3);
        assertEquals(0, extendableVendingMachine.getStock(bubblegum));
    }
}
