/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.lib.newpackage;

/**
 *
 * @author Marek
 */
import java.util.ArrayList;

public class ParkMaszynowy {

    public static void main(String[] args) {
        ArrayList<Maszyna> listaMaszyn = new ArrayList<Maszyna>();
        listaMaszyn.add(new Samochod("VW", "Andrzej", 2400, "Benzyna", 232, 1, "VW Benz", "3213"));
        listaMaszyn.add(new Samochod("Audi", "a5", 32, "Benzyna", 43, 321, "Audi a5", "43242"));
        listaMaszyn.add(new Jednoslad("Kawasaki", "Czerwony", 434, "Benzyna", 32, 323, "Motur"));
        listaMaszyn.add(new Jednoslad("Hundaj", "Niebieski", 43, "Diesel", 31, 314, "Rower"));
        listaMaszyn.add(new Lokomotywa("Ciuchcia", "Duża", 4324, "Parowy", false, 4));
        listaMaszyn.add(new Lokomotywa("Pendolino", "Szybki", 4324, "Elektryczny", true, 43));
        listaMaszyn.add(new Kosiarka("Ręczna", "Mała", 3424, "Elektryczna", true, false, 43));
        listaMaszyn.add(new Kosiarka("Spalinówka", "Olbrzym", 432, "Spalinowa", false, true, 4));

        for (Maszyna maszyna : listaMaszyn) {
            maszyna.wyswietl();
            if (maszyna instanceof Kosiarka && ((Kosiarka) maszyna).isCzyMelekser() == false) {
                ((Kosiarka) maszyna).setCzyMelekser(true);
                System.out.println("Dodany melekser\n");
                maszyna.wyswietl();
                Iterable<Maszyna> machiny = null;
                
                for (Maszyna konkretnaMaszyna : machiny) {
           if(konkretnaMaszyna instanceof Kosiarka)
               ((Kosiarka) konkretnaMaszyna).setLiczbaOstrzy(3);
            }
        }

    }
}
}
