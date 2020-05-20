package ui;

import Controller.*;

import java.lang.String;
import java.time.LocalDate;
import java.util.Scanner;

public class UI {
    private Scanner input = new Scanner(System.in);
    // private Controller controller = new Controller();


    public Svømmer promptTilOprettelseAfSvømmer() {

        try {
            System.out.print("Indtast navn: ");
            java.lang.String navn = input.nextLine();

            System.out.print("Indtast fødselsdato (format: yyyy-mm-dd): ");
            java.lang.String fødselsdag = input.nextLine();

            System.out.print("Indtast adresse: ");
            java.lang.String adresse = input.nextLine();

            System.out.print("Aktivt eller passivt medlem? (indtast Aktiv/Passiv): ");
            java.lang.String aktivitetsform = input.nextLine();

            System.out.println("Tast 1 for Motionist \nTast 2 for Konkurrencesvømmer");
            String medlemskabsType = "";
            int choice = input.nextInt();
            if (choice == 1){
                medlemskabsType  = "Motionist";
                Svømmer nySvømmer = new Svømmer(navn, LocalDate.parse(fødselsdag), adresse, aktivitetsform, medlemskabsType);
                System.out.println("Svømmer oprettet\n");
                return nySvømmer;

            } else if (choice == 2 ) {
                String[] disciplins = promptIndledendeDisciplinValg();
                Svømmer nySvømmer = new Svømmer(navn, LocalDate.parse(fødselsdag), adresse, aktivitetsform, disciplins);
                //Her skal bruger promptes til muligheden for at tilføje flere discipliner. Hvis brugeren ønsker det, skal de
                //tilføjes via tilføjDisciplin() i KonkurrenceSvømmer--klassen
                System.out.println("Svømmer oprettet");
                return nySvømmer;
            }

            return null;

        } catch (Exception e) {
            System.out.println("Noget gik galt. Tast igen");
            promptTilOprettelseAfSvømmer();
        }


        return null;
    }

    public String[] promptIndledendeDisciplinValg() {
        String[] chosenDisciplins = new String[4];
        System.out.println("1. Crawl // 2. Rygcrawl // 3. Bryst // 4. Butterfly:");
        System.out.print("Indtast disciplin:");
        switch (input.nextInt()) {
            case 1:
                chosenDisciplins[0] = "Crawl";
                break;
            case 2:
                chosenDisciplins[1] = "Rygcrawl";
                break;
            case 3:
                chosenDisciplins[2] = "Bryst";
                break;
            case 4:
                chosenDisciplins[3] = "Butterfly";
                break;

        }

        return chosenDisciplins;
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

    public void uiText(java.lang.String text) {

        System.out.println(text);
    }

    /*
    public String getInput(String string) {
        string = userChosenMenu();
        return string;
    }

     */
}
