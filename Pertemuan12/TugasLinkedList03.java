package Pertemuan12;

public class TugasLinkedList03 {
    NodeTugas03 head;
    NodeTugas03 tail;
    int size;
    int max = 10;

    public TugasLinkedList03() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size >= max;
    }

    public void enqueue(MahasiswaTugas03 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        NodeTugas03 newNode = new NodeTugas03(mhs);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian. (Nomor antrian: " + size + ")");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        MahasiswaTugas03 dilayani = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("Memanggil mahasiswa:");
        dilayani.tampilInformasi();
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terdepan:");
            head.data.tampilInformasi();
        }
    }

    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling akhir:");
            tail.data.tampilInformasi();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantri: " + size);
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong!");
        } else {
            head = null;
            tail = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }
}
