package quantityMeasurment;

import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void given1FeetAnd12InchWithEnum_ShouldreturnEqualLength() {
        Length obj = new Length(Units.FEET_TO_INCH);
        Assert.assertTrue( obj.unit.LengthConversion(1.0,12.0));
    }

    @Test
    public void given12FeetAnd1InchWithEnum_ShouldreturnEqualLength() {
        Length obj = new Length(Units.INCH_TO_FEET);
        Assert.assertTrue( obj.unit.LengthConversion(12.0,1.0));
    }

    @Test
    public void given1YardsAnd3FeetWithEnum_ShouldreturnEqualLength() {
        Length obj = new Length(Units.YARDS_TO_FEET);
        Assert.assertTrue( obj.unit.LengthConversion(1.0,3.0));
    }

    @Test
    public void given1FeetAndZeroPoint33YardsWithEnum_ShouldreturnEqualLength() {
        Length obj = new Length(Units.FEET_TO_YARDS);
        Assert.assertTrue( obj.unit.LengthConversion(1.0,0.33));
    }

    @Test
    public void given1YardsAnd36InchesWithEnum_ShouldreturnEqualLength() {
        Length obj = new Length(Units.YARDS_TO_INCHES);
        Assert.assertTrue( obj.unit.LengthConversion(1.0,36.0));
    }

    @Test
    public void given1InchAndZeroPoint027YardsWithEnum_ShouldreturnEqualLength() {
        Length obj = new Length(Units.INCHES_TO_YARD);
        Assert.assertTrue( obj.unit.LengthConversion(1.0,0.027));
    }

}
