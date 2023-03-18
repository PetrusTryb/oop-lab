package tk.ptrybisz.po.lab3.transformacje;

public interface Transformacja {
    Punkt transformuj(Punkt p);
    Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException;
}
