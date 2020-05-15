package com.Mikkel;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Svømmer {
    private String navn;
    private LocalDate fødselsdag;
    private String adresse;
    private String aktivitetsform;
    private String medlemskabsType;

    ArrayList<Svømmer> alleSvømmere = new ArrayList<>();



    public Svømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform, String medlemskabsType) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        this.medlemskabsType = medlemskabsType;

        alleSvømmere.add(this);
    }

    //Overload
    public Svømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform){
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
    }

    //Overload
    public Svømmer(String navn, LocalDate fødselsdag, String adresse){
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;

    }

    public boolean harAktivtMedlemskab(){
        return (aktivitetsform.equalsIgnoreCase("aktiv"));
    }

    public boolean erMotionist(){
        return medlemskabsType.equalsIgnoreCase("motionist");
    }

    public int calculateAge(LocalDate fødselsdag) {
        if ((fødselsdag != null)) {
            return Period.between(fødselsdag, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

    public LocalDate getFødselsdag() {
        return fødselsdag;
    }


}



