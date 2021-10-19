/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasilpenjualan;

/**
 *
 * @author Kandang
 */
class JenisBarang{
protected String kodeJenis, namaJenis;
    public JenisBarang(String kdJenis, String nmJenis){
      this.kodeJenis = kdJenis;
      this.namaJenis = nmJenis;
    }
    
    public String tampilBarangJenis(){
        System.out.println("Kode Jenis : " + kodeJenis);
        System.out.println("Nama Jenis : " + namaJenis);
        return("");
    }
}
    class Barang extends JenisBarang{
        protected String kdBarang, nmBarang;
        protected long harga;
        
    public Barang(String kdBarang, String nmBarang, String kdJenis, String nmJenis, long harga){
        super(kdJenis, nmJenis);
        this.kdBarang = kdBarang;
        this.nmBarang = nmBarang;
    }
    
    public String tampilBarang(){
        System.out.println("Kode Barang : " + kdBarang);
        System.out.println("Nama Barang : " + nmBarang);
        super.tampilBarangJenis();
        System.out.println("Harga : " + harga);
        return("");
    }
    }
    
    class PenjualanBarang extends Barang{
        protected String bulan;
        protected int nomorTransaksi, tanggal, tahun;
        
        public PenjualanBarang(int notrans, int tgl, String bln, int thn, String kdBarang, String nmBarang, String kdJenis, String nmJenis, long harga){
            super(kdBarang, nmBarang, kdJenis, nmJenis, harga);
            this.nomorTransaksi = notrans;
            this.tanggal = tgl;
            this.bulan = bln;
            this.tahun = thn;
        }
        
        public String tampilPenjualanBarang(){
            System.out.println("No. Transaksi : " + nomorTransaksi);
            System.out.println("Tanggal : " + tanggal + "/" + bulan + "/" + tahun);
            super.tampilBarang();
            return("");
        }
    }
    
    class PenjualanBarangDetail extends PenjualanBarang{
        private String idJual;
        private long jumlah;
        
        public PenjualanBarangDetail(String idJual, int notrans, int tgl, String bln, int thn, String kdBarang, String nmBarang, String kdJenis, String nmJenis, long harga, long jumlah){
            super(notrans, tgl, bln, thn, kdBarang, nmBarang, kdJenis, nmJenis, harga);
            this.idJual = idJual;
            this.jumlah = jumlah;
        }
        
        public String tampilPenjualanBarangDetail(){
            System.out.println("id Jual : " + idJual);
            super.tampilPenjualanBarang();
            System.out.println("Jumlah : " + jumlah);
            return("");
        }
    }
public class HasilPenjualan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang[] barang  = new Barang[1];
        PenjualanBarang[] penjualanBarang = new PenjualanBarang[1];
        PenjualanBarangDetail[] penjualanBarangDetail = new PenjualanBarangDetail[1];
        barang[0] = new Barang("B001", "SAMSUNG 80 GB 7200 P-ATA", "J07", "HP", 406000);
        penjualanBarangDetail[0] = new PenjualanBarangDetail("TR", 001, 11, "Februari", 2014, "B001", "SAMSUNG 80 GB 7200 P-ATA", "HP", "J07" ,406000, 1);
                
        for(int i=0; i<0; i++){
            System.out.println("=====================================================");
            System.out.println(barang[i].tampilBarang());
            System.out.println(penjualanBarang[i].tampilPenjualanBarang());
            System.out.println(penjualanBarangDetail[i].tampilPenjualanBarangDetail());
            System.out.println("=====================================================");
        }
    }
    
}
