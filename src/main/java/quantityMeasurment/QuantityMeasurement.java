package quantityMeasurment;

public class QuantityMeasurement {


    public double value;
    public MeasurementOperations compare;

    public QuantityMeasurement(MeasurementOperations measurementOperations, double value) {
        this.compare = measurementOperations;
        this.value = value;
    }


    public boolean compareTo(QuantityMeasurement converter1, QuantityMeasurement converter2) {
        return compare.compareTo(converter1, converter2);
    }

    public double AddQuantities(QuantityMeasurement comparator1, QuantityMeasurement comparator2) {
        return compare.AddQuantities(comparator1, comparator2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                compare == that.compare;
    }
}
