/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan17.programtunjangan;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 * 
 */
public class Tunjangan {

    String status;
    double gajiPokok;
    
    public void dataPegawai(){
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("=====Program Tunjangan=====");
        
        System.out.print("Berapa Gaji Pokok Anda perbulan? : Rp. ");
        gajiPokok = masuk.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t : ");
        status = masuk.nextLine();
        status = masuk.nextLine();
    }
    public void Proses(){
        double tunjangan;
        double total;
        DecimalFormat satuan = new DecimalFormat("0.00");
        
        tunjangan = status.equals("Menikah")?0.35*gajiPokok : 0;
        total = tunjangan + gajiPokok;
        
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok \t\t: Rp. " + satuan.format(gajiPokok));
        System.out.println("Tunjangan \t\t: Rp. " + satuan.format(tunjangan));
        System.out.println("Total Gaji \t\t: Rp. " + satuan.format(total));
        System.out.println("Developed by : Rizki Restu Illahi");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan Hasil = new Tunjangan();
        Hasil.dataPegawai();
        Hasil.Proses();
        
       
    
}
}    
