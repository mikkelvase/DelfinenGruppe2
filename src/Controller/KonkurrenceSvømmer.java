package Controller;

import java.util.ArrayList;
import java.time.LocalDate;

public class KonkurrenceSvømmer {

    private ArrayList<Disciplin> disciplin;
    private ArrayList<Resultat> tider;

    public KonkurrenceSvømmer(Disciplin... disciplins) {
        disciplin = new ArrayList<>();
        for (int i = 0; i <disciplins.length ; i++) {
            disciplin.add(disciplins[i]);
        }
        tider = new ArrayList<>();
    }
/*
    public void tilføjDisciplin(Disciplin tilføjDis){
        disciplin.add(tilføjDis);
    }

    public void tilføjResultat(Resultat tilføjResultat){
        tider.add(tilføjResultat);
    }

    public ArrayList<Controller.Disciplin> getDisciplin() {
        return disciplin;
    }

 */
}