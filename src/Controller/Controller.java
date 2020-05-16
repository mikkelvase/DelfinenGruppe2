package Controller;
import ui.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {
    private Klub klub = new Klub();

    //Denne metode skal også skrive dataen til fil
    public void opretSvømmer(String[] medlemsData){
        String navn = medlemsData[0];
        LocalDate fødselsdag = LocalDate.parse(medlemsData[1]);
        String adresse = medlemsData[2];

        if (medlemsData.length == 4) {
            String aktivitetsform = medlemsData[3];
            Svømmer svømmer = new Svømmer(navn, fødselsdag, adresse, aktivitetsform);
            klub.getMedlemsListe().add(svømmer);

        }
        else if (medlemsData.length == 5) {
            String aktivitetsform = medlemsData[3];
            String medlemskabsType = medlemsData[4];
            Svømmer svømmer = new Svømmer(navn, fødselsdag, adresse, aktivitetsform, medlemskabsType);
            klub.getMedlemsListe().add(svømmer);

        } else {
            Svømmer svømmer = new Svømmer(navn, fødselsdag, adresse);
            klub.getMedlemsListe().add(svømmer);

        }


    }

    public Klub getKlub() {
        return klub;
    }

}
