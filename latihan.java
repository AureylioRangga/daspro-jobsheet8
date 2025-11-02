import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] daftarCabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};
        int jumlahTotalAtlet = 0;

        System.out.println("Daftar Cabang Olahraga di Politeknik Negeri Malang:");
        System.out.print("Masukkan jumlah Politeknik: ");
        int totalPoliteknik = input.nextInt();
        input.nextLine(); // membersihkan buffer

        for (int p = 1; p <= totalPoliteknik; p++) {
            System.out.println("\n== Data Politeknik ke-" + p + " ==");
            System.out.print("Nama Politeknik: ");
            String namaKampus = input.nextLine();

            for (int c = 0; c < daftarCabor.length; c++) {
                String cabang = daftarCabor[c];
                System.out.print("Jumlah Atlet Cabang " + cabang + ": ");
                int jumlahAtletCabor = input.nextInt();
                input.nextLine();

                jumlahTotalAtlet += jumlahAtletCabor;

                for (int a = 1; a <= jumlahAtletCabor; a++) {
                    System.out.print("Nama atlet ke-" + a + ": ");
                    String namaAtlet = input.nextLine();
                }

                System.out.println("== " + jumlahAtletCabor + " atlet cabang " + cabang + " dari " + namaKampus + " berhasil ditambahkan!");
            }
        }

        System.out.println("\n== SEMUA DATA ATLET BERHASIL DITAMBAHKAN ==");
        System.out.println("Total Politeknik        : " + totalPoliteknik);
        System.out.println("Total Cabang Olahraga   : " + daftarCabor.length);
        System.out.println("Total Keseluruhan Atlet : " + jumlahTotalAtlet);

        input.close();
    }
}
