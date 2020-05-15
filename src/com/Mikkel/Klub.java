package com.Mikkel;

import java.util.ArrayList;

public class Klub {
    ArrayList<Svømmer> ungdomsHoldet = new ArrayList<>();
    ArrayList<Svømmer> seniorHoldet = new ArrayList<>();
    ArrayList<Svømmer> alleSvømmere = new ArrayList<>();


    public void fordelSvømmerePåHold() {
        for (int i = 0; i < alleSvømmere.size(); i++) {
            if (!alleSvømmere.get(i).erMotionist() && alleSvømmere.get(i).calculateAge(alleSvømmere.get(i).getFødselsdag()) > 17) {
                seniorHoldet.add(alleSvømmere.get(i));
            }
            if (!alleSvømmere.get(i).erMotionist() && alleSvømmere.get(i).calculateAge(alleSvømmere.get(i).getFødselsdag()) < 18) {
                ungdomsHoldet.add(alleSvømmere.get(i));
            }
        }
    }



}
