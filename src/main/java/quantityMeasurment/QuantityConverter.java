package quantityMeasurment;

public class QuantityConverter{


    public double value2;
    public double value1;
    public LengthConversion lengthConverter;

    public QuantityConverter(LengthConversion lengthConverter,double value1, double value2) {
        this.value2 = value2;
        this.value1 = value1;
        this.lengthConverter = lengthConverter;
    }


    public boolean convert()
    {
        return lengthConverter.convert(value1,value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityConverter that = (QuantityConverter) o;
        return Double.compare(that.value2, value2) == 0 &&
                Double.compare(that.value1, value1) == 0 &&
                lengthConverter == that.lengthConverter;
    }
}
