package quantityMeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1Feetand2Feet_ShouldReturnNotEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.1);
        Assert.assertNotEquals(feet1, feet2);
    }


}
