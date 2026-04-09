

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int pilihan;

        Mahasiswa03[] mhs = {
                new Mahasiswa03("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa03("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa03("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // === Data Buku ===
        Buku03[] buku = {
                new Buku03("B001", "Algoritma", 2020),
                new Buku03("B002", "Basis Data", 2019),
                new Buku03("B003", "Pemrograman", 2021),
                new Buku03("B004", "Fisika", 2024)
        };

        // === Data Peminjaman ===
        Peminjaman03[] pinjam = {
                new Peminjaman03(mhs[0], buku[0], 7), 
                new Peminjaman03(mhs[1], buku[1], 3), 
                new Peminjaman03(mhs[2], buku[2], 10),
                new Peminjaman03(mhs[2], buku[3], 6),
                new Peminjaman03(mhs[0], buku[1], 4)
        };

        // Hitung denda
        for (int i = 0; i < pinjam.length; i++) {
            pinjam[i].hitungDenda();
        }
        // Menu
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = alden.nextInt();

            switch (pilihan) {
                // Menampilkan Mahasiswa
                case 1:
                    for (Mahasiswa03 m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    // Menampilkan Buku
                    for (Buku03 b : buku) {
                        b.tampilBuku();
                    }
                    break;

                case 3:
                    // Menampilkan Peminjaman
                    for (Peminjaman03 p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 4:
                    // Mengurutkan dari yang terbesar menggunakan bubble short
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman03 temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");

                    for (Peminjaman03 p : pinjam) {
                        System.out.println(
                                p.mhs.nama + " | " +
                                        p.buku.judul + " | " +
                                        "Lama: " + p.lamaPinjam + " | " +
                                        "Terlambat: " + p.terlambat + " | " +
                                        "Denda: " + p.denda);
                    }
                    break;

                case 5:
                    // Searching berdasarkan NIM
                    System.out.print("Masukkan NIM: ");
                    String cari = alden.next();
                    boolean ketemu = false;

                    for (Peminjaman03 p : pinjam) {
                        if (p.mhs.nim.equals(cari)) {
                            p.tampilPeminjaman();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 0:
                    
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

    }
}
