/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.air;

/**
 *
 * @author user
 */

public class LatihanC {
  String nama;
  String progdi;
  double nilai; 
  String huruf;

  public LatihanC(String n, String p, double nil) {
    nama = n;
    progdi = p;
    nilai = nil;
    huruf = "";
  }

  public void hitungnilai() {
    if (nilai  >= 85 && nilai <= 100){
      huruf = "A";
   }else if(nilai >= 70 && nilai <= 85){
       huruf = "B";
   }else if (nilai >= 60 && nilai <= 70){
       huruf = "C";
   }else if (nilai >= 50 && nilai <= 60){
       huruf = "D";
   }else{
       huruf = "E";
   }
  }
  
  public void print(){
      System.out.println("Huruf : "+ huruf);
  }
}