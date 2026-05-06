package jobsheet9;

import java.util.Scanner;

public class SuratMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat03 stack = new StackSurat03(5);
        int pilih;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();

                    Surat03 s = new Surat03(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat03 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari: " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat03 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari: " + lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    if (stack.cariSurat(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;
            }

        } while (pilih != 5);
        sc.close();
    }       
}
