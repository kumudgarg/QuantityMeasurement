package quantityMeasurment;

public enum LengthComparision {

    INCH(1.0), FEET(12.0), YARDS(36.0), CM(0.4);


    private final double baseUnit;

    LengthComparision(double baseUnit)
    {
        this.baseUnit = baseUnit;
    }

    public boolean compareTo(QuantityComparator comparator1, QuantityComparator comparator2)
    {
       return (Double.compare(Math.round(comparator1.value*comparator1.lengthConverter.baseUnit),Math.round(comparator2.value*comparator2.lengthConverter.baseUnit)) == 0);
    }

    public double AddQuantities(QuantityComparator comparator1, QuantityComparator comparator2)
    {
        double addition =  (comparator1.value*comparator1.lengthConverter.baseUnit)+(comparator2.value*comparator2.lengthConverter.baseUnit);
        return addition;
    }
}
