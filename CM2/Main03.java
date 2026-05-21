package CM2;
import java.util.Scanner;

public class Main03 {

    static DaftarAntrian03 antrianPembeli = new DaftarAntrian03();
    static DaftarPesanan03 daftarPesanan = new DaftarPesanan03();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        antrianPembeli.tambahAntrian("Ainra", "08224500000");
        antrianPembeli.tambahAntrian("Danra", "08224511111");
        antrianPembeli.tambahAntrian("Sanri", "08224522222");

        int pilihan;

        do {

            tampilMenu();

            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            System.out.println();

            switch (pilihan) {

                case 1:

                    menuTambahAntrian();

                    break;

                case 2:

                    antrianPembeli.tampilAntrian();

                    break;

                case 3:

                    menuPesanan();

                    break;

                case 4:

                    daftarPesanan.tampilLaporan();

                    break;

                case 0:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Pilihan tidak tersedia.");
            }

            System.out.println();

        } while (pilihan != 0);
    }

    static void tampilMenu() {

        System.out.println("=================================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("=================================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Input Pesanan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
    }

    static void menuTambahAntrian() {

        System.out.print("Nama Pembeli : ");
        String nama = input.nextLine();

        System.out.print("No HP : ");
        String hp = input.nextLine();

        antrianPembeli.tambahAntrian(nama, hp);
    }

    static void menuPesanan() {

        if (antrianPembeli.kosong()) {

            System.out.println("Antrian kosong.");

            return;
        }

        NodePembeli03 pembeli = antrianPembeli.depan;

        System.out.println("Pembeli berikutnya : " + pembeli.namaPembeli);
        System.out.println("Nomor Antrian      : " + pembeli.nomorAntrian);

        System.out.println("\nInput Pesanan");

        System.out.print("Kode Menu : ");
        int kode = input.nextInt();
        input.nextLine();

        System.out.print("Nama Menu : ");
        String namaMenu = input.nextLine();

        System.out.print("Harga : ");
        int harga = input.nextInt();
        input.nextLine();

        NodePembeli03 keluar = antrianPembeli.hapusAntrian();

        daftarPesanan.tambahPesanan(kode, namaMenu, harga, keluar.namaPembeli);

        System.out.println(keluar.namaPembeli + " berhasil memesan " + namaMenu);
    }
}
