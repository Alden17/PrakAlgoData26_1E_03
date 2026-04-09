package CM;

public class Peminjaman {
    
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    final int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000; 
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.println("\nDATA PEMINJAMAN: ");
        mhs.tampilMahasiswa();
        buku.tampilBuku();
        System.out.println("Nama: " + mhs.nama + " | " +  "Judul: " + buku.judul + " | " + "Lama: " + lamaPinjam + " | " +  "Terlambat: " + terlambat + " | " + "Denda: " + denda);
    }
}

