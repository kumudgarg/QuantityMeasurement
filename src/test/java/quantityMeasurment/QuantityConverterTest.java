package quantityMeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityConverterTest {

    @Test
    public void given1FeetAnd12InchWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.FEET_TO_INCH);
        Assert.assertTrue( converter.lengthConverter.convert(1.0,12.0));
    }

    @Test
    public void given12FeetAnd1InchWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.INCH_TO_FEET);
        Assert.assertTrue( converter.lengthConverter.convert(12.0,1.0));
    }

    @Test
    public void given1YardsAnd3FeetWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.YARDS_TO_FEET);
        Assert.assertTrue( converter.lengthConverter.convert(1.0,3.0));
    }

    @Test
    public void given1FeetAndZeroPoint33YardsWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.FEET_TO_YARDS);
        Assert.assertTrue( converter.lengthConverter.convert(1.0,0.33));
    }

    @Test
    public void given1YardsAnd36InchesWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.YARDS_TO_INCHES);
        Assert.assertTrue( converter.lengthConverter.convert(1.0,36.0));
    }

    @Test
    public void given1InchAndZeroPoint027YardsWithEnum_ShouldreturnEqualLength() {
        QuantityConverter converter = new QuantityConverter(LengthConversion.INCHES_TO_YARD);
        Assert.assertTrue( converter.lengthConverter.convert(1.0,0.027));
    }
}
