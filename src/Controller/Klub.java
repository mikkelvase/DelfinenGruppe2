package Controller;

import java.util.ArrayList;

public class Klub {

    private ArrayList<Svømmer> medlemsListe = new ArrayList<>();

    public ArrayList<Svømmer> getMedlemsListe() {
        return medlemsListe;
    }

    public ArrayList<Svømmer> getMotionister(){
        ArrayList<Svømmer> motionister = new ArrayList<>();
        for (int i = 0; i <medlemsListe.size() ; i++) {
            if (medlemsListe.get(i).erMotionist()){
                motionister.add(medlemsListe.get(i));
            }
        }
        return motionister;
    }

    public ArrayList<Svømmer> getUngdomshold(){
        ArrayList<Svømmer> ungdomshold = new ArrayList<>();
        for (int i = 0; i <medlemsListe.size() ; i++) {
            if (!medlemsListe.get(i).erMotionist() && medlemsListe.get(i).calculateAge() < 18){
                ungdomshold.add(medlemsListe.get(i));
            }
        }
        return ungdomshold;
    }

    public ArrayList<Svømmer> getSeniorhold(){
        ArrayList<Svømmer> seniorhold = new ArrayList<>();
        for (int i = 0; i <medlemsListe.size() ; i++) {
            if (!medlemsListe.get(i).erMotionist() && medlemsListe.get(i).calculateAge() >= 18){
                seniorhold.add(medlemsListe.get(i));
            }
        }
        return seniorhold;
    }

    public ArrayList<Svømmer> getRestanceMedlemmer(){
        ArrayList<Svømmer> restanceMedlemmer = new ArrayList<>();
        for(int i = 0; i < medlemsListe.size(); i++){
            if(medlemsListe.get(i).isInRestance()){
                restanceMedlemmer.add(medlemsListe.get(i));
            }
        }
        return restanceMedlemmer;
    }

    public double getSamletGæld(){
        double samletGæld = 0;
        for (int i = 0; i < getRestanceMedlemmer().size() ; i++) {
            samletGæld += getRestanceMedlemmer().get(i).getBalance();
        }
        return samletGæld;
    }

    public ArrayList<Svømmer> getPassiveMedlemmer(){
        ArrayList<Svømmer> passiveMedlemmer = new ArrayList<>();
        for (int i = 0; i <medlemsListe.size() ; i++) {
            if (!medlemsListe.get(i).harAktivtMedlemskab()){
                passiveMedlemmer.add(medlemsListe.get(i));
            }
        }
        return passiveMedlemmer;
    }

    public ArrayList<Svømmer> getAktiveMedlemmerOver18(){
        ArrayList<Svømmer> AktiveMedlemmerOver18 = new ArrayList<>();
        for (int i = 0; i <medlemsListe.size() ; i++) {
            if (medlemsListe.get(i).calculateAge() > 18){
                AktiveMedlemmerOver18.add(medlemsListe.get(i));
            }
        }
        return AktiveMedlemmerOver18;
    }

    public ArrayList<Svømmer> getAktiveMedlemmerUnder18(){
        ArrayList<Svømmer> AktiveMedlemmerUnder18 = new ArrayList<>();
        for (int i = 0; i <medlemsListe.size() ; i++) {
            if (medlemsListe.get(i).calculateAge() < 18){
                AktiveMedlemmerUnder18.add(medlemsListe.get(i));
            }
        }
        return AktiveMedlemmerUnder18;
    }

    public ArrayList<Svømmer> getAktiveMedlemmerImellem18og60() {
        ArrayList<Svømmer> AktiveMedlemmerImellem18og60 = new ArrayList<>();
        for (int i = 0; i < getAktiveMedlemmerOver18().size(); i++) {
            if (getAktiveMedlemmerOver18().get(i).calculateAge() > 60) {
                AktiveMedlemmerImellem18og60.add(getMedlemsListe().get(i));
            }
        }
        return AktiveMedlemmerImellem18og60;
    }

    public ArrayList<Svømmer> getAktiveMedlemmerOver60(){
        ArrayList<Svømmer> AktiveMedlemmerOver60 = new ArrayList<>();
        for (int i = 0; i <medlemsListe.size() ; i++) {
            if (medlemsListe.get(i).calculateAge() > 60){
                AktiveMedlemmerOver60.add(medlemsListe.get(i));
            }
        }
        return AktiveMedlemmerOver60;
    }


    public double forventedeIndbetalinger(){
        double samletSum = getPassiveMedlemmer().size() * 500;
        samletSum += getAktiveMedlemmerUnder18().size() * 1000;
        samletSum += getAktiveMedlemmerImellem18og60().size() * 1600;
        samletSum += getAktiveMedlemmerOver60().size() * (1600 * 0.75);

        return samletSum;
    }



}
