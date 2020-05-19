package Controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Svømmer {
    protected String navn;
    protected LocalDate fødselsdag;
    protected String adresse;
    protected String aktivitetsform;
    protected KonkurrenceSvømmer konkurrenceSvømmer;
    protected boolean inRestance;
    protected int balance;


    public Svømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform, KonkurrenceSvømmer konkurrenceSvømmer) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        this.konkurrenceSvømmer = konkurrenceSvømmer;
        balance = 0;
    }

    //Overload
    public Svømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        balance = 0;
    }

    //Overload
    public Svømmer(String navn, LocalDate fødselsdag, String adresse){
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        balance = 0;
    }


    public void registrerSomKonkurrencesvømmer(KonkurrenceSvømmer k){
        konkurrenceSvømmer = k;
    }

    public boolean harAktivtMedlemskab(){
        return (aktivitetsform.equalsIgnoreCase("aktiv"));
    }

    public boolean erMotionist(){
        return true;// medlemskabsType.equalsIgnoreCase("motionist");
    }


    public boolean isInRestance() {
        return balance < 0;

    }

    //Usikker på om vi skal bruge  den her metode..?
    public void setInRestance(){
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
    public String toString() {
        return
                  navn + " " +
                  fødselsdag + " " +
                  adresse + " " +
                 aktivitetsform + " "

                ;
    }
}



