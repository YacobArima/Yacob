/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainLatihanD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        /*Program untuk menginputkan nama  */
        System.out.print("Masukan nama : ");
        String nama = input.nextLine();
        
        /*Program untuk menginputkan no plg*/
        System.out.print("Masukan no plg : ");
        String noplg = input.nextLine();
        
        /*Program untuk menginputkan pemakaian Air*/
        System.out.print("Pemakaian : ");
        double pemakaian = input.nextDouble();
         
        LatihanD pigi = new LatihanD (nama, noplg, pemakaian);
        pigi.perhitunganbiaya();
        pigi.print();
        
    }
}
