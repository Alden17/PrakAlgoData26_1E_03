package Praktikum05;

public class MahasiswaBerprestasi03 {
    Mahasiswa03[] listMHS = new Mahasiswa03[5];
    int idx;

    void tambah(Mahasiswa03 m) {
        if (idx < listMHS.length) {
            listMHS[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa03 m : listMHS) {
            m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMHS.length - 1; i++) {
            for (int j = 1; j < listMHS.length - i; j++) {
                if (listMHS[j].ipk > listMHS[j - 1].ipk) {
                    Mahasiswa03 tmp = listMHS[j];
                    listMHS[j] = listMHS[j - 1];
                    listMHS[j - 1] = tmp;
                }
            }
        }
    }
}
