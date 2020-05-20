package tests;

        import org.junit.Test;
        import vendingmachine.ExtendableVendingMachine;
        import vendingmachine.products.Chocolate;
        import vendingmachine.products.Product;
        import vendingmachine.products.SaltySnack;
        import vendingmachine.products.SoftDrink;

        import static junit.framework.TestCase.assertEquals;

public class ExtendableVendingMachineAddStockTests {
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
}
