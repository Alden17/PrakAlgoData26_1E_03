package Minggu2;

public class DosenMain {
    public static void main(String[] args) {

        Dosen dsn1 = new Dosen();
        dsn1.idDosen = "BDS";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Algoritma dan Struktur Data";

        System.out.println("Data Dosen 1");
        dsn1.tampilInformasi();

        System.out.println("\nMengubah Status");
        dsn1.ubahStatus(false);

        System.out.println("\nMenghitung Masa Kerja");
        dsn1.hitungMasaKerja(2026);

        System.out.println("\nMengubah Bidang Keahlian");
        dsn1.ubahKeahlian("Basis Data");

        System.out.println("\nData Dosen 1 Setelah Diubah");
        dsn1.tampilInformasi();

        Dosen dsn2 = new Dosen("STR", "Siti Rahayu", true, 2015, "Matematika");

        System.out.println("\nData Dosen 2");
        dsn2.tampilInformasi();

        System.out.println("\nMengubah Status");
        dsn2.ubahStatus(false);

        System.out.println("\nMenghitung Masa Kerja");
        dsn2.hitungMasaKerja(2026);

        System.out.println("\nMengubah Bidang Keahlian");
        dsn2.ubahKeahlian("Machine Learning");

        System.out.println("\nData Dosen 2 Setelah Diubah");
        dsn2.tampilInformasi();
    }
}