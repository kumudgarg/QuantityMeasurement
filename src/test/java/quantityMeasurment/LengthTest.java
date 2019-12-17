package quantityMeasurment;

import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEquals() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1Feetand2Feet_ShouldReturnNotEquals() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.1);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given1Feetand2FeetAsNull_ShouldReturnNotEquals() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        boolean type = feet1.equals(feet2);
        Assert.assertEquals(false, type);
    }

    @Test
    public void given0InchAnd0Inch_ShouldreturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldreturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch2);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldreturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given1FeetAnd1Inch_ShouldreturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldreturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given1InchAnd2Feet_ShouldreturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 2.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldreturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12FeetAnd1Inch_ShouldreturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.083);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAndNullInch_ShouldreturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.NULL ,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardsAnd3Feet_ShouldReturnEqualLength() {
        Length yards = new Length(Length.Unit.YARDS, 1.0);
        Length feet = new Length(Length.Unit.FEET ,3.0);
        boolean compareCheck = yards.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAndEquivalentYardsValue_ShouldReturnEqualLength() {
        Length feet = new Length(Length.Unit.FEET ,1.0);
        Length yards = new Length(Length.Unit.YARDS, 0.333);
        boolean compareCheck = feet.compare(yards);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardsAnd36Inch_ShouldReturnEqualLength() {
        Length yards = new Length(Length.Unit.YARDS, 1.0);
        Length feet = new Length(Length.Unit.INCH ,36.0);
        boolean compareCheck = yards.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAndEquivalentYardsValue_ShouldReturnEqualLength() {
        Length feet = new Length(Length.Unit.INCH ,1.0);
        Length yards = new Length(Length.Unit.YARDS, 0.0277);
        boolean compareCheck = feet.compare(yards);
        Assert.assertTrue(compareCheck);
    }


}
