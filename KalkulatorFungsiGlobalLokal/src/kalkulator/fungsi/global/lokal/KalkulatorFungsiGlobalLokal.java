/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.fungsi.global.lokal;

/**
 *
 * @author Kandang
 */

import java.util.*;

public class KalkulatorFungsiGlobalLokal {

    static int hasil;
    
    static void jumlah1(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        hasil = nilai1 + nilai2;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void jumlah2(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, nilai3;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga : ");
        nilai3 = input.nextInt();
        hasil = nilai1 + nilai2 + nilai3;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void jumlah3(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, nilai3, nilai4;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga : ");
        nilai3 = input.nextInt();
        System.out.print("Masukkan nilai keempat : ");
        nilai4 = input.nextInt();
        hasil = nilai1 + nilai2 + nilai3 + nilai4;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void kurang1(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        hasil = nilai1 - nilai2;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void kurang2(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, nilai3;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga : ");
        nilai3 = input.nextInt();
        hasil = nilai1 - nilai2 - nilai3;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void kurang3(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, nilai3, nilai4;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga : ");
        nilai3 = input.nextInt();
        System.out.print("Masukkan nilai keempat : ");
        nilai4 = input.nextInt();
        hasil = nilai1 - nilai2 - nilai3 - nilai4;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void kali1(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        hasil = nilai1 * nilai2;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void kali2(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, nilai3;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga : ");
        nilai3 = input.nextInt();
        hasil = nilai1 * nilai2 * nilai3;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void kali3(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, nilai3, nilai4;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga : ");
        nilai3 = input.nextInt();
        System.out.print("Masukkan nilai keempat : ");
        nilai4 = input.nextInt();
        hasil = nilai1 * nilai2 * nilai3 * nilai4;
        System.out.println("Hasilnya adalah " + hasil);
    }
        
    static void bagi1(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        hasil = nilai1 / nilai2;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void bagi2(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, nilai3;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga : ");
        nilai3 = input.nextInt();
        hasil = nilai1 / nilai2 / nilai3;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    static void bagi3(){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, nilai3, nilai4;
        
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga : ");
        nilai3 = input.nextInt();
        System.out.print("Masukkan nilai keempat : ");
        nilai4 = input.nextInt();
        hasil = nilai1 / nilai2 / nilai3 / nilai4;
        System.out.println("Hasilnya adalah " + hasil);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opsi1, opsi2;
        
        System.out.println("Kalkulator Fungsi Global Lokal" + "\n");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.print("Masukkan pilihan : ");
        opsi1 = input.nextInt();
        
        switch(opsi1){
            case 1:
                System.out.println("Penjumlahan" + "\n");
                System.out.println("1. Penjumlahan dua nilai");
                System.out.println("2. Penjumlahan tiga nilai");
                System.out.println("3. Penjumlahan empat nilai");
                System.out.print("Masukkan pilihan : ");
                opsi2 =input.nextInt();
                
                if(opsi2==1){
                    jumlah1();
                } else if(opsi2==2){
                    jumlah2();
                } else if(opsi2==3){
                    jumlah3();
                }
                break;
            case 2:
                System.out.println("Pengurangan" + "\n");
                System.out.println("1. Pengurangan dua nilai");
                System.out.println("2. Pengurangan tiga nilai");
                System.out.println("3. Pengurangan empat nilai");
                System.out.print("Masukkan pilihan : ");
                opsi2 =input.nextInt();
                
                if(opsi2==1){
                    jumlah1();
                } else if(opsi2==2){
                    jumlah2();
                } else if(opsi2==3){
                    jumlah3();
                }
                break;
            case 3:
                System.out.println("Perkalian" + "\n");
                System.out.println("1. Perkalian dua nilai");
                System.out.println("2. Perkalian tiga nilai");
                System.out.println("3. Perkalian empat nilai");
                System.out.print("Masukkan pilihan : ");
                opsi2 =input.nextInt();
                
                if(opsi2==1){
                    jumlah1();
                } else if(opsi2==2){
                    jumlah2();
                } else if(opsi2==3){
                    jumlah3();
                }
                break;
            case 4:
                System.out.println("Pembagian" + "\n");
                System.out.println("1. Pembagian dua nilai");
                System.out.println("2. Pembagian tiga nilai");
                System.out.println("3. Pembagian empat nilai");
                System.out.print("Masukkan pilihan : ");
                opsi2 =input.nextInt();
                
                if(opsi2==1){
                    jumlah1();
                } else if(opsi2==2){
                    jumlah2();
                } else if(opsi2==3){
                    jumlah3();
                }
                break;
            default:
                break;
        }
    }
}
