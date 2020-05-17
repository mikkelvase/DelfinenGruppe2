import Controller.*;
import Storage.SvømmerFil;
import ui.UI;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class Main {

    //Vi skal nok have fjernet "throws FileNotFoundException" delen inden vi afleverer
    public static void main(String[] args) throws FileNotFoundException {



        //Fil Test - Thomas
        Controller cont = new Controller();
        UI ui = new UI();
        cont.opretSvømmer(ui.promptTilOprettelseAfSvømmer());

        //SvømmerFil svømmerFil = new SvømmerFil();
       // System.out.println(svømmerFil.scanFraFil());





/*


        //////////////////////
        //Controller test
        //////////////////////
        String[] nySvømmer = new String[5];

        nySvømmer[0] = "Henrik";
        nySvømmer[1] = "1999-11-09";
        nySvømmer[2] = "Rolighedsvej";
        nySvømmer[3] = "Aktiv";
        nySvømmer[4] = "Konkurrence";

        cont.opretSvømmer(nySvømmer);

        System.out.println(cont.getKlub().getMedlemsListe().size());
*/




    }
}
