package quantityMeasurment;

public class Compare {
    public  boolean compareTo(QuantityMeasurement comparator1, QuantityMeasurement comparator2) {
        if (comparator1.operations.unit.equals(comparator2.operations.unit))
            return (Double.compare(Math.round(comparator1.value * comparator1.operations.baseUnit), Math.round(comparator2.value * comparator2.operations.baseUnit)) == 0);
        return false;
    }

    public boolean temperatureComparision(QuantityMeasurement comparator1, QuantityMeasurement comparator2) throws QuantityMeasurmentException {
        if(comparator1.operations.equals(MeasurementOperations.FAHRENHEIT) && comparator2.operations.unit.equals(QuantityType.TEMPERATURE))
            return (Double.compare(((comparator1.value-32)*5/9),comparator2.value*comparator2.operations.baseUnit) == 0 );
        else if(comparator1.operations.equals(MeasurementOperations.CELSIUS) && comparator2.operations.unit.equals(QuantityType.TEMPERATURE))
            return (Double.compare(((comparator1.value*9/5)+32),comparator2.value) == 0 );
        throw new QuantityMeasurmentException("Unable to compare different Quantity",QuantityMeasurmentException.ExceptionType.QUANTITY_UN_EQUALITY);
    }
}
