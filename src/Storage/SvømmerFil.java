
package Storage;

import Controller.Klub;
import Controller.KonkurrenceSvømmer;
import Controller.Svømmer;
import ui.UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SvømmerFil {

    Klub klub = new Klub();




    public ArrayList<Svømmer> opretSvømmereUdFraDataITekstFil() throws FileNotFoundException {

        File file = new File("Svømmer.txt");

        ArrayList<Svømmer> svømmerefraFil = new ArrayList<>();

        Scanner scan = new Scanner(file);


        while (scan.hasNext()) {

            String navn = scan.next();
            String fødselsdag = scan.next();
            String adresse = scan.next();
            String aktivitetsform = scan.next();
            String[] discipliner = new String[4];
            discipliner[0] = scan.next();
            discipliner[1] = scan.next();
            discipliner[2] = scan.next();
            discipliner[3] = scan.next();



            Svømmer svømmer = new Svømmer(navn , LocalDate.parse(fødselsdag) , adresse , aktivitetsform ,discipliner);

            svømmerefraFil.add(svømmer);


        }


        return svømmerefraFil;

    }





}

