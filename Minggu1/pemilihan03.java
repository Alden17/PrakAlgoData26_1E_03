package Minggu1;

import java.util.Scanner;

public class pemilihan03 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        double nilaiSetara;
        String nilaiHuruf; 

        System.out.println("Program Menghitung NIlai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = alden.nextInt();
        System.out.print("Kuis: ");
        int kuis = alden.nextInt();
        System.out.print("UTS: ");
        int uts = alden.nextInt();
        System.out.print("UAS: ");
        int uas = alden.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100 || tugas < 0 || kuis < 0 || uts < 0 || uas < 0 ) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");
        }else {
            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            
            if (nilaiAkhir >= 80 ) {
                nilaiHuruf = "A";
                nilaiSetara = 4;
            }else if (nilaiAkhir >= 73 ) {
                nilaiHuruf = "B+";
                nilaiSetara = 3.5;
            }else if (nilaiAkhir >= 65 ) {
                nilaiHuruf = "B";
                nilaiSetara = 3;
            }else if (nilaiAkhir >= 60 ) {
                nilaiHuruf = "C+";
                nilaiSetara = 2.5;
            }else if (nilaiAkhir >= 50 ) {
                nilaiHuruf = "C";
                nilaiSetara = 2;
            }else if (nilaiAkhir >= 39 ) {
                nilaiHuruf = "D";
                nilaiSetara = 1;
            }else {
                nilaiHuruf = "E";
                nilaiSetara = 0 ;
            }
            
            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");

            if (nilaiHuruf.equalsIgnoreCase("D") || nilaiHuruf.equalsIgnoreCase("E")) {
                System.out.println("ANDA TIDAK LULUS");
            }else{
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
    }
}
