package ui;
import Controller.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class UI {
    private Scanner input = new Scanner(System.in);
    // private Controller controller = new Controller();


    public Svømmer promptTilOprettelseAfSvømmer() {

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


            Svømmer nySvømmer = new Svømmer(navn , LocalDate.parse(fødselsdag) , adresse , aktivitetsform , medlemskabsType);

            return nySvømmer;
/*
            if (medlemskabsType.toLowerCase() == "Motionist".toLowerCase()) {

                Svømmer nySvømmer = new Svømmer(navn , LocalDate.parse(fødselsdag) , adresse , aktivitetsform , medlemskabsType);

                return nySvømmer;

            } else if (medlemskabsType.toLowerCase() == "Konkurrence".toLowerCase() ) {

                System.out.print(" vil du tilføje en eller flere discipliner til svømmeren? tryk 1 for ja tryk 2 for at gemme ");
                int brugerValg = input.nextInt();

                if (brugerValg == 1) {


                    System.out.print("Indtast en eller flere discipliner ");

                    while(input.hasNext()) {

                        String diciplin = input.nextLine();


                    }

                } else if (brugerValg == 2) {

                    Svømmer nySvømmer = new Svømmer(navn , LocalDate.parse(fødselsdag) , adresse , aktivitetsform , medlemskabsType);

                    return nySvømmer;


                }


 */



        } catch (Exception e) {
            System.out.println("Noget gik galt. Tast igen");
            promptTilOprettelseAfSvømmer();
        }


        return null;
    }

    public Integer userChosenMenu() {
        Scanner scan = new Scanner(System.in);
        int choosenNumber = scan.nextInt();
        return choosenNumber;
    }

    public void uiText(String text) {

        System.out.println(text);
    }

    /*
    public String getInput(String string) {
        string = userChosenMenu();
        return string;
    }

     */
}
