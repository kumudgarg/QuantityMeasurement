package quantityMeasurment;

public class QuantityMeasurmentException extends Throwable
{
    enum ExceptionType
    {
        QUANTITY_UN_EQUALITY
    }
    public ExceptionType type;

    public QuantityMeasurmentException(String message, QuantityMeasurmentException.ExceptionType type) {
        super(message);
        this.type = type;
    }
}
