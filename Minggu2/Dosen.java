package Minggu2;

public class Dosen {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    int lamaKerja;
    String bidangKeahlian;

    public Dosen() {
    }

    public Dosen(String idDosen, String nama, boolean statusAktif,
        int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status          : " + (statusAktif ? "Aktif" : "Nonaktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("================================");
    }

    void ubahStatus(boolean statusBaru) {
        statusAktif = statusBaru;
        System.out.println("Status berhasil diubah menjadi " + (statusAktif ? "Aktif" : "Nonaktif"));
    }

    void hitungMasaKerja(int tahunSekarang) {
        lamaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa kerja: " + lamaKerja + " tahun");
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
        System.out.println("Keahlian diubah menjadi: " + bidangKeahlian);
    }
}