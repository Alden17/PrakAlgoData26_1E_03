package Jobsheet12;

public class DoubleLinkedList03 {
    Node03 head;
    Node03 tail;

    public DoubleLinkedList03() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNIM, Mahasiswa03 data) {
        Node03 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNIM + " tidak ditemukan.");
            return;
        }

        Node03 newNode30 = new Node03(data);

        if (current == tail) {
            newNode30.prev = current;
            current.next = newNode30;
            tail = newNode30;
        } else {
            newNode30.prev = current;
            newNode30.next = current.next;
            current.next.prev = newNode30;
            current.next = newNode30;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNIM);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node03 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node03 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFIrst() {
        if (isEmpty()) {
            System.out.println("Linked masih kosong.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked masih kosong.");
            return;
        }
        System.out.println("Data berhasil dihapus.");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Tugas No 1
    public void add(int index, Mahasiswa03 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node03 current = head;
        int i = 0;

        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index melebihi jumlah data.");
        } else if (current == tail) {
            addLast(data);
        } else {
            Node03 newNode = new Node03(data);

            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // Tugas No 2
    public void removeAfter(String keyNIM) {
        Node03 current = head;

        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node setelah key tidak ditemukan.");
            return;
        }

        Node03 removedNode = current.next;

        System.out.println("Data berhasil dihapus.");
        removedNode.data.tampil();

        current.next = removedNode.next;

        if (removedNode.next != null) {
            removedNode.next.prev = current;
        } else {
            tail = current;
        }
    }

    // Tugas No 3
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            removeFIrst();
            return;
        }

        Node03 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index tidak ditemukan.");
        } else if (current == tail) {
            removeLast();
        } else {
            System.out.println("Data berhasil dihapus.");
            current.data.tampil();

            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Tugas No 4
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            System.out.println("Data node pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            System.out.println("Data node terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node03 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index tidak ditemukan.");
        } else {
            System.out.println("Data pada index ke-" + index);
            current.data.tampil();
        }
    }

    // Tugas No 5
    public int size() {
        int jumlah = 0;
        Node03 current = head;

        while (current != null) {
            jumlah++;
            current = current.next;
        }

        return jumlah;
    }
}