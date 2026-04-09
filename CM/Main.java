package CM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int pilihan;

        Mahasiswa[] mhs = {
                new Mahasiswa("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // === Data Buku ===
        Buku[] buku = {
                new Buku("B001", "Algoritma", 2020),
                new Buku("B002", "Basis Data", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024)
        };

        // === Data Peminjaman ===
        Peminjaman[] pinjam = {
                new Peminjaman(mhs[0], buku[0], 7), 
                new Peminjaman(mhs[1], buku[1], 3), 
                new Peminjaman(mhs[2], buku[2], 10),
                new Peminjaman(mhs[2], buku[3], 6),
                new Peminjaman(mhs[0], buku[1], 4)
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
                    for (Mahasiswa m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    // Menampilkan Buku
                    for (Buku b : buku) {
                        b.tampilBuku();
                    }
                    break;

                case 3:
                    // Menampilkan Peminjaman
                    for (Peminjaman p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 4:
                    // Mengurutkan dari yang terbesar menggunakan bubble short
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");

                    for (Peminjaman p : pinjam) {
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

                    for (Peminjaman p : pinjam) {
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
