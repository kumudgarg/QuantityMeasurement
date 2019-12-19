package quantityMeasurment;

public class AddQuantity {
    public double AddQuantities(QuantityMeasurement comparator1, QuantityMeasurement comparator2) {
        if (comparator1.operations.unit.equals(comparator2.operations.unit) && comparator1.operations.unit != QuantityType.TEMPERATURE) {
            double addition = (comparator1.value * comparator1.operations.baseUnit) + (comparator2.value * comparator2.operations.baseUnit);
            return addition;
        }
        return 0;
    }
}
