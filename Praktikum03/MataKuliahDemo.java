package Praktikum03;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MataKuliah03[] arrayOfMatakuliah = new MataKuliah03[3];

        String kode, nama, dummy, ruang;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode        : ");
            kode = sc.nextLine();

            System.out.print("Nama        : ");
            nama = sc.nextLine();

            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.print("Ruang        : ");
            ruang = sc.nextLine();

            System.out.println("------------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah03(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah[i].tambahData(ruang);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
    }
}
