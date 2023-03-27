package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class PrzeprawaPrzezRzeke extends Wedrowka {
    /**
     * @param odleglosc - długość wędrówki w GOTach
     */
    public PrzeprawaPrzezRzeke(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public String getNazwa() {
        return "Przeprawa przez rzekę";
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.1;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 2;
    }
}
