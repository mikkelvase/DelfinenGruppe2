package Controller;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class KonkurrenceSvømmer extends Svømmer{

    private ArrayList<Disciplin> disciplin = new ArrayList<>();
    private ArrayList<Tid> tider = new ArrayList<>();

    public KonkurrenceSvømmer(String navn, LocalDate fødselsdag, String adresse, String aktivitetsform) {
        this.navn = navn;
        this.fødselsdag = fødselsdag;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        balance = 0;
        disciplin;
        tider;
    }

    public void tilføjDisciplin(String tilføjDis){
        disciplin.add(tilføjDis);
    }

    public void tilføjTid(int tilføjTid){
        tider.add(tilføjTid);
    }

}