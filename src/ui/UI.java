package ui;

import Controller.*;

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

            if (medlemskabsType.equalsIgnoreCase("motionist")) {
                Svømmer nySvømmer = new Svømmer(navn, LocalDate.parse(fødselsdag), adresse, aktivitetsform);
                return nySvømmer;

            }
            if (medlemskabsType.equalsIgnoreCase("konkurrencesvømmer")) {
                Disciplin[] disciplins = promptIndledendeDisciplinValg();
                Svømmer nySvømmer = new Svømmer(navn, LocalDate.parse(fødselsdag), adresse, aktivitetsform, disciplins);
                //Her skal bruger promptes til muligheden for at tilføje flere discipliner. Hvis brugeren ønsker det, skal de
                //tilføjes via tilføjDisciplin() i KonkurrenceSvømmer--klassen
                System.out.println("Svømmer oprettet");
                return nySvømmer;



            }

            return null;
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

    public Disciplin[] promptIndledendeDisciplinValg() {
        Disciplin[] disciplins = new Disciplin[4];
        int[] userChoices = new int[4];
        System.out.println("1. Crawl // 2. Rygcrawl // 3. Bryst // 4. Butterfly:");
        System.out.print("Indtast en disciplin:");
        switch (input.nextInt()) {
            case 1:
                disciplins[0] = Disciplin.CRAWL;
                break;
            case 2:
                disciplins[1] = Disciplin.RYGCRAWL;
                break;
            case 3:
                disciplins[2] = Disciplin.BRYST;
                break;
            case 4:
                disciplins[3] = Disciplin.BUTTERFLY;
                break;

        }

        return disciplins;
        /*
        userChoices[0] = input.nextInt();
        System.out.print("Indtast en til disciplin eller afslut ved at taste 0:");
        if (input.nextInt() == 0) {
            return disciplins;
        }
        userChoices[1] = input.nextInt();
        System.out.print("Indtast en til disciplin eller afslut ved at taste 0:");
        if (input.nextInt() == 0) {
            return disciplins;
        }
        userChoices[2] = input.nextInt();
        System.out.print("Indtast en til disciplin eller afslut ved at taste 0:");
        if (input.nextInt() == 0) {
            return disciplins;
        }
        userChoices[3] = input.nextInt();
        return disciplins;

         */




        /*
        while (input.hasNextInt()) {
            for (int i = 0; i < userChoices.length; i++) {
                userChoices[i] = input.nextInt();
            }
        }



        for (int i = 0; i < userChoices.length; i++) {
            if (userChoices[i] == 1) {
                disciplins[0] = Disciplin.CRAWL;
            }
            if (userChoices[i] == 2) {
                disciplins[1] = Disciplin.RYGCRAWL;
            }
            if (userChoices[i] == 3) {
                disciplins[2] = Disciplin.BRYST;
            }
            if (userChoices[i] == 4) {
                disciplins[3] = Disciplin.BUTTERFLY;
            }
        }
        return disciplins;
    }
    */
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
