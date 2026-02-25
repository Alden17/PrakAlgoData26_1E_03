package Minggu2;

public class MataKuliahMain {
    public static void main(String[] args) {

        MataKuliah mk1 = new MataKuliah("ASD", "Algoritma dan Struktur Data", 3, 6);
        MataKuliah mk2 = new MataKuliah("BD", "Basis Data", 3, 6);

        System.out.println("=== Data Mata Kuliah 1 ===");
        mk1.tampilInformasi();

        System.out.println("=== Data Mata Kuliah 2 ===");
        mk2.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahjam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        mk2.ubahSKS(2);
        mk2.tambahjam(1);
        mk2.kurangiJam(10);
        mk2.tampilInformasi();
    }
}