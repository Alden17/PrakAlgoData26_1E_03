package Praktikum03;

public class DataDosen03 {
    
    void tampilSemua(Dosen03[] dataDosen){
        int nomor = 1;

        for (Dosen03 dsn : dataDosen) {
            System.out.println("Data Dosen ke-" + nomor);
            System.out.println("Kode         : " + dsn.kode);
            System.out.println("Nama         : " + dsn.nama);
            System.out.println("Jenis Kelamin: " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia         : " + dsn.usia);
            System.out.println("------------------------------------");
            nomor++;
        }
    }

    void hitungGender(Dosen03[] dataDosen) {
        int laki = 0, perempuan = 0;

        for (Dosen03 dsn : dataDosen) {
            if (dsn.jenisKelamin) {
                laki++;
            } else {
                perempuan++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + laki);
        System.out.println("Jumlah Dosen Wanita : " + perempuan);
    }

    void rataUsia(Dosen03[] dataDosen) {
        int totalLaki = 0, totalPerempuan = 0;
        int jmlLaki = 0, jmlPerempuan = 0;

        for (Dosen03 dsn : dataDosen) {
            if (dsn.jenisKelamin) {
                totalLaki += dsn.usia;
                jmlLaki++;
            } else {
                totalPerempuan += dsn.usia;
                jmlPerempuan++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + 
            (jmlLaki > 0 ? totalLaki / jmlLaki : 0));

        System.out.println("Rata-rata Usia Dosen Wanita : " + 
            (jmlPerempuan > 0 ? totalPerempuan / jmlPerempuan : 0));
    }

    void cariTertua(Dosen03[] dataDosen) {
        Dosen03 palingTua = dataDosen[0];

        for (Dosen03 dsn : dataDosen) {
            if (dsn.usia > palingTua.usia) {
                palingTua = dsn;
            }
        }

        System.out.println("\n=== DOSEN PALING TUA ===");
        System.out.println("Kode  : " + palingTua.kode);
        System.out.println("Nama  : " + palingTua.nama);
        System.out.println("Usia  : " + palingTua.usia);
    }

    void cariTermuda(Dosen03[] dataDosen) {
        Dosen03 palingMuda = dataDosen[0];

        for (Dosen03 dsn : dataDosen) {
            if (dsn.usia < palingMuda.usia) {
                palingMuda = dsn;
            }
        }

        System.out.println("\n=== DOSEN PALING MUDA ===");
        System.out.println("Kode  : " + palingMuda.kode);
        System.out.println("Nama  : " + palingMuda.nama);
        System.out.println("Usia  : " + palingMuda.usia);
    }
}