package CM2;

public class NodePembeli03 {
    int nomorAntrian;
    String namaPembeli;
    String nomorHp;
    NodePembeli03 prev;
    NodePembeli03 next;

    NodePembeli03(int nomorAntrian, String namaPembeli, String nomorHp) {
        this.nomorAntrian = nomorAntrian;
        this.namaPembeli = namaPembeli;
        this.nomorHp = nomorHp;
        this.prev = null;
        this.next = null;
    }
}
