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
public class Lokomotywa extends Maszyna {

    private boolean czyRadziecka;
    private int maxLiczbaWagonow;

    public Lokomotywa(
            String marka,
            String nazwa,
            int pojemnoscSilnika,
            String rodzajSilnika,
            boolean czyRadziecka,
            int maxLiczbaWagonow
    ) {
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        super.rodzajSilnika = rodzajSilnika;
        this.czyRadziecka = czyRadziecka;
        this.maxLiczbaWagonow = maxLiczbaWagonow;
    }

    @Override
    public void wyswietl() {
        System.out.printf("Marka: %s\n"
                + "Nazwa: %s\n"
                + "Pojemnosc silnika: %d\n"
                + "Rodzaj silnika: %s\n"
                + "Czy Radziecka: %s\n"
                + "Max wagonow: %d\n\n",
                this.marka,
                this.nazwa,
                this.pojemnoscSilnika,
                this.rodzajSilnika,
                this.czyRadziecka ? "Radziecka" : "Nie radziecka",
                this.maxLiczbaWagonow);

    }
}

