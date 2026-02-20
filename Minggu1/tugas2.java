package Minggu1;
import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {

        Scanner alden = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        int n = Integer.parseInt(alden.nextLine());

        String[][] jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = alden.nextLine();

            System.out.print("Ruang : ");
            jadwal[i][1] = alden.nextLine();

            System.out.print("Hari : ");
            jadwal[i][2] = alden.nextLine();

            System.out.print("Jam : ");
            jadwal[i][3] = alden.nextLine();
        }

        System.out.println("\n=== Semua Jadwal Kuliah ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("=============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = alden.nextLine();

        System.out.println("\nJadwal pada hari " + hari + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
            }
        }

        System.out.print("\nCari jadwal berdasarkan nama MK: ");
        String mk = alden.nextLine();

        System.out.println("\nJadwal untuk Mata Kuliah " + mk + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
            }
        }

        alden.close();
    }
}
