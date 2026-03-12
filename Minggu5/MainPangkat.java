package Minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = alden.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" +(i+1) + ": ");
            int basis = alden.nextInt();
            System.out.print("Masukkan pangkat basis elemen ke-" +(i+1) + ": ");
            int pangkat = alden.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+ "^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
