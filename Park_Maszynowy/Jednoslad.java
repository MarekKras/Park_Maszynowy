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

    public class Jednoslad extends Pojazd {

    private String typ;
    
    public Jednoslad(
            String marka,
            String nazwa,
            int pojemnoscSilnika,
            String rodzajSilnika,
            int moc,
            int momentObrotowy,
            String typ
    ) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typ = typ;

    }
    
    @Override
    public void wyswietl() {
        System.out.println(super.nrPojazdu);
        System.out.printf("Marka: %s\n"
                + "Nazwa: %s\n"
                + "Pojemnosc silnika: %d\n"
                + "Rodzaj silnika: %s\n"
                + "Moc silnika: %d\n"
                + "Moment obrotowy: %d\n\n",
                this.marka,
                this.nazwa,
                this.pojemnoscSilnika,
                this.rodzajSilnika,
                this.moc,
                this.momentObrotowy);

    }
    }


    
    
    