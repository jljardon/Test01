import com.pillar.VendingMachine;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VendingMachineTest {

    @Test
    public void theVendingMachineIsInitialized(){
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("INSERT COINS", vendingMachine.initializeVendingMachine());
    }

}
