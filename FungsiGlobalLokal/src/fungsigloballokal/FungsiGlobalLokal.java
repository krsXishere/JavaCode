/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsigloballokal;

/**
 *
 * @author Kandang
 */
public class FungsiGlobalLokal {
    static String nama = "Krisna Purnama";
    static String kelas = "XI-RPL";
    
    //Variable Lokal
    
    static void lokal(){
        String nama = "Ikis";
        
        //Panggil variable global di dalam fungsi lokal
        System.out.println("Nama panggilan : " + nama);
        System.out.println("Kelas : " + kelas);
    }
    
    public static void main(String[] args) {
        //Panggil fungsi lokal
        lokal();
        
        System.out.println("Nama lengkap : " + nama);
        System.out.println("Kelas : " + kelas);
    }
    
}
