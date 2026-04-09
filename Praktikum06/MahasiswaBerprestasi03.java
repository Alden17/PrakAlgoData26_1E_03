package Praktikum06;

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

    void selectionSort() {
        for (int i = 0; i < listMHS.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMHS.length; j++) {
                if (listMHS[j].ipk < listMHS[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa03 tmp = listMHS[idxMin];
            listMHS[idxMin] = listMHS[i];
            listMHS[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMHS.length; i++) {
            Mahasiswa03 temp = listMHS[i];
            int j = i;
            while (j > 0 && listMHS[j - 1].ipk < temp.ipk) {
                listMHS[j] = listMHS[j - 1];
                j--;
            }
            listMHS[j] = temp;
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMHS.length; j++) {
            if (listMHS[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMHS[pos].nim);
            System.out.println("nama\t : " + listMHS[pos].nama);
            System.out.println("kelas\t : " + listMHS[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

}
