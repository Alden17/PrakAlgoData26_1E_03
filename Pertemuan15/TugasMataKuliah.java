package Pertemuan15;

public class TugasMataKuliah {
    String kode;
    String nama;
    int sks;

    public TugasMataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }
}