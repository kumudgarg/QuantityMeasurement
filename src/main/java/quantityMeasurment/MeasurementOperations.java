package quantityMeasurment;

public enum MeasurementOperations {


    INCH(QuantityType.LENGTH, 1.0), FEET(QuantityType.LENGTH, 12.0),
    YARDS(QuantityType.LENGTH, 36.0), CM(QuantityType.LENGTH, 0.4),
    Litre(QuantityType.VOLUMES, 1), ML(QuantityType.VOLUMES, 0.001),
    GALLON(QuantityType.VOLUMES, 3.78), KG(QuantityType.WEIGHT, 1),
    GRAMS(QuantityType.WEIGHT, 0.001), TONNE(QuantityType.WEIGHT, 1000),
    CELSIUS(QuantityType.TEMPERATURE, 1), FAHRENHEIT(QuantityType.TEMPERATURE, 0.471);


    public final double unitType;
    QuantityType type;

    MeasurementOperations(QuantityType type, double unitType) {
        this.type = type;
        this.unitType = unitType;
    }


    public boolean compareTo(QuantityMeasurement comparator1, QuantityMeasurement comparator2) {
        if (comparator1.compare.type.equals(comparator2.compare.type))
            return (Double.compare(Math.round(comparator1.value * comparator1.compare.unitType), Math.round(comparator2.value * comparator2.compare.unitType)) == 0);
        return false;
    }

    public double AddQuantities(QuantityMeasurement comparator1, QuantityMeasurement comparator2) {
        if (comparator1.compare.type.equals(comparator2.compare.type)) {
            double addition = (comparator1.value * comparator1.compare.unitType) + (comparator2.value * comparator2.compare.unitType);
            return addition;
        }
        return 0;
    }
}
