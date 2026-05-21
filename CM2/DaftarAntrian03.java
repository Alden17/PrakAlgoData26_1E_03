package CM2;

public class DaftarAntrian03 {
    NodePembeli03 depan;
    NodePembeli03 belakang;
    int jumlahData;
    int nomorOtomatis;

    DaftarAntrian03() {
        depan = null;
        belakang = null;
        jumlahData = 0;
        nomorOtomatis = 0;
    }

    void tambahAntrian(String namaPembeli, String nomorHp) {

        nomorOtomatis++;

        NodePembeli03 nodeBaru = new NodePembeli03(nomorOtomatis, namaPembeli, nomorHp);

        if (depan == null) {
            depan = nodeBaru;
            belakang = nodeBaru;
        } else {
            nodeBaru.prev = belakang;
            belakang.next = nodeBaru;
            belakang = nodeBaru;
        }

        jumlahData++;

        System.out.println("Antrian berhasil ditambahkan dengan nomor : " + nomorOtomatis);
    }

    void tampilAntrian() {

        if (depan == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("=================================");
        System.out.println("DAFTAR ANTRIAN PEMBELI");
        System.out.println("=================================");
        System.out.println("No\tNama\t\tNo HP");

        NodePembeli03 bantu = depan;

        while (bantu != null) {

            System.out.println(bantu.nomorAntrian + "\t" + bantu.namaPembeli + "\t\t" + bantu.nomorHp);

            bantu = bantu.next;
        }
    }

    NodePembeli03 hapusAntrian() {

        if (depan == null) {
            System.out.println("Antrian kosong.");
            return null;
        }

        NodePembeli03 dihapus = depan;

        depan = depan.next;

        if (depan != null) {
            depan.prev = null;
        } else {
            belakang = null;
        }

        jumlahData--;

        return dihapus;
    }

    boolean kosong() {
        return depan == null;
    }
}