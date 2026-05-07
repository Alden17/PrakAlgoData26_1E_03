package Pertemuan12;

public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa03() {

    }

    Mahasiswa03(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.1f%n", nama, nim, kelas, ipk);
        
    }
}
