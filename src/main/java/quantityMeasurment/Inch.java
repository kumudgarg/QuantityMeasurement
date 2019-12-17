package quantityMeasurment;

import java.util.Objects;

public class Inch {
    private final double inch;

    public Inch(double inch) {
    this.inch = inch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch1 = (Inch) o;
        return Double.compare(inch1.inch, inch) == 0;
    }
}
