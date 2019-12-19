package quantityMeasurment;

public class QuantityMeasurement {


    public double value;
    public MeasurementOperations operations;
    private Compare compare;
    private AddQuantity addition;

    public QuantityMeasurement(MeasurementOperations measurementOperations, double value) {
        this.operations = measurementOperations;
        this.value = value;
        compare = new Compare();
        addition = new AddQuantity();
    }

    public  boolean compareTo(QuantityMeasurement comparator1, QuantityMeasurement comparator2)
    {
        return compare.compareTo(comparator1,comparator2);
    }


    public double addQuantities(QuantityMeasurement comparator1, QuantityMeasurement comparator2)
    {
        return addition.AddQuantities(comparator1,comparator2);
    }

    public boolean temperatureComparision(QuantityMeasurement comparator1, QuantityMeasurement comparator2) throws QuantityMeasurmentException {
        return compare.temperatureComparision(comparator1,comparator2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                operations == that.operations;
    }
}
