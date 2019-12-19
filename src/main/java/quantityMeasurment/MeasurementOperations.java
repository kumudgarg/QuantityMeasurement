package quantityMeasurment;

public enum MeasurementOperations {


    INCH(QuantityType.LENGTH, 1.0), FEET(QuantityType.LENGTH, 12.0),
    YARDS(QuantityType.LENGTH, 36.0), CM(QuantityType.LENGTH, 0.4),
    Litre(QuantityType.VOLUMES, 1), ML(QuantityType.VOLUMES, 0.001),
    GALLON(QuantityType.VOLUMES, 3.78), KG(QuantityType.WEIGHT, 1),
    GRAMS(QuantityType.WEIGHT, 0.001), TONNE(QuantityType.WEIGHT, 1000),
    CELSIUS(QuantityType.TEMPERATURE, 1), FAHRENHEIT(QuantityType.TEMPERATURE, 0.029);

    public final double baseUnit;
    QuantityType unit;

    MeasurementOperations(QuantityType unit, double baseUnit) {
        this.unit = unit;
        this.baseUnit = baseUnit;
    }
}
