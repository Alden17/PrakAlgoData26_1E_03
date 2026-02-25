package Minggu2;

public class DosenMain {
    public static void main(String[] args) {

        Dosen dsn1 = new Dosen();
        dsn1.idDosen = "RPL";
        dsn1.nama = "Andi Pratama";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2012;
        dsn1.bidangKeahlian = "Rekayasa Perangkat Lunak";

        System.out.println("Data Dosen 1");
        dsn1.tampilInformasi();

        dsn1.ubahStatus(false);
        dsn1.hitungMasaKerja(2026);
        dsn1.ubahKeahlian("Kecerdasan Buatan");
        dsn1.tampilInformasi();


        Dosen dsn2 = new Dosen(
                "JST",
                "Dewi Lestari",
                true,
                2018,
                "Jaringan Komputer"
        );

        System.out.println("\nData Dosen 2");
        dsn2.tampilInformasi();

        dsn2.ubahStatus(true);
        dsn2.hitungMasaKerja(2026);
        dsn2.ubahKeahlian("Keamanan Siber");
        dsn2.tampilInformasi();
    }
}