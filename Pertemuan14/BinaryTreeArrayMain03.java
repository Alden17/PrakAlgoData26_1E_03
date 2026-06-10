package Pertemuan14;

public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {

        BinaryTreeArray03 bta03 = new BinaryTreeArray03();

        Mahasiswa03 mhs03[] = {
            new Mahasiswa03("244160121", "Ali", "A", 3.57),
            new Mahasiswa03("244160185", "Candra", "C", 3.41),
            new Mahasiswa03("244160221", "Badar", "B", 3.75),
            new Mahasiswa03("244160220", "Dewi", "B", 3.35),
            new Mahasiswa03("244160131", "Devi", "A", 3.48),
            new Mahasiswa03("244160205", "Ehsan", "D", 3.61),
            new Mahasiswa03("244160170", "Fikri", "B", 3.86)
        };

        int idxLast03 = 6;

        bta03.populateData(mhs03, idxLast03);

        System.out.println("\nInorder Traversal Mahasiswa");
        bta03.traverseInOrder(0);
    }   
}
