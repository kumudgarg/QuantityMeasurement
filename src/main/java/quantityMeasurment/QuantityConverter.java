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
}
