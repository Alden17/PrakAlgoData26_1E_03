package Minggu2;

public class MataKuliah {

    String KodeMk;
    String nama;
    int SKS;
    int jumlahjam;

    public MataKuliah(String Kode, String nm, int sks, int jam){
        KodeMk = Kode;
        nama = nm;
        this.SKS = sks;
        this.jumlahjam = jam;
    }

    void tampilInformasi() {
        System.out.println("kode MK     : " + KodeMk);
        System.out.println("Nama        : " + nama);
        System.out.println("Jumlah SKS  : " + SKS);
        System.out.println("Jumlah Jam  : " + jumlahjam);
        System.out.println("================================");
    }

    void ubahSKS(int sksBaru) {
        SKS = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + SKS);
    }

    void tambahjam(int jam) {
        jumlahjam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahjam);
    }

    void kurangiJam(int jam) {
        if (jumlahjam >= jam) {
            jumlahjam -= jam;
        } else {
            System.out.println("Pengurangan tidak bisa dilakukan, jam tidak mencukupi!");
        }
    }
}