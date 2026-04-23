
public class Mahasiswa03 {
    String nim;
    String nama;
    String prodi;
    // Jawaban sesi 2 A
    boolean statusMember;

    Mahasiswa03(String nim, String nama, String prodi, boolean statusMember) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.statusMember = statusMember;

    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | " + "Nama: " + nama + " | " + "Prodi: " + prodi + " | "  + "Status Member: " + (statusMember? "Member" : "Bukan"));
    }
}
