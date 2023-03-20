package tk.ptrybisz.po.lab3.transformacje;

public class NieMoznaZbudowacTrojkataException extends Exception
{
    public NieMoznaZbudowacTrojkataException()
    {
        //Niejawne wywołanie konstruktora klasy nadrzędnej
        //super();
    }
    public NieMoznaZbudowacTrojkataException(String message) {
        super(message);
    }
    public NieMoznaZbudowacTrojkataException(Throwable cause) {
        super(cause);
    }
    public NieMoznaZbudowacTrojkataException(String message, Throwable cause) {
        super(message, cause);
    }
}
