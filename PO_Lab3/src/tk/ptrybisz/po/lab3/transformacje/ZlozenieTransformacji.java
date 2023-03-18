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
        for (Transformacja t : transformacje)
        {
            p = t.transformuj(p);
        }
        return p;
    }
    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException
    {
        Transformacja[] odwrotnosci = new Transformacja[transformacje.length];
        for (int i = 0; i < transformacje.length; i++)
        {
            odwrotnosci[i] = transformacje[i].getTransformacjaOdwrotna();
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

