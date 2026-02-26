package Praktikum03;

public class MataKuliah03 {
   public String kode; 
   public String nama;
   public int sks;
   public int jumlahJam;
   public String ruang;

   public MataKuliah03(String kode,String nama, int sks, int jumlahJam){
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
   }

   void tambahData(String ruang){
    this.ruang = ruang;
   }

   void cetakInfo(){
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("Ruang      : " + ruang);
   }
}

