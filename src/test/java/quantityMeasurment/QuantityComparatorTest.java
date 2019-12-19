package quantityMeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityComparatorTest {

    @Test
    public void given1FeetAnd12InchWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromFeet = new QuantityComparator(QuantityComparision.FEET, 1.0);
        QuantityComparator toInch = new QuantityComparator(QuantityComparision.INCH, 12);
        Assert.assertTrue(fromFeet.compareTo(fromFeet,toInch));
    }

    @Test
    public void givenZeroPoint08FeetAnd1InchWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromFeet = new QuantityComparator(QuantityComparision.FEET, 0.08);
        QuantityComparator toInch = new QuantityComparator(QuantityComparision.INCH, 1.0);
        Assert.assertTrue(fromFeet.compareTo(fromFeet, toInch));
    }

    @Test
    public void given1YardsAnd3FeetWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromYards = new QuantityComparator(QuantityComparision.YARDS, 1.0);
        QuantityComparator toFeet = new QuantityComparator(QuantityComparision.FEET, 3.0);
        Assert.assertTrue(fromYards.compareTo(fromYards, toFeet));
    }

    @Test
    public void given1FeetAndZeroPoint33YardsWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromFeet = new QuantityComparator(QuantityComparision.FEET, 1.0);
        QuantityComparator toYards = new QuantityComparator(QuantityComparision.YARDS, 0.33);
        Assert.assertTrue(fromFeet.compareTo(fromFeet, toYards));
    }

    @Test
    public void given1YardsAnd36InchesWithEnum_ShouldReturnEqualLength() {
        QuantityComparator fromYards = new QuantityComparator(QuantityComparision.YARDS, 1.0);
        QuantityComparator toInch = new QuantityComparator(QuantityComparision.INCH, 36);
        Assert.assertTrue(fromYards.compareTo(fromYards, toInch));
    }

    @Test
    public void given1InchAndZeroPoint027YardsWithEnum_ShouldReturnEqualLength() {
        QuantityComparator FromFeet = new QuantityComparator(QuantityComparision.INCH, 1.0);
        QuantityComparator toInch = new QuantityComparator(QuantityComparision.YARDS, 0.027);
        Assert.assertTrue(FromFeet.compareTo(FromFeet, toInch));
    }


    @Test
    public void givenNullQuantityComparator_ShouldReturnBooleanEquality() {
        QuantityComparator fromFeet = new QuantityComparator(QuantityComparision.INCH, 1.0);
        QuantityComparator toInch = null;
        Assert.assertFalse(fromFeet.equals(toInch));
    }


    @Test
    public void givenQuantityComparatorClassType_ShouldReturnBooleanEquality() {
        QuantityComparator fromFeet = new QuantityComparator(QuantityComparision.INCH, 1.0);
        Integer num = 5;
        Assert.assertFalse(fromFeet.getClass().equals(num.getClass()));
    }

    @Test
    public void givenQuantityComparatorObjectType_ShouldReturnBooleanEquality() {
        QuantityComparator fromFeet = new QuantityComparator(QuantityComparision.INCH, 1.0);
        QuantityComparator comparator = fromFeet;
        Assert.assertTrue(fromFeet.equals(comparator));
    }

    @Test
    public void givenQuantityComparatorValueType_ShouldReturnBooleanEquality() {
        QuantityComparator fromInch = new QuantityComparator(QuantityComparision.INCH, 1.0);
        QuantityComparator toInch = new QuantityComparator(QuantityComparision.INCH, 1.0);
        Assert.assertTrue(fromInch.equals(toInch));
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNonEquality() {
        QuantityComparator fromFeet = new QuantityComparator(QuantityComparision.FEET, 1.0);
        QuantityComparator toInch = new QuantityComparator(QuantityComparision.INCH, 1.0);
        Assert.assertFalse(fromFeet.equals(toInch));
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNonEquality() {
        QuantityComparator fromInch = new QuantityComparator(QuantityComparision.INCH, 1.0);
        QuantityComparator toFeet = new QuantityComparator(QuantityComparision.FEET, 1.0);
        Assert.assertFalse(fromInch.equals(toFeet));
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNonEquality() {
        QuantityComparator fromFeet = new QuantityComparator(QuantityComparision.FEET, 1.0);
        QuantityComparator toYards = new QuantityComparator(QuantityComparision.YARDS, 1.0);
        Assert.assertFalse(fromFeet.equals(toYards));
    }

    @Test
    public void given1InchAnd1Yards_ShouldReturnNonEquality() {
        QuantityComparator fromInch = new QuantityComparator(QuantityComparision.INCH, 1.0);
        QuantityComparator toYards = new QuantityComparator(QuantityComparision.YARDS, 1.0);
        Assert.assertFalse(fromInch.equals(toYards));
    }


    @Test
    public void given2InchAndCM_ShouldReturnEqualLength() {
        QuantityComparator fromInch = new QuantityComparator(QuantityComparision.INCH, 2.0);
        QuantityComparator toCentiMeter = new QuantityComparator(QuantityComparision.CM, 5.0);
        Assert.assertTrue(fromInch.compareTo(fromInch,toCentiMeter));
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.INCH, 2.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.INCH, 2.0);
        Assert.assertEquals(4,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.FEET, 1.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.INCH, 2.0);
        Assert.assertEquals(14,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }


    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.FEET, 1.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.FEET, 1.0);
        Assert.assertEquals(24,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }


    @Test
    public void given2InchAnd2Point5CM_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.INCH, 2.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.CM, 2.5);
        Assert.assertEquals(3,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }

    @Test
    public void given1GallonsAnd3Point78Litres_ShouldReturnBooleanEquality() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.GALLON, 1.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.Litre, 3.78);
        Assert.assertTrue(firstValue.compareTo(firstValue,secondValue));
    }


    @Test
    public void given1LitresAnd1000ML_ShouldReturnBooleanEquality() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.Litre, 1.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.ML, 1000);
        Assert.assertTrue(firstValue.compareTo(firstValue,secondValue));
    }

    @Test
    public void given1GallonAnd3Point78Litres_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.GALLON, 1.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.Litre, 3.78);
        Assert.assertEquals(7.56,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }

    @Test
    public void given1LitresAnd1000ML_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.Litre, 1.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.ML, 1000);
        Assert.assertEquals(2,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }


    @Test
    public void given1KgAnd1000Gms_ShouldReturnEqualWeight() {
        QuantityComparator fromKg = new QuantityComparator(QuantityComparision.KG, 1.0);
        QuantityComparator toGrams = new QuantityComparator(QuantityComparision.GRAMS, 1000);
        Assert.assertTrue(fromKg.compareTo(fromKg,toGrams));
    }

    @Test
    public void given1TonneAnd1000KGms_ShouldReturnEqualWeight() {
        QuantityComparator fromTonns = new QuantityComparator(QuantityComparision.TONNE, 1.0);
        QuantityComparator toKGrams = new QuantityComparator(QuantityComparision.KG, 1000);
        Assert.assertTrue(fromTonns.compareTo(fromTonns,toKGrams));
    }

    @Test
    public void given1TonneAnd1000Gms_ShouldReturnEqualSum() {
        QuantityComparator firstValue = new QuantityComparator(QuantityComparision.TONNE, 1.0);
        QuantityComparator secondValue = new QuantityComparator(QuantityComparision.GRAMS, 1000);
        Assert.assertEquals(1001,firstValue.AddQuantities(firstValue,secondValue),0.0);
    }

}
