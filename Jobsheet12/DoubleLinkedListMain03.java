package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain03 {
    static Mahasiswa03 inputMahasiswa(Scanner alden) {
        System.out.print("Masukkan NIM    : ");
        String nim = alden.nextLine();
        System.out.print("Masukkan Nama   : ");
        String nama = alden.nextLine();
        System.out.print("Masukkan Kelas  : ");
        String kelas = alden.nextLine();
        System.out.print("Masukkan IPK    : ");
        double ipk = alden.nextDouble();
        alden.nextLine();
        return new Mahasiswa03(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        DoubleLinkedList03 list = new DoubleLinkedList03();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = alden.nextInt();
            alden.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa03 mhsAwal = inputMahasiswa(alden);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa03 mhsAkhir = inputMahasiswa(alden);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNIM = alden.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa03 dataBaru = inputMahasiswa(alden);
                    list.insertAfter(keyNIM, dataBaru);
                    break;

                // case 4:
                //     list.removeFIrst();
                //     break;

                // case 5:
                //     list.removeLast();
                //     break;

                case 6:
                    list.print();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);
        alden.close();
    }    
}
