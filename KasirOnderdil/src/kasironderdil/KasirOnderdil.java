/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kasironderdil;

/**
 *
 * @author Kandang
 */
import java.util.*;
public class KasirOnderdil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nama : Krisna Purnama");
        System.out.println("Kelas : XI-RPL");
        System.out.println("Mapel : PBO");
    
    // Deklarasi variable
        Scanner input = new Scanner(System.in);
        int table, jumlah, i=0;
        int[]harga_barang = {35000,29600,231000,159000,72600};
        double total_harga = 0;
        double total_bayar = 0;
        double kembalian, kurang;
        String[] nama_barang = {"Repsol Oli","Shock Absorber","Gear","TDR Roller CVT","Bando CVT Belt"};
    
    //Table Onderdil
        System.out.println("==================================================");
        System.out.println("      Selamat Datang di Toko Sparepart Motor      ");
        System.out.println("              Jln. Mayor Abdurakhman              ");
        System.out.println("==================================================\n\n");
        System.out.println("==================================================");
        System.out.println("   DAFTAR BARANG ONDERDIL MOTOR M. ABDURAKHMAN    ");
        System.out.println("==================================================");
        System.out.println("+ Kode Barang + Nama Barang   + Jumlah + Harga   +");
        System.out.println("| J001        | Repsol Oli    | 10     | 35.000  |");
        System.out.println("| J002        | Shock Absorber| 10     | 296.000 |");
        System.out.println("| J003        | Gear          | 10     | 231.000 |");
        System.out.println("| J004        | TDR Roller CVT| 10     | 159.000 |");
        System.out.println("| J005        | Bando CVT Belt| 10     | 72.600  |");
        System.out.println("+=============+===============+========+=========+");
        System.out.print("Masukkan onderdil yang dipesan : ");
        table = input.nextInt();
    
    //Switch untuk output onderdil yang dipesan
        switch(table){
            case 1:
            System.out.println("Repsol Oli");
            break;
            case 2:
            System.out.println("Shock Absorber");
            break;
            case 3:
            System.out.println("Gear");
            break;
            case 4:
            System.out.println("TDR Roller CVT");
            break;
            case 5:
            System.out.println("Bando CVT Belt");
            break;
        default:
            System.out.println("Onderdil yang anda pesan tidak tersedia.");
            break;
        }
        System.out.print("Masukkan jumlah onderdil yang dipesan : ");
        jumlah = input.nextInt();
    
    //If else untuk operator total harga barang dan jumlah barang
        if(table==1){
            total_harga = jumlah * harga_barang[0];
        }else if(table==2){
            total_harga = jumlah * harga_barang[1];
        }else if(table==3){
            total_harga = jumlah * harga_barang[2];
        }else if(table==4){
            total_harga = jumlah * harga_barang[3];
        }else if(table==5){
            total_harga = jumlah * harga_barang[4];
        }else{
            
        }
    
    //Pembayaran
        System.out.println("Total belanja yang harus dibayar " + total_harga);
        System.out.print("Silahkan bayar pesanan anda : Rp.");
        total_bayar = input.nextInt();
        
        while (total_bayar < total_harga){
            System.out.print("Saldo anda kurang, silahkan bayar ulang Rp.");
            kurang = input.nextInt();
            total_bayar += kurang;
        }
        kembalian = total_bayar - total_harga;
    
    //Struk Pembayaran
        System.out.println("\n\n  STRUK PEMBELIAN  ");
        System.out.println("Nama Barang : "+nama_barang[table-1]);
        System.out.println("Jumlah Barang : "+jumlah);
        System.out.println("Total Harga : Rp."+total_harga);
        System.out.println("Total Bayar : Rp."+total_bayar);
        System.out.println("Uang Kembali : Rp."+kembalian);
    }
    
}
