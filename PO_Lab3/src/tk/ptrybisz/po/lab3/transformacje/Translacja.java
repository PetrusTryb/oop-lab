package tk.ptrybisz.po.lab3.transformacje;

public class Translacja implements Transformacja{
    private final double dX, dY;
    public Translacja(double dX, double dY) {
        this.dX = dX;
        this.dY = dY;
    }
    @Override
    public Transformacja getTransformacjaOdwrotna() {
        return new Translacja(-dX, -dY);
    }
    @Override
    public Punkt transformuj(Punkt p) {
        return new Punkt(p.getX() + dX, p.getY() + dY);
    }

    @Override
    public Trojkat transformuj(Trojkat t) throws NieMoznaZbudowacTrojkataException {
        return new Trojkat(transformuj(t.getA()),transformuj(t.getB()),transformuj(t.getC()));
    }

    public double getdX() {
        return dX;
    }
    public double getdY() {
        return dY;
    }
    @Override
    public String toString() {
        return "Translacja o wektor ("+dX+","+dY+")";
    }
}

