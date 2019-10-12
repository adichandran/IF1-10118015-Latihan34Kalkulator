/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan34kalkulator;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program kalkulator sederhana
 */
public class IF110118015Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        kalkulator mykalkulator = new kalkulator();
        
        System.out.println("=== Aplikasi Kalkulator Bilangan ===");
        System.out.print("Masukan Angka Ke-1 : ");
        mykalkulator.value1 = input.nextDouble();
        System.out.print("Masukan Angka Ke-1 : ");
        mykalkulator.value2 = input.nextDouble();
        System.out.println();
        System.out.println("Hasil Pertambahan : " + mykalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + mykalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian   : " + mykalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian   : " + mykalkulator.bagiBilangan());
        System.out.println("Hasil Sisa        : " + mykalkulator.sisaBilangan());
    }
    
}
