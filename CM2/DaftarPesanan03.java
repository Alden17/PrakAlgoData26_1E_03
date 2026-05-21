package CM2;

public class DaftarPesanan03 {
    NodePesanan03 awal;
    NodePesanan03 akhir;
    int jumlahPesanan;

    DaftarPesanan03() {
        awal = null;
        akhir = null;
        jumlahPesanan = 0;
    }

    void tambahPesanan(int kodeMenu, String namaMenu, int harga, String namaPembeli) {

        NodePesanan03 pesananBaru = new NodePesanan03(kodeMenu, namaMenu, harga, namaPembeli);

        if (awal == null) {
            awal = pesananBaru;
            akhir = pesananBaru;
        } else {
            pesananBaru.prev = akhir;
            akhir.next = pesananBaru;
            akhir = pesananBaru;
        }

        jumlahPesanan++;
    }

    void urutkanPesanan() {

        if (awal == null || awal.next == null) {
            return;
        }

        boolean tukar;

        do {

            tukar = false;

            NodePesanan03 bantu = awal;

            while (bantu.next != null) {

                if (bantu.namaMenu.compareToIgnoreCase(bantu.next.namaMenu) > 0) {

                    int sementaraKode = bantu.kodeMenu;
                    String sementaraNama = bantu.namaMenu;
                    int sementaraHarga = bantu.harga;
                    String sementaraPembeli = bantu.namaPembeli;

                    bantu.kodeMenu = bantu.next.kodeMenu;
                    bantu.namaMenu = bantu.next.namaMenu;
                    bantu.harga = bantu.next.harga;
                    bantu.namaPembeli = bantu.next.namaPembeli;

                    bantu.next.kodeMenu = sementaraKode;
                    bantu.next.namaMenu = sementaraNama;
                    bantu.next.harga = sementaraHarga;
                    bantu.next.namaPembeli = sementaraPembeli;

                    tukar = true;
                }

                bantu = bantu.next;
            }

        } while (tukar);
    }

    void tampilLaporan() {

        if (awal == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        urutkanPesanan();

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN");
        System.out.println("======================================");
        System.out.println("Kode\tNama Menu\tHarga");

        int totalPendapatan = 0;

        NodePesanan03 bantu = awal;

        while (bantu != null) {

            System.out.println(bantu.kodeMenu + "\t" + bantu.namaMenu + "\t\t" + bantu.harga);

            totalPendapatan += bantu.harga;

            bantu = bantu.next;
        }

        System.out.println("--------------------------------------");
        System.out.println("Total Pendapatan : " + totalPendapatan);
    }

    boolean kosong() {
        return awal == null;
    }
}