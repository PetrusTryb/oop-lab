import tk.ptrybisz.po.lab3.transformacje.*;

public class Main {
    private static void printBlue(String text){
        System.out.println("\u001B[34m" + text + "\u001B[0m");
    }
    private static void zad_1_i_2(){
        printBlue("Zadanie 1 i 2");
        try {
            Punkt p1 = Punkt.E_X;
            System.out.println(p1);
            Transformacja tr = new Translacja(5, 6);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);
        } catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();
        try
        {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr2 = new Skalowanie(5, 4);
            System.out.println(tr2);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();
        try
        {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Skalowanie(5, 0);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();
    }
    private static void zad3() throws BrakTransformacjiOdwrotnejException {
        printBlue("Zadanie 3");
        Punkt p1 = Punkt.E_X;
        Transformacja t = new Obrot(45);
        System.out.println();
        System.out.println(p1);
        Punkt p1_t = t.transformuj(p1);
        System.out.println(p1_t);
        System.out.println(t.getTransformacjaOdwrotna().transformuj(p1_t));

        p1 = new Punkt(0,5);
        System.out.println();
        System.out.println(p1);
        p1_t = t.transformuj(p1);
        System.out.println(p1_t);
        System.out.println(t.getTransformacjaOdwrotna().transformuj(p1_t));

        p1 = new Punkt(-213,769);
        t = new Obrot(22);
        System.out.println();
        System.out.println(p1);
        p1_t = t.transformuj(p1);
        System.out.println(p1_t);
        System.out.println(t.getTransformacjaOdwrotna().transformuj(p1_t));
    }
    private static void zad4() throws BrakTransformacjiOdwrotnejException {
        printBlue("Zadanie 4");
        Punkt p1 = new Punkt(2, 2);
        Transformacja t = new ZlozenieTransformacji(new Transformacja[]{
                new Skalowanie(2, 5),
                new Translacja(5, 6),
        });
        System.out.println();
        System.out.println(p1);
        Punkt p1_t = t.transformuj(p1);
        System.out.println(p1_t);
        System.out.println(t.getTransformacjaOdwrotna().transformuj(p1_t));
    }
    private static void modyfikacja() throws BrakTransformacjiOdwrotnejException, NieMoznaZbudowacTrojkataException{
        printBlue("Modyfikacja");
        Punkt a = new Punkt(1,1);
        Punkt b = new Punkt(2,5);
        Punkt c = new Punkt(10,7);
        Punkt d = new Punkt(2,5);
        Trojkat t1 = new Trojkat(a,b,c);
        System.out.println(t1);

        Transformacja tr1 = new Skalowanie(2,5);
        Trojkat t1_tr1 = tr1.transformuj(t1);
        System.out.println("Skalowanie: "+t1_tr1);
        System.out.println("\todwrotna: "+tr1.getTransformacjaOdwrotna().transformuj(t1_tr1));

        Transformacja tr2 = new Translacja(-3,0);
        Trojkat t1_tr2 = tr2.transformuj(t1);
        System.out.println("Translacja: "+t1_tr2);
        System.out.println("\todwrotna: "+tr2.getTransformacjaOdwrotna().transformuj(t1_tr2));

        Transformacja tr3 = new Obrot(70);
        Trojkat t1_tr3 = tr3.transformuj(t1);
        System.out.println("Obrot: "+t1_tr3);
        System.out.println("\todwrotna: "+tr3.getTransformacjaOdwrotna().transformuj(t1_tr3));

        ZlozenieTransformacji tr4 = new ZlozenieTransformacji(new Transformacja[]{tr1, tr2});
        Trojkat t1_tr4 = tr4.transformuj(t1);
        System.out.println("Zlozenie: "+t1_tr4);
        System.out.println("\todwrotna: "+tr4.getTransformacjaOdwrotna().transformuj(t1_tr4));

        ZlozenieTransformacji tr5 = new ZlozenieTransformacji(new Transformacja[]{
                new Obrot(15),
                new Skalowanie(0,2),
                new Translacja(15,20)
        });
        Trojkat t1_tr5 = tr5.transformuj(t1);
        System.out.println("Zlozenie2: "+t1_tr5);
        System.out.println("\todwrotna: "+tr5.getTransformacjaOdwrotna().transformuj(t1_tr5));
    }
    public static void main(String[] args) {
        //zad_1_i_2();
        try{
            zad3();
            zad4();
            modyfikacja();
        }catch (BrakTransformacjiOdwrotnejException | NieMoznaZbudowacTrojkataException ex)
        {
            ex.printStackTrace();
        }
    }
}