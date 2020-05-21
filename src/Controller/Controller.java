
package Controller;
import Storage.SvømmerFil;
import ui.*;

import java.io.*;
import java.util.ArrayList;

public class Controller {
    private Klub klub = new Klub();
    private UI ui = new UI();
     SvømmerFil svømmerfil = new SvømmerFil();


    //Tror ikke vi skal sætte ind i Arraylist her, da vi indlæser i arraylist når vi læser fra fil.

    //Svar: Signe sagde at det var en god idé både at sende oprettet svømmer til en arraylist i Klub og til filen.
    //Det skulle være godt for programmets performance at man ikke skal ned og læse i fil hver gang man skal bruge medlemslisten.
    //Forestiller mig at programmet bliver inrettet sådan at ved opstart indlæser det de svømmere der allerede ligger i filen og
    //sætter dem ind i medlemsListe i Klub klassen. Og når man opretter flere medlemmer mens programmet kører
    //bliver de sat ind begge steder.
    //På den måde kan vi nøjes med at tilgå medlemsListe når vi skal håndtere medlemmer og printe forskellige data ud
    //og slipper derfor for at skulle ned og læse i fil i hver metode.
    //Vh Simon

    // Denne metode skal vel egentlig ligge i UI?
    public void Menu() throws FileNotFoundException {


        ui.uiText("tryk 1 for at oprette svømmer");
        ui.uiText("tryk 2 for at printe alle svømmere");

        int userChoice = ui.userChosenMenu();


        if (userChoice == 1) {

            Svømmer nySvømmer = ui.promptTilOprettelseAfSvømmer();
            opretNySvømmer(nySvømmer);



        } else if (userChoice == 2) {

            ui.uiText("Klubben: " + klub.getMedlemsListe());
        }

        Menu();


    }


    // Metoden tager en svømmer som parameter. herefter tilføjer den svømmeren til vores klub.
    // Derefter giver vi den vores Svømmer.txt fil og printer vores nyoprettede svømmer til filen så svømmeren altid er gemt.

    public void opretNySvømmer(Svømmer svømmer) throws FileNotFoundException {

        klub.tilføjMedlemTilKlub(svømmer);
        File file = new File("Svømmer.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file,true));
        ps.println(svømmer);

    }

    // Funktion til at få vores medlemdsliste fra klub klassen.



    // Scan Fra fil opretter en ny arrayliste ud fra den arrayliste som opretSvømmereUdFraDataITekstFil() retunerer.
    // Herefter looper vi igennem vores midlertidige arrayliste og henter hver en svømmer og tilføjer dem til klubben.
    // På den måde har vi altid en klub fuld af medlemmer når programmet starter.

    public void scanFraFil() throws FileNotFoundException {

        ArrayList<Svømmer> temp = svømmerfil.opretSvømmereUdFraDataITekstFil();

        for (int i = 0; i < temp.size(); i++) {

            klub.tilføjMedlemTilKlub(temp.get(i));


        }

    }




}

