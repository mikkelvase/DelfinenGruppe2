package Controller;

import java.time.LocalDate;
import java.time.Period;

public class Svømmer {
    private String navn;
    private LocalDate fødselsdag;
    private String adresse;
    private String aktivitetsform;
    private String medlemskabsType; //KonkurrenceSvømmer-Klasse istedet for String
    private boolean iRestance;
    private int gæld;


    public Svømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform, String medlemskabsType) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        this.medlemskabsType = medlemskabsType;
        this.gæld;
    }

    //Overload
    public Svømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform){
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        this.gæld;
    }

    //Overload
    public Svømmer(String navn, LocalDate fødselsdag, String adresse){
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.gæld;
    }



    public boolean harAktivtMedlemskab(){
        return (aktivitetsform.equalsIgnoreCase("aktiv"));
    }

    public boolean erMotionist(){
        return medlemskabsType.equalsIgnoreCase("motionist");
    }

    public boolean isiRestance() {
        if(gæld > 0){
            iRestance = true;
        }
        return iRestance;
    }

    public void setiRestance(){
        iRestance = true;
    }

    public int getGæld() {
        return gæld;
    }

    public void setGæld(int gæld) {
        this.gæld = gæld;
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



