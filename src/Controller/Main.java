package Controller;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Test af svømmerklasse
        Svømmer svømmer = new Svømmer("Simon", LocalDate.of(1988, 9, 11), "P.D. Løvs Alle", "Aktiv", "Konkurrence");

        //demonstration af hvordan erMotionist() og harAktivtMedlemskab() kan bruges
        System.out.println(svømmer.erMotionist());
        System.out.println(!svømmer.erMotionist());
        System.out.println(svømmer.harAktivtMedlemskab());
        System.out.println(!svømmer.harAktivtMedlemskab());




        //Test af holdklasse
        Klub hold = new Klub();

        //virker ikke lige nu, men Kamma er lige vågnet :D
        hold.fordelSvømmerePåHold();

        System.out.println(hold.alleSvømmere.size());
        System.out.println(hold.seniorHoldet.size());
        System.out.println(hold.ungdomsHoldet.size());



    }
}
