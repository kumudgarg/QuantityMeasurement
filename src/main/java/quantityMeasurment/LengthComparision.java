package quantityMeasurment;

public enum LengthComparision {

    INCH(1.0), FEET(12.0), YARDS(36.0);


    private final double baseUnit;

    LengthComparision(double baseUnit)
    {
        this.baseUnit = baseUnit;
    }

    public boolean compareTo(QuantityComparator comparator1, QuantityComparator comparator2)
    {
       return (Double.compare(comparator1.value*comparator1.lengthConverter.baseUnit,comparator1.value*comparator1.lengthConverter.baseUnit) == 0);
    }
}
