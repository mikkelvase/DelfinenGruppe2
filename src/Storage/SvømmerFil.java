package Storage;

import Controller.Svømmer;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SvømmerFil {

    //virker ikke pt. Gider ikke læse fødselsdag.
    public ArrayList<Svømmer> scanFraFil () throws FileNotFoundException {
        File file = new File("Svømmer.txt");
        ArrayList<Svømmer> svømmerList = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            String navn = scan.next();
            String fødselsdag = scan.next();
            String adresse = scan.next();
            String aktivitetsform = scan.next();
            String konkurrence = scan.next();
            svømmerList.add(new Svømmer(navn,LocalDate.parse(fødselsdag),adresse,aktivitetsform,konkurrence));
        }
        return svømmerList;
    }


}
