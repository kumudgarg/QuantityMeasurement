package quantityMeasurment;

public class QuantityComparator {


    public double value;
    public LengthComparision lengthConverter;

    public QuantityComparator(LengthComparision lengthComparision, double value) {
        this.lengthConverter = lengthComparision;
        this.value = value;
    }


    public boolean compareTo(QuantityComparator converter1, QuantityComparator converter2) {
        return lengthConverter.compareTo(converter1 , converter2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityComparator that = (QuantityComparator) o;
        return Double.compare(that.value, value) == 0 &&
                lengthConverter == that.lengthConverter;
    }
}
