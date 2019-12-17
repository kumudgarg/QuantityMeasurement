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

    @Test
    public void given1Feetand2FeetAsNull_ShouldReturnNotEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        boolean type = feet1.equals(feet2);
        Assert.assertEquals(false,type);
    }

    @Test
    public void given0InchAnd0Inch_ShouldreturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldreturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
}
