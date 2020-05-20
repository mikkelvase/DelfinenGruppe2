package Controller;

import java.util.ArrayList;

public class KonkurrenceSvømmer {

    private ArrayList<String> disciplin;
    private ArrayList<Resultat> tider;

    public KonkurrenceSvømmer(String... disciplins) {
        disciplin = new ArrayList<>();
        for (int i = 0; i <disciplins.length ; i++) {
            disciplin.add(disciplins[i]);
        }
        tider = new ArrayList<>();
    }

    public void tilføjDisciplin(String tilføjDisciplin){
        disciplin.add(tilføjDisciplin);
    }

    public void tilføjResultat(Resultat tilføjResultat){
        tider.add(tilføjResultat);
    }

    public ArrayList<String> getDisciplin() {
        return disciplin;
    }

    @Override
    public java.lang.String toString() {
        return "KonkurrenceSvømmer{" +
                "disciplin=" + disciplin +
                ", tider=" + tider +
                '}';
    }
}