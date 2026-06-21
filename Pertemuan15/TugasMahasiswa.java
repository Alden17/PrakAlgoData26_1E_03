package Pertemuan15;

public class TugasMahasiswa {
    String nim;
    String nama;
    String notelp;

    public TugasMahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getNotelp() { return notelp; }
}
