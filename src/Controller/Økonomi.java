package Controller;

import java.util.ArrayList;

public class Økonomi{

    private ArrayList<Svømmer> medlemsListe = new ArrayList<>();
    int samledeGæld = 0;

    public int getSamledeGæld(){
        for(int i = 0; i < medlemsListe.size(); i++){
            samledeGæld += medlemsListe.get(i).getGæld();
        }
        return samledeGæld;
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