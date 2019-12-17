package quantityMeasurment;

import java.util.Objects;

public class Length {

    private static final double FEET_TO_INCH = 12;
    private final Unit unit;

    enum Unit {FEET, INCH, NULL}

    ;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;

    }

    public boolean compare(Length that) {
        if(this.unit.equals(that.unit))
            return Double.compare(this.value ,that.value) == 0;
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(Math.round(this.value*FEET_TO_INCH),that.value) == 0;
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value,Math.round(that.value*FEET_TO_INCH)) == 0;
        return false;
    }


    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
