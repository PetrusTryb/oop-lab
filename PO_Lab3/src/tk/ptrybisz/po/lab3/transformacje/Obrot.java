package tk.ptrybisz.po.lab3.transformacje;

public class Obrot implements Transformacja {
    private final double kat;
    public Obrot(double kat) {
        this.kat = kat;
    }
    @Override
    public Punkt transformuj(Punkt p) {
        return new Punkt(
                p.getX() * Math.cos(Math.toRadians(kat)) - p.getY() * Math.sin(Math.toRadians(kat)),
                p.getX() * Math.sin(Math.toRadians(kat)) + p.getY() * Math.cos(Math.toRadians(kat))
        );
    }
    @Override
    public Transformacja getTransformacjaOdwrotna() {
        return new Obrot(-kat);
    }
    public double getKat() {
        return kat;
    }
    @Override
    public String toString() {
        return "Obrot o " + kat + " stopni";
    }
}
