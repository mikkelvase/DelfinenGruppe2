package Controller;

import java.time.LocalDate;

public class StævneResultat extends Resultat {
    protected String stævneNavn;
    protected int placering;

    StævneResultat(int minutter, int sekunder, int millisekunder, LocalDate dato, String stævneNavn, int placering) {
        super(minutter, sekunder, millisekunder, dato);
        this.stævneNavn = stævneNavn;
        this.placering = placering;
    }
}
