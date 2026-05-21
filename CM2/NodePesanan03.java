package CM2;

public class NodePesanan03 {
    int kodeMenu;
    String namaMenu;
    int harga;
    String namaPembeli;
    NodePesanan03 prev;
    NodePesanan03 next;

    NodePesanan03(int kodeMenu, String namaMenu, int harga, String namaPembeli) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
        this.prev = null;
        this.next = null;
    }
}