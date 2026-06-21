package Pertemuan15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TugasMain {
    static List<TugasMahasiswa> daftarMahasiswa = new ArrayList<>();
    static List<TugasMataKuliah> daftarMataKuliah = new ArrayList<>();
    static List<TugasNilai> daftarNilai = new ArrayList<>();
    static Queue<String> antriHapus = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        daftarMahasiswa.add(new TugasMahasiswa("20001", "Thalhah", "021xxx"));
        daftarMahasiswa.add(new TugasMahasiswa("20002", "Zubair", "021xxx"));
        daftarMahasiswa.add(new TugasMahasiswa("20003", "Abdur-Rahman", "021xxx"));
        daftarMahasiswa.add(new TugasMahasiswa("20004", "Sa'ad", "021xxx"));
        daftarMahasiswa.add(new TugasMahasiswa("20005", "Sa'id", "021xxx"));
        daftarMahasiswa.add(new TugasMahasiswa("20006", "Ubaidah", "021xxx"));

        daftarMataKuliah.add(new TugasMataKuliah("00001", "Internet of Things", 3));
        daftarMataKuliah.add(new TugasMataKuliah("00002", "Algoritma dan Struktur Data", 2));
        daftarMataKuliah.add(new TugasMataKuliah("00003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new TugasMataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new TugasMataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));

        int pilih = 0;
        while (pilih != 6) {
            tampilMenu();
            System.out.print("Pilih    : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1: inputNilai(); break;
                case 2: tampilNilai(); break;
                case 3: cariNilai(); break;
                case 4: urutNilai(); break;
                case 5: hapusNilai(); break;
                case 6: System.out.println("Keluar..."); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void tampilMenu() {
        System.out.println("**********************************************");
        System.out.println("  SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("**********************************************");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Hapus Data Mahasiswa");
        System.out.println("6. Keluar");
        System.out.println("**********************************************");
    }

    static void inputNilai() {
        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("**********************************************");
        System.out.printf("%-10s %-15s %-10s%n", "NIM", "Nama", "Telf");
        for (TugasMahasiswa mhs : daftarMahasiswa) {
            System.out.printf("%-10s %-15s %-10s%n", mhs.getNim(), mhs.getNama(), mhs.getNotelp());
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = sc.nextLine();

        TugasMahasiswa mhsDipilih = null;
        for (TugasMahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                mhsDipilih = mhs;
                break;
            }
        }
        if (mhsDipilih == null) {
            System.out.println("Mahasiswa tidak ditemukan.");
            return;
        }

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("**********************************************");
        System.out.printf("%-8s %-40s %-5s%n", "Kode", "Mata Kuliah", "SKS");
        for (TugasMataKuliah mk : daftarMataKuliah) {
            System.out.printf("%-8s %-40s %-5d%n", mk.getKode(), mk.getNama(), mk.getSks());
        }
        System.out.print("Pilih MK by kode: ");
        String kode = sc.nextLine();

        TugasMataKuliah mkDipilih = null;
        for (TugasMataKuliah mk : daftarMataKuliah) {
            if (mk.getKode().equals(kode)) {
                mkDipilih = mk;
                break;
            }
        }
        if (mkDipilih == null) {
            System.out.println("Mata kuliah tidak ditemukan.");
            return;
        }

        System.out.print("Masukan data\nNilai    : ");
        double nilaiAngka = sc.nextDouble();
        sc.nextLine();

        daftarNilai.add(new TugasNilai(mhsDipilih, mkDipilih, nilaiAngka));
        System.out.println("Data nilai berhasil ditambahkan.");
    }

    static void tampilNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("**********************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-6s%n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (TugasNilai n : daftarNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %-6.2f%n",
                    n.mahasiswa.getNim(),
                    n.mahasiswa.getNama(),
                    n.mataKuliah.getNama(),
                    n.mataKuliah.getSks(),
                    n.nilai);
        }
    }

    static void cariNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("**********************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-6s%n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (TugasNilai n : daftarNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %-6.2f%n",
                    n.mahasiswa.getNim(),
                    n.mahasiswa.getNama(),
                    n.mataKuliah.getNama(),
                    n.mataKuliah.getSks(),
                    n.nilai);
        }
        System.out.print("Masukkan data mahasiswa[nim] :");
        String nim = sc.nextLine();

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("**********************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-6s%n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int totalSks = 0;
        for (TugasNilai n : daftarNilai) {
            if (n.mahasiswa.getNim().equals(nim)) {
                System.out.printf("%-10s %-15s %-40s %-5d %-6.2f%n",
                        n.mahasiswa.getNim(),
                        n.mahasiswa.getNama(),
                        n.mataKuliah.getNama(),
                        n.mataKuliah.getSks(),
                        n.nilai);
                totalSks += n.mataKuliah.getSks();
            }
        }
        System.out.println("Total SKS " + totalSks + " telah diambil.");
    }

    static void urutNilai() {
        Collections.sort(daftarNilai, (a, b) -> Double.compare(a.nilai, b.nilai));
        System.out.println("\nDAFTAR NILAI MAHASISWA (Ascending)");
        System.out.println("**********************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-6s%n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (TugasNilai n : daftarNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %-6.2f%n",
                    n.mahasiswa.getNim(),
                    n.mahasiswa.getNama(),
                    n.mataKuliah.getNama(),
                    n.mataKuliah.getSks(),
                    n.nilai);
        }
    }

static void hapusNilai() {
        if (daftarNilai.isEmpty()) {
            System.out.println("Data nilai kosong, tidak ada yang bisa dihapus.");
            return;
        }

        for (TugasNilai n : daftarNilai) {
            if (!antriHapus.contains(n.mahasiswa.getNim())) {
                antriHapus.add(n.mahasiswa.getNim());
            }
        }

        System.out.println("Antrian hapus: " + antriHapus);

        hapusDenganQueue();

        System.out.println("\nData setelah dihapus:");
        tampilNilai();
    }

    // Tugas No 2
    static void hapusDenganQueue() {
        String nimHapus = antriHapus.poll();

        if (nimHapus == null) {
            System.out.println("Antrian kosong, tidak ada yang bisa dihapus.");
            return;
        }

        daftarNilai.removeIf(n -> n.mahasiswa.getNim().equals(nimHapus));
        System.out.println("Data mahasiswa NIM " + nimHapus + " berhasil dihapus dari antrian.");
    }
}