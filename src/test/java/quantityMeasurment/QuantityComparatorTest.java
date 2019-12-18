package quantityMeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityComparatorTest {

    @Test
    public void given1FeetAnd12InchWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromFeet = new QuantityComparator(LengthComparision.FEET, 1.0);
        QuantityComparator toInch = new QuantityComparator(LengthComparision.INCH, 12);
        Assert.assertTrue(fromFeet.compareTo(fromFeet,toInch));
    }

    @Test
    public void givenZeroPoint08FeetAnd1InchWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromFeet = new QuantityComparator(LengthComparision.FEET, 0.08);
        QuantityComparator toInch = new QuantityComparator(LengthComparision.INCH, 1.0);
        Assert.assertTrue(fromFeet.compareTo(fromFeet, toInch));
    }

    @Test
    public void given1YardsAnd3FeetWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromYards = new QuantityComparator(LengthComparision.YARDS, 1.0);
        QuantityComparator toFeet = new QuantityComparator(LengthComparision.FEET, 3.0);
        Assert.assertTrue(fromYards.compareTo(fromYards, toFeet));
    }

    @Test
    public void given1FeetAndZeroPoint33YardsWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromFeet = new QuantityComparator(LengthComparision.FEET, 1.0);
        QuantityComparator toYards = new QuantityComparator(LengthComparision.YARDS, 0.33);
        Assert.assertTrue(fromFeet.compareTo(fromFeet, toYards));
    }

    @Test
    public void given1YardsAnd36InchesWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromYards = new QuantityComparator(LengthComparision.YARDS, 1.0);
        QuantityComparator toInch = new QuantityComparator(LengthComparision.INCH, 36);
        Assert.assertTrue(fromYards.compareTo(fromYards, toInch));
    }

    @Test
    public void given1InchAndZeroPoint027YardsWithEnum_ShouldReturnEqualLength() {
        QuantityComparator FromFeet = new QuantityComparator(LengthComparision.INCH, 1.0);
        QuantityComparator toInch = new QuantityComparator(LengthComparision.YARDS, 0.027);
        Assert.assertTrue(FromFeet.compareTo(FromFeet, toInch));
    }


    @Test
    public void givenNullQuantityComparator_ShouldReturnBooleanEquality() {
        QuantityComparator fromFeet = new QuantityComparator(LengthComparision.INCH, 1.0);
        QuantityComparator toInch = null;
        Assert.assertFalse(fromFeet.equals(toInch));
    }


    @Test
    public void givenQuantityComparatorClassType_ShouldReturnBooleanEquality() {
        QuantityComparator fromFeet = new QuantityComparator(LengthComparision.INCH, 1.0);
        Integer num = 5;
        Assert.assertFalse(fromFeet.getClass().equals(num.getClass()));
    }

    @Test
    public void givenQuantityComparatorObjectType_ShouldReturnBooleanEquality() {
        QuantityComparator fromFeet = new QuantityComparator(LengthComparision.INCH, 1.0);
        QuantityComparator comparator = fromFeet;
        Assert.assertTrue(fromFeet.equals(comparator));
    }

    @Test
    public void givenQuantityComparatorValueType_ShouldReturnBooleanEquality() {
        QuantityComparator fromInch = new QuantityComparator(LengthComparision.INCH, 1.0);
        QuantityComparator toInch = new QuantityComparator(LengthComparision.INCH, 1.0);
        Assert.assertTrue(fromInch.equals(toInch));
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNonEquality() {
        QuantityComparator fromFeet = new QuantityComparator(LengthComparision.FEET, 1.0);
        QuantityComparator toInch = new QuantityComparator(LengthComparision.INCH, 1.0);
        Assert.assertFalse(fromFeet.equals(toInch));
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNonEquality() {
        QuantityComparator fromInch = new QuantityComparator(LengthComparision.INCH, 1.0);
        QuantityComparator toFeet = new QuantityComparator(LengthComparision.FEET, 1.0);
        Assert.assertFalse(fromInch.equals(toFeet));
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNonEquality() {
        QuantityComparator fromFeet = new QuantityComparator(LengthComparision.FEET, 1.0);
        QuantityComparator toYards = new QuantityComparator(LengthComparision.YARDS, 1.0);
        Assert.assertFalse(fromFeet.equals(toYards));
    }

    @Test
    public void given1InchAnd1Yards_ShouldReturnNonEquality() {
        QuantityComparator fromInch = new QuantityComparator(LengthComparision.INCH, 1.0);
        QuantityComparator toYards = new QuantityComparator(LengthComparision.YARDS, 1.0);
        Assert.assertFalse(fromInch.equals(toYards));
    }


    @Test
    public void given2InchAndCM_ShouldReturnEqualLength() {
        QuantityComparator fromInch = new QuantityComparator(LengthComparision.INCH, 2.0);
        QuantityComparator toCentiMeter = new QuantityComparator(LengthComparision.CM, 5.0);
        Assert.assertTrue(fromInch.compareTo(fromInch,toCentiMeter));
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(LengthComparision.INCH, 2.0);
        QuantityComparator secondValue = new QuantityComparator(LengthComparision.INCH, 2.0);
        Assert.assertEquals(4,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(LengthComparision.FEET, 1.0);
        QuantityComparator secondValue = new QuantityComparator(LengthComparision.INCH, 2.0);
        Assert.assertEquals(14,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }


    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(LengthComparision.FEET, 1.0);
        QuantityComparator secondValue = new QuantityComparator(LengthComparision.FEET, 1.0);
        Assert.assertEquals(24,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }


    @Test
    public void given2InchAnd2Point5CM_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(LengthComparision.INCH, 2.0);
        QuantityComparator secondValue = new QuantityComparator(LengthComparision.CM, 2.5);
        Assert.assertEquals(3,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }

}
