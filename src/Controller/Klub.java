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
            if(medlemsListe.get(i).iRestance == true){
                restanceMedlemmer.add(medlemsListe.get(i));
            }
        }
        return restanceMedlemmer;
    }


}
