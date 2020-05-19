package Controller;

import java.time.LocalDate;

public class Resultat{

    int minutter;
    int sekunder;
    int millisekunder;
    LocalDate dato;


    Resultat(int minutter, int sekunder, int millisekunder, LocalDate dato){
        this.minutter = minutter;
        this.sekunder = sekunder;
        this.millisekunder = millisekunder;
        this.dato = dato;
    }

}