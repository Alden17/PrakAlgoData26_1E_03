package Pertemuan12;

import java.util.Scanner;

public class TugasMain03 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        TugasLinkedList03 antrian = new TugasLinkedList03();
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Jumlah Mahasiswa Mengantri");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = alden.nextInt();
            alden.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = alden.nextLine();
                    System.out.print("Nama  : ");
                    String nama = alden.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = alden.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = alden.nextDouble();
                    alden.nextLine();
                    antrian.enqueue(new MahasiswaTugas03(nim, nama, kelas, ipk));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.lihatTerakhir();
                    break;
                case 5:
                    antrian.jumlahAntrian();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian KOSONG." : "Antrian tidak kosong.");
                    break;
                case 7:
                    System.out.println(antrian.isFull() ? "Antrian PENUH."
                            : "Antrian belum penuh (" + antrian.size + "/" + antrian.max + ").");
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
