package ui;
import Controller.*;

import java.util.Scanner;

public class UI {
    Scanner input = new Scanner(System.in);

    public void promptTilOprettelseAfSvømmer(){

        System.out.print("Indtast navn: ");
        String navn = input.nextLine();
        System.out.println("");

        System.out.print("Indtast fødselsdato (format: yyyy-mm-dd): ");
        String fødselsdag = input.nextLine();
        System.out.println("");

        System.out.print("Indtast adresse: ");
        String adresse = input.nextLine();
        System.out.println("");

        System.out.print("Aktivt eller passivt medlem? (indtast Aktiv/Passiv): ");
        String aktivitetsform = input.nextLine();
        System.out.println("");

        System.out.print("Motionist eller konkurrencesvømmer? (indtast Motionist/Konkurrencesvømmer): ");
        String medlemskabsType = input.nextLine();
        System.out.println("");

        //Lav array som indeholder variablerne og send til opretSvømmer() i Controller-klassen



    }




}
