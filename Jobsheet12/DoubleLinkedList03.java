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
}