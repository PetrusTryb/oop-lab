package tk.ptrybisz.po.lab3.transformacje;

public class ZlozenieTransformacji implements Transformacja
{
    private final Transformacja[] transformacje;
    public ZlozenieTransformacji(Transformacja[] transformacje)
    {
        this.transformacje = transformacje;
    }
    @Override
    public Punkt transformuj(Punkt p)
    {
        for (Transformacja tr : transformacje)
        {
            p = tr.transformuj(p);
        }
        return p;
    }

    @Override
    public Trojkat transformuj(Trojkat t) throws NieMoznaZbudowacTrojkataException {
        for (Transformacja tr : transformacje)
        {
            t = tr.transformuj(t);
        }
        return t;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException
    {
        Transformacja[] odwrotnosci = new Transformacja[transformacje.length];
        for (int i = 0; i < transformacje.length; i++)
        {
            odwrotnosci[transformacje.length-1-i] = transformacje[i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(odwrotnosci);
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Transformacja t : transformacje) {
            sb.append(t.toString()).append(", ");
        }
        return sb.toString();
    }
}

