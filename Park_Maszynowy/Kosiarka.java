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


public class Kosiarka extends Maszyna {

    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(
            String marka,
            String nazwa,
            int pojemnoscSilnika,
            String rodzajSilnika,
            boolean czyMelekser,
            boolean czyNaped,
            int liczbaOstrzy
    ) {
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        super.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    @Override
    public void wyswietl() {
        System.out.printf("Marka: %s\n"
                + "Nazwa: %s\n"
                + "Pojemnosc silnika: %d\n"
                + "Rodzaj silnika: %s\n"
                + "Rodzaj napędu: %s\n"
                + "Czy Meleks: %s\n"
                + "Liczba ostrzy: %d\n\n",
                this.marka,
                this.nazwa,
                this.pojemnoscSilnika,
                this.rodzajSilnika,
                this.czyNaped ? "Na paliwo" : "Kabel",
                this.czyMelekser ? "Tak" : "Nie",
                this.liczbaOstrzy);
    }

    public boolean isCzyMelekser() {
        return czyMelekser;
    }

}
