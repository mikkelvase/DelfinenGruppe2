package Controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Svømmer {
    protected java.lang.String navn;
    protected LocalDate fødselsdag;
    protected java.lang.String adresse;
    protected java.lang.String aktivitetsform; //Aktiv/Passiv
    protected java.lang.String medlemskabsType;
    protected java.lang.String[] disciplin;
    protected boolean inRestance;
    protected int balance;


    public Svømmer(java.lang.String navn, LocalDate fødselsdag, java.lang.String adresse, java.lang.String aktivitetsform, java.lang.String[] disciplins) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        this.disciplin = disciplins;

        balance = 0;
    }

    //Overload
    public Svømmer(java.lang.String navn, LocalDate fødselsdag, java.lang.String adresse, java.lang.String aktivitetsform, java.lang.String medlemskabsType) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        this.medlemskabsType = medlemskabsType;
        balance = 0;
    }

    //Overload
    public Svømmer(java.lang.String navn, LocalDate fødselsdag, java.lang.String s, java.lang.String adresse) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        balance = 0;
    }



    public void setDisciplin(java.lang.String[] disciplin) {
        this.disciplin = disciplin;
    }


    public boolean harAktivtMedlemskab() {
        return (aktivitetsform.equalsIgnoreCase("aktiv"));
    }

    //SKAL FIXES
    public boolean erMotionist() {
        return true;// medlemskabsType.equalsIgnoreCase("motionist");
    }


    public boolean isInRestance() {
        return balance < 0;

    }

    //Usikker på om vi skal bruge  den her metode..?
    public void setInRestance() {
        inRestance = true;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int calculateAge() {
        if ((fødselsdag != null)) {
            return Period.between(getFødselsdag(), LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

    public LocalDate getFødselsdag() {

        return fødselsdag;
    }

    @Override
    public java.lang.String toString() {
        return
                navn + " " +
                fødselsdag + " " +
                adresse + " " +
                aktivitetsform + " " +
                Arrays.toString(disciplin)

                ;
    }
}



