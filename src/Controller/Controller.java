package Controller;
import ui.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {
    private Klub klub = new Klub();


    //Tror ikke vi skal sætte ind i Arraylist her, da vi indlæser i arraylist når vi læser fra fil.

    //Svar: Signe sagde at det var en god idé både at sende oprettet svømmer til en arraylist i Klub og til filen.
    //Det skulle være godt for programmets performance at man ikke skal ned og læse i fil hver gang man skal bruge medlemslisten.
    //Forestiller mig at programmet bliver inrettet sådan at ved opstart indlæser det de svømmere der allerede ligger i filen og
    //sætter dem ind i medlemsListe i Klub klassen. Og når man opretter flere medlemmer mens programmet kører
    //bliver de sat ind begge steder.
    //På den måde kan vi nøjes med at tilgå medlemsListe når vi skal håndtere medlemmer og printe forskellige data ud
    //og slipper derfor for at skulle ned og læse i fil i hver metode.
    //Vh Simon
    public void opretSvømmer(String[] medlemsData) {
        File file = new File("Svømmer.txt");
        String navn = medlemsData[0];
        LocalDate fødselsdag = LocalDate.parse(medlemsData[1]);
        String adresse = medlemsData[2];

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file,true));
            if (medlemsData.length == 4) {
                String aktivitetsform = medlemsData[3];
                Svømmer svømmer = new Svømmer(navn, fødselsdag, adresse, aktivitetsform);
                klub.getMedlemsListe().add(svømmer);
                ps.println(svømmer);

            } else if (medlemsData.length == 5) {
                String aktivitetsform = medlemsData[3];
                String medlemskabsType = medlemsData[4];
                Svømmer svømmer = new Svømmer(navn, fødselsdag, adresse, aktivitetsform, medlemskabsType);
                klub.getMedlemsListe().add(svømmer);
                ps.println(svømmer);
            } else {
                Svømmer svømmer = new Svømmer(navn, fødselsdag, adresse);
                klub.getMedlemsListe().add(svømmer);
                ps.println(svømmer);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Unable to write to file");
        }

    }

    /*
    //Tror ikke vi skal bruge den her siden vi laver en Arraylist når vi indlæser filerne.
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

    */

    public Klub getKlub() {
        return klub;
    }

}
