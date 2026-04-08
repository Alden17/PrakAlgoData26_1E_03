package Praktikum05;

import java.util.Scanner;

public class DosenMain03 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        DataDosen03 datDos = new DataDosen03();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM PENGELOLAAN DATA DOSEN ===");
            System.out.println("1. Input Data Dosen Baru");
            System.out.println("2. Lihat Daftar Dosen");
            System.out.println("3. Urutkan Usia (Bubble Sort - Muda ke Tua)");
            System.out.println("4. Urutkan Usia (Selection Sort - Tua ke Muda)");
            System.out.println("5. Urutkan Usia (Insertion Sort - Muda ke Tua)");
            System.out.println("0. Keluar dari Program");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = alden.nextInt();
            alden.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen   : ");
                    String kode = alden.nextLine();
                    System.out.print("Masukkan Nama Dosen   : ");
                    String nama = alden.nextLine();
                    System.out.print("Jenis Kelamin (L/P)   : ");
                    String jkInput = alden.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Masukkan Usia         : ");
                    int usia = alden.nextInt();
                    alden.nextLine();
                    datDos.tambah(new Dosen03(kode, nama, jk, usia));
                    System.out.println(">> Data dosen berhasil disimpan!");
                    break;

                case 2:
                    System.out.println("\n>> Menampilkan seluruh data dosen");
                    datDos.tampil();
                    break;

                case 3:
                    datDos.sortingASC();
                    System.out.println("\n>> Data dosen setelah diurutkan (termuda ke tertua)");
                    datDos.tampil();
                    break;

                case 4:
                    datDos.sortingDSC();
                    System.out.println("\n>> Data dosen setelah diurutkan (tertua ke termuda)");
                    datDos.tampil();
                    break;

                case 5:
                    datDos.insertionSort();
                    System.out.println("\n>> Data dosen setelah insertion sort (termuda ke tertua)");
                    datDos.tampil();
                    break;

                case 0:
                    System.out.println("Program dihentikan. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia, silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}