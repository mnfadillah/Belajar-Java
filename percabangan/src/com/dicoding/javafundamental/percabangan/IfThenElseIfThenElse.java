package com.dicoding.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args){
        int nilaiUjian = 80;
        char indekPrestasi;

        if (nilaiUjian >= 90) {
            indekPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indekPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indekPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indekPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indekPrestasi = 'E';
        } else {
            indekPrestasi = 'F';
        }
        System.out.println("Nilai ujian akhir anda adalah " + indekPrestasi);
    }
}
