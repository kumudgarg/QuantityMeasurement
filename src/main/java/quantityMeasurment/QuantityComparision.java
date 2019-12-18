package quantityMeasurment;

public enum QuantityComparision {


    INCH(QuantityType.LENGTH, 1.0), FEET(QuantityType.LENGTH, 12.0),

    YARDS(QuantityType.LENGTH, 36.0), CM(QuantityType.LENGTH, 0.4);


    public final double lengthUnit;
    QuantityType type;

    QuantityComparision(QuantityType type, double lengthUnit) {
        this.type = type;
        this.lengthUnit = lengthUnit;
    }


    public boolean compareTo(QuantityComparator comparator1, QuantityComparator comparator2) {
        if (comparator1.lengthConverter.type.equals(comparator2.lengthConverter.type))
            return (Double.compare(Math.round(comparator1.value * comparator1.lengthConverter.lengthUnit), Math.round(comparator2.value * comparator2.lengthConverter.lengthUnit)) == 0);
        return false;
    }

    public double AddQuantities(QuantityComparator comparator1, QuantityComparator comparator2) {
        if (comparator1.lengthConverter.type.equals(comparator2.lengthConverter.type)) {
            double addition = (comparator1.value * comparator1.lengthConverter.lengthUnit) + (comparator2.value * comparator2.lengthConverter.lengthUnit);
            return addition;
        }
        return 0;
    }
}
