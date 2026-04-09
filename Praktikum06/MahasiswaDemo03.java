package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumMhs; i++) {
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

        list.tampil();

        System.out.println("----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------");

        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("----------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------------------");

        int posisi = list.findBinarySearch(cari, 0, 4);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}