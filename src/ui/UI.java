package ui;
import Controller.*;

import java.util.Scanner;

public class UI {
    private Scanner input = new Scanner(System.in);
    private Controller controller = new Controller();


    public String[] promptTilOprettelseAfSvømmer() {

        try {
            System.out.print("Indtast navn: ");
            String navn = input.nextLine();

            System.out.print("Indtast fødselsdato (format: yyyy-mm-dd): ");
            String fødselsdag = input.nextLine();

            System.out.print("Indtast adresse: ");
            String adresse = input.nextLine();

            System.out.print("Aktivt eller passivt medlem? (indtast Aktiv/Passiv): ");
            String aktivitetsform = input.nextLine();

            System.out.print("Motionist eller konkurrencesvømmer? (indtast Motionist/Konkurrencesvømmer): ");
            String medlemskabsType = input.nextLine();

            String[] nySvømmer = new String[5];

            nySvømmer[0] = navn;
            nySvømmer[1] = fødselsdag;
            nySvømmer[2] = adresse;
            nySvømmer[3] = aktivitetsform;
            nySvømmer[4] = medlemskabsType;

            return nySvømmer;


        } catch (Exception e) {
            System.out.println("Noget gik galt. Tast igen");
            promptTilOprettelseAfSvømmer();
        }


        return null;
    }


}
