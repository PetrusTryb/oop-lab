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
    public static void main(String[] args) {
        //zad_1_i_2();
        try{
            zad3();
            zad4();
        }catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
    }
}