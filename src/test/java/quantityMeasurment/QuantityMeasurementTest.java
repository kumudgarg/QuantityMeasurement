package quantityMeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given1FeetAnd12InchWithEnum_ShouldReturnEqualLength() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        QuantityMeasurement toInch = new QuantityMeasurement(MeasurementOperations.INCH, 12);
        Assert.assertTrue(fromFeet.compareTo(fromFeet, toInch));
    }

    @Test
    public void givenZeroPoint08FeetAnd1InchWithEnum_ShouldReturnEqualLength() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.FEET, 0.08);
        QuantityMeasurement toInch = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        Assert.assertTrue(fromFeet.compareTo(fromFeet, toInch));
    }

    @Test
    public void given1YardsAnd3FeetWithEnum_ShouldReturnEqualLength() {
        QuantityMeasurement fromYards = new QuantityMeasurement(MeasurementOperations.YARDS, 1.0);
        QuantityMeasurement toFeet = new QuantityMeasurement(MeasurementOperations.FEET, 3.0);
        Assert.assertTrue(fromYards.compareTo(fromYards, toFeet));
    }

    @Test
    public void given1FeetAndZeroPoint33YardsWithEnum_ShouldReturnEqualLength() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        QuantityMeasurement toYards = new QuantityMeasurement(MeasurementOperations.YARDS, 0.33);
        Assert.assertTrue(fromFeet.compareTo(fromFeet, toYards));
    }

    @Test
    public void given1YardsAnd36InchesWithEnum_ShouldReturnEqualLength() {
        QuantityMeasurement fromYards = new QuantityMeasurement(MeasurementOperations.YARDS, 1.0);
        QuantityMeasurement toInch = new QuantityMeasurement(MeasurementOperations.INCH, 36);
        Assert.assertTrue(fromYards.compareTo(fromYards, toInch));
    }

    @Test
    public void given1InchAndZeroPoint027YardsWithEnum_ShouldReturnEqualLength() {
        QuantityMeasurement FromFeet = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        QuantityMeasurement toInch = new QuantityMeasurement(MeasurementOperations.YARDS, 0.027);
        Assert.assertTrue(FromFeet.compareTo(FromFeet, toInch));
    }


    @Test
    public void givenNullQuantityComparator_ShouldReturnBooleanEquality() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        QuantityMeasurement toInch = null;
        Assert.assertFalse(fromFeet.equals(toInch));
    }


    @Test
    public void givenQuantityComparatorClassType_ShouldReturnBooleanEquality() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        Integer num = 5;
        Assert.assertFalse(fromFeet.getClass().equals(num.getClass()));
    }

    @Test
    public void givenQuantityComparatorObjectType_ShouldReturnBooleanEquality() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        QuantityMeasurement comparator = fromFeet;
        Assert.assertTrue(fromFeet.equals(comparator));
    }

    @Test
    public void givenQuantityComparatorValueType_ShouldReturnBooleanEquality() {
        QuantityMeasurement fromInch = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        QuantityMeasurement toInch = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        Assert.assertTrue(fromInch.equals(toInch));
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNonEquality() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        QuantityMeasurement toInch = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        Assert.assertFalse(fromFeet.equals(toInch));
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNonEquality() {
        QuantityMeasurement fromInch = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        QuantityMeasurement toFeet = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        Assert.assertFalse(fromInch.equals(toFeet));
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNonEquality() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        QuantityMeasurement toYards = new QuantityMeasurement(MeasurementOperations.YARDS, 1.0);
        Assert.assertFalse(fromFeet.equals(toYards));
    }

    @Test
    public void given1InchAnd1Yards_ShouldReturnNonEquality() {
        QuantityMeasurement fromInch = new QuantityMeasurement(MeasurementOperations.INCH, 1.0);
        QuantityMeasurement toYards = new QuantityMeasurement(MeasurementOperations.YARDS, 1.0);
        Assert.assertFalse(fromInch.equals(toYards));
    }


    @Test
    public void given2InchAndCM_ShouldReturnEqualLength() {
        QuantityMeasurement fromInch = new QuantityMeasurement(MeasurementOperations.INCH, 2.0);
        QuantityMeasurement toCentiMeter = new QuantityMeasurement(MeasurementOperations.CM, 5.0);
        Assert.assertTrue(fromInch.compareTo(fromInch, toCentiMeter));
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturnEqualSum() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.INCH, 2.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.INCH, 2.0);
        Assert.assertEquals(4, firstValue.addQuantities(firstValue, secondValue), 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnEqualSum() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.INCH, 2.0);
        Assert.assertEquals(14, firstValue.addQuantities(firstValue, secondValue), 0.0);
    }


    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualSum() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        Assert.assertEquals(24, firstValue.addQuantities(firstValue, secondValue), 0.0);
    }


    @Test
    public void given2InchAnd2Point5CM_ShouldReturnEqualSum() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.INCH, 2.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.CM, 2.5);
        Assert.assertEquals(3, firstValue.addQuantities(firstValue, secondValue), 0.0);
    }

    @Test
    public void given1GallonsAnd3Point78Litres_ShouldReturnBooleanEquality() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.GALLON, 1.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.Litre, 3.78);
        Assert.assertTrue(firstValue.compareTo(firstValue, secondValue));
    }


    @Test
    public void given1LitresAnd1000ML_ShouldReturnBooleanEquality() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.Litre, 1.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.ML, 1000);
        Assert.assertTrue(firstValue.compareTo(firstValue, secondValue));
    }

    @Test
    public void given1GallonAnd3Point78Litres_ShouldReturnEqualSum() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.GALLON, 1.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.Litre, 3.78);
        Assert.assertEquals(7.56, firstValue.addQuantities(firstValue, secondValue), 0.0);
    }

    @Test
    public void given1LitresAnd1000ML_ShouldReturnEqualSum() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.Litre, 1.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.ML, 1000);
        Assert.assertEquals(2, firstValue.addQuantities(firstValue, secondValue), 0.0);
    }


    @Test
    public void given1KgAnd1000Gms_ShouldReturnEqualWeight() {
        QuantityMeasurement fromKg = new QuantityMeasurement(MeasurementOperations.KG, 1.0);
        QuantityMeasurement toGrams = new QuantityMeasurement(MeasurementOperations.GRAMS, 1000);
        Assert.assertTrue(fromKg.compareTo(fromKg, toGrams));
    }

    @Test
    public void given1TonneAnd1000KGms_ShouldReturnEqualWeight() {
        QuantityMeasurement fromTonns = new QuantityMeasurement(MeasurementOperations.TONNE, 1.0);
        QuantityMeasurement toKGrams = new QuantityMeasurement(MeasurementOperations.KG, 1000);
        Assert.assertTrue(fromTonns.compareTo(fromTonns, toKGrams));
    }

    @Test
    public void given1TonneAnd1000Gms_ShouldReturnEqualSum() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.TONNE, 1.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.GRAMS, 1000);
        Assert.assertEquals(1001, firstValue.addQuantities(firstValue, secondValue), 0.0);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_ShouldReturnEqualTemperature() {

        try {
            QuantityMeasurement fromFh = new QuantityMeasurement(MeasurementOperations.FAHRENHEIT, 212.0);
            QuantityMeasurement toCelsius = new QuantityMeasurement(MeasurementOperations.CELSIUS, 100);
            Assert.assertTrue(fromFh.temperatureComparision(fromFh, toCelsius));
        } catch (QuantityMeasurmentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1CelsiusAnd33Point8Fahrenheit_ShouldReturnEqualTemperature() {
        try {
            QuantityMeasurement fromCelsius = new QuantityMeasurement(MeasurementOperations.CELSIUS, 1.0);
            QuantityMeasurement toFh = new QuantityMeasurement(MeasurementOperations.FAHRENHEIT, 33.8);
            Assert.assertTrue(fromCelsius.temperatureComparision(fromCelsius, toFh));
        } catch (QuantityMeasurmentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenZeroPoint08FeetAnd1KgWithEnum_ShouldReturnBooleanEquality() {
        QuantityMeasurement fromFeet = new QuantityMeasurement(MeasurementOperations.FEET, 0.08);
        QuantityMeasurement toKg = new QuantityMeasurement(MeasurementOperations.KG, 1.0);
        Assert.assertFalse(fromFeet.compareTo(fromFeet, toKg));
    }

    @Test
    public void given1FeetAnd1Litres_ShouldReturnZero() {
        QuantityMeasurement firstValue = new QuantityMeasurement(MeasurementOperations.FEET, 1.0);
        QuantityMeasurement secondValue = new QuantityMeasurement(MeasurementOperations.Litre, 1.0);
        Assert.assertEquals(0, firstValue.addQuantities(firstValue, secondValue), 0.0);
    }

    @Test
    public void given1CelsiusAnd1Feet_ShouldThrowException() {
        try {
            QuantityMeasurement fromCelsius = new QuantityMeasurement(MeasurementOperations.CELSIUS, 1.0);
            QuantityMeasurement toFh = new QuantityMeasurement(MeasurementOperations.FEET, 33.8);
            fromCelsius.temperatureComparision(fromCelsius,toFh);

        } catch (QuantityMeasurmentException e) {
            Assert.assertEquals(QuantityMeasurmentException.ExceptionType.QUANTITY_UN_EQUALITY,e.type);
        }
    }

}
