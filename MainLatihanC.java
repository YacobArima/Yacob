/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.air;
import java.util.Scanner;

/**
 *
 * @author user
 */

public class MainLatihanC {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System .out.print ("Nama : ");
    String nama = input.nextLine();
    
    System .out.print ("Progdi : ");
    String progdi = input.nextLine();
    
    System.out.print("Masukan nilai : " );
    double nilai = input.nextDouble();
    
    LatihanC pp = new LatihanC(nama, progdi, nilai);
    pp.hitungnilai();
    pp.print();
    input.close();
  }
}
