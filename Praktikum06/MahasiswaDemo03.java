package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.println("--------------------------");
            list.tambah(new Mahasiswa03(nim, nama, kelas, ipk));
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();

        System.out.println("======================================");
        System.out.println("Pencarian data");
        System.out.println("======================================");

        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        int posisi = list.sequentialSearching(cari);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}