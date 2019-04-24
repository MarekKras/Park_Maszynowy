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
public class Pojazd extends Maszyna {

    protected static int maxLiczbaPojazdow;
    protected int moc;
    protected int momentObrotowy;
    protected int nrPojazdu =1;

    public Pojazd(
            String marka,
            String nazwa,
            int pojemnoscSilnika,
            String rodzajSilnika,
            int moc,
            int momentObrotowy
    ) {
        
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        this.nrPojazdu = ++maxLiczbaPojazdow;
    }

    @Override
    public void wyswietl(){
        
        this.wyswietl();
    }
    

}

