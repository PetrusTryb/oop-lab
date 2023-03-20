package tk.ptrybisz.po.lab3.transformacje;

public interface Transformacja {
    Punkt transformuj(Punkt p);
    Trojkat transformuj(Trojkat t) throws NieMoznaZbudowacTrojkataException;
    Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException;
}
