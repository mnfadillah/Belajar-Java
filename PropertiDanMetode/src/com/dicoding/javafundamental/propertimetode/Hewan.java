package com.dicoding.javafundamental.propertimetode;

public class Hewan {

    // properti atau fields
    // Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // Inisiasi memlalui konstruktor
    int umur;

    // Konstruktor dengan parameter
    Hewan(int umurParam) {
        this.umur = umurParam;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan(){
        System.out.println("Berjalan dengan pelan..");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut");
    }

    double getBerat() {
        return tinggi;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }
}