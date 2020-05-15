package com.Mikkel;

import java.util.ArrayList;

public class Hold {
    ArrayList<Svømmer> ungdomsHoldet = new ArrayList<>();
    ArrayList<Svømmer> seniorHoldet = new ArrayList<>();

    public void addSvømmerTilHold(Svømmer s){
        if (!s.erMotionist() && s.calculateAge(s.getFødselsdag()) > 17) {
            seniorHoldet.add(s);
        }
        if (!s.erMotionist() && s.calculateAge(s.getFødselsdag()) < 18){
            ungdomsHoldet.add(s);
        }
    }
}
