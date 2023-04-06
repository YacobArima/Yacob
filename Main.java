/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama kendaraan: ");
        String nama = input.nextLine();
        System.out.print("Jenis kendaraan: ");
        String jenis = input.nextLine();
        System.out.print("Masukkan kecepatan awal kendaraan: ");
        int kecepatan = input.nextInt();
        Kendaraan kendaraan = new Kendaraan(nama, jenis, kecepatan);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah kecepatan");
            System.out.println("2. Kurangi kecepatan");
            
            System.out.print("\nSilahkan Pilih: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    kendaraan.tambahKecepatan();
                    kendaraan.display();
                    break;
                case 2:
                    kendaraan.kurangiKecepatan();
                    kendaraan.display();
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    break;
            }
        } while (pilihan != 2);
    }
}

