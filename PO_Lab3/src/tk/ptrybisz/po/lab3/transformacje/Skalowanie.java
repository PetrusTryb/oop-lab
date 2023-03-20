package tk.ptrybisz.po.lab3.transformacje;

public class Skalowanie implements Transformacja{
    private final double skalaX, skalaY;
    public Skalowanie(double skalaX, double skalaY) {
        this.skalaX = skalaX;
        this.skalaY = skalaY;
    }
    @Override
    public Transformacja getTransformacjaOdwrotna() throws
            BrakTransformacjiOdwrotnejException {
        if(skalaX == 0 || skalaY == 0)
            throw new BrakTransformacjiOdwrotnejException("Brak transformacji odwrotnej. Przynajmniej jeden z czynników skalowania jest równy 0.");
        return new Skalowanie(1/skalaX,1/skalaY);
    }
    @Override
    public Punkt transformuj(Punkt p) {
        return new Punkt(skalaX * p.getX(), skalaY * p.getY());
    }

    @Override
    public Trojkat transformuj(Trojkat t) throws NieMoznaZbudowacTrojkataException {
        return new Trojkat(transformuj(t.getA()),transformuj(t.getB()),transformuj(t.getC()));
    }

    public double getSkalaX() {
        return skalaX;
    }
    public double getSkalaY() {
        return skalaY;
    }
    @Override
    public String toString() {
        return "Skalowanie "+skalaX+"x oraz "+skalaY+"y";
    }

}