/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kendaraan;

/**
 *
 * @author user
 */

public class Kendaraan {
    private String nama;
    private String jenis;
    private int kecepatan;
    private final int bataskecepatan = 200;

    public Kendaraan(String nama, String jenis, int kecepatan) {
        this.nama = nama;
        this.jenis = jenis;
        this.kecepatan = kecepatan;
    }

    public void tambahKecepatan() {
        this.kecepatan += 15;
        if (this.kecepatan > bataskecepatan) {
            this.kecepatan = bataskecepatan;
            System.out.println("Anda telah mencapai batas maksimum kecepatan !!");
        }
    }

    public void kurangiKecepatan() {
        this.kecepatan -= 15;
        if(this.kecepatan <=0 ){
            System.out.print("Kendaraan telah berhenti");
        }
    }

    public void display() {
        System.out.println("Kendaraan: " + this.nama);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Kecepatan: " + this.kecepatan + " km/h");
    }
}
