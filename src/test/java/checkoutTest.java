import UnitTetsting.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class checkoutTest {

    @Test
    public void subtotalIsValid () {
        Assertions.assertEquals(19.2, Main.getSubtotal());
    }

    @Test
    public void taxIsValid () {
        Assertions.assertEquals(3.9, Main.getTax(30));
    }

    @Test
    public void totalIsValid () {
        Assertions.assertEquals(113,Main.getTotal(100, 13));
    }
}
