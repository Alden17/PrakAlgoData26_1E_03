package Pertemuan14;

public class BinaryTreeArray03 {
    Mahasiswa03[] data;
    int idxLast;

    void populateData(Mahasiswa03[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                data[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa03 dataBaru) {

        if (data[0] == null) {
            data[0] = dataBaru;
            idxLast = 0;
            return;
        }

        int idx = 0;

        while (idx < data.length) {

            if (dataBaru.ipk < data[idx].ipk) {
                idx = 2 * idx + 1;
            } else {
                idx = 2 * idx + 2;
            }

            if (idx >= data.length) {
                System.out.println("Array penuh");
                return;
            }

            if (data[idx] == null) {
                data[idx] = dataBaru;

                if (idx > idxLast) {
                    idxLast = idx;
                }

                return;
            }
        }
    }

    void traversePreOrder(int idxStart) {

        if (idxStart <= idxLast && data[idxStart] != null) {

            data[idxStart].tampilInformasi();

            traversePreOrder(2 * idxStart + 1);

            traversePreOrder(2 * idxStart + 2);
        }
    }
}
