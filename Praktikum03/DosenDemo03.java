package Praktikum03;

import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {

        Scanner alden = new Scanner(System.in);

        System.out.print("Masukkan jumlah Dosen: ");
        int jumlahDosen = alden.nextInt();
        alden.nextLine();

        Dosen03[] arrayOfDosen03 = new Dosen03[jumlahDosen];

        String kode, nama, jk;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen03.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode  : ");
            kode = alden.nextLine();

            System.out.print("Nama  : ");
            nama = alden.nextLine();

            System.out.print("Jenis Kelamin (P/W): ");
            jk = alden.nextLine();

            if (jk.equalsIgnoreCase("P")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.print("Usia  : ");
            usia = Integer.parseInt(alden.nextLine());

            System.out.println("------------------------------------");

            arrayOfDosen03[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }

        int no = 1;

        for (Dosen03 dosen : arrayOfDosen03) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode         : " + dosen.kode);
            System.out.println("Nama         : " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia         : " + dosen.usia);
            System.out.println("------------------------------------");
            no++;

        }
    }
}
