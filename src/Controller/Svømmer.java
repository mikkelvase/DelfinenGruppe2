package Controller;

import java.time.LocalDate;
import java.time.Period;

public class Svømmer {
    private String navn;
    private LocalDate fødselsdag;
    private String adresse;
    private String aktivitetsform;
    private String medlemskabsType; //KonkurrenceSvømmer-Klasse istedet for String
    private boolean inRestance;
    private int balance;


    public Svømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform, String medlemskabsType) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        this.medlemskabsType = medlemskabsType;
        balance = 0;
    }

    //Overload
    public Svømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform){
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



    public boolean harAktivtMedlemskab(){
        return (aktivitetsform.equalsIgnoreCase("aktiv"));
    }

    public boolean erMotionist(){
        return medlemskabsType.equalsIgnoreCase("motionist");
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
        return "Svømmer{" +
                "navn='" + navn + '\'' +
                ", fødselsdag=" + fødselsdag +
                ", adresse='" + adresse + '\'' +
                ", aktivitetsform='" + aktivitetsform + '\'' +
                ", medlemskabsType='" + medlemskabsType + '\'' +
                '}';
    }
}



