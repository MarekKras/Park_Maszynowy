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
public class Samochod extends Pojazd {

    private String model;
    private String Vin;

    public Samochod(
            String marka,
            String nazwa,
            int pojemnoscSilnika,
            String rodzajSilnika,
            int moc,
            int momentObrotowy,
            String model,
            String Vin
    ) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.model = model;
        this.Vin = Vin;
    }

    @Override
    public void wyswietl() {
        System.out.println(super.nrPojazdu);
        System.out.printf("Marka: %s\n"
                + "Nazwa: %s\n"
                + "Pojemnosc silnika: %d\n"
                + "Rodzaj silnika: %s\n"
                + "Model: %s\n"
                + "Vin: %s\n\n",
                this.marka,
                this.nazwa,
                this.pojemnoscSilnika,
                this.rodzajSilnika,
                this.model,
                this.Vin);

    }

}
