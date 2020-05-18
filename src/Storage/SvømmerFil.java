package Storage;

import Controller.Klub;
import Controller.Svømmer;
import ui.UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SvømmerFil {

    UI ui = new UI();
    Klub klub = new Klub();


    public ArrayList<Svømmer> scanFraFil () throws FileNotFoundException {

        File file = new File("Svømmer.txt");

        // ArrayList<Svømmer> svømmerList = new ArrayList<>();

         Scanner scan = new Scanner(file);


        while (scan.hasNext()) {

            String navn = scan.next();
            String fødselsdag = scan.next();
            String adresse = scan.next();
            String aktivitetsform = scan.next();
            String konkurrence = scan.next();

            klub.insertToKlub(new Svømmer(navn,LocalDate.parse(fødselsdag),adresse,aktivitetsform,konkurrence));
        }

        return klub.getMedlemsListe();
    }





}
