package tk.ptrybisz.po.lab3.transformacje;

public class Trojkat {
    private final Punkt A, B, C;
    public Trojkat (Punkt A, Punkt B, Punkt C) throws NieMoznaZbudowacTrojkataException{
        if(A.equals(B)||A.equals(C)||B.equals(C))
            throw new NieMoznaZbudowacTrojkataException("Punkty musza byc rozne!");
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public Punkt getA(){
        return A;
    }
    public Punkt getB(){
        return B;
    }
    public Punkt getC(){
        return C;
    }
    @Override
    public String toString() {
        return "Trojkat ("+A+", "+B+", "+C+")";
    }
}
