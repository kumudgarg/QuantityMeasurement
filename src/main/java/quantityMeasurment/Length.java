package quantityMeasurment;

public class Length {

    private static final double FEET_INCH_MULTIPLIER = 12;
    private static final double YARD_FEET_MULTIPLIER = 3;
    private final Unit unit;

    enum Unit {FEET, INCH, YARDS, NULL}

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
            return Double.compare(Math.round(this.value* FEET_INCH_MULTIPLIER),that.value) == 0;
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value,Math.round(that.value* FEET_INCH_MULTIPLIER)) == 0;
        if(this.unit.equals(Unit.YARDS) && that.unit.equals(Unit.FEET))
            return Double.compare(Math.round(this.value* YARD_FEET_MULTIPLIER),that.value) == 0;
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARDS))
            return Double.compare(this.value,Math.round(that.value* YARD_FEET_MULTIPLIER)) == 0;
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
