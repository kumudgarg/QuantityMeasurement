package quantityMeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityConverterTest {

    @Test
    public void given1FeetAnd12InchWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.FEET_TO_INCH,1.0,12.0);
        Assert.assertTrue( converter.convert());
    }

    @Test
    public void given12FeetAnd1InchWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.INCH_TO_FEET,12.0,1.0);
        Assert.assertTrue( converter.convert());
    }

    @Test
    public void given1YardsAnd3FeetWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.YARDS_TO_FEET,1.0,3.0);
        Assert.assertTrue(converter.convert());
    }

    @Test
    public void given1FeetAndZeroPoint33YardsWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.FEET_TO_YARDS,1.0,0.33);
        Assert.assertTrue(converter.convert());
    }

    @Test
    public void given1YardsAnd36InchesWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.YARDS_TO_INCHES,1.0,36.0);
        Assert.assertTrue( converter.convert());
    }

    @Test
    public void given1InchAndZeroPoint027YardsWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.INCHES_TO_YARD,1.0,0.27);
        Assert.assertTrue( converter.convert());
    }
}
