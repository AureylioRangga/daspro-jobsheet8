import java.util.Scanner;
public class InputDataAtlet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] daftarCabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};
        int jumlahTotalAtlet = 0;

        System.out.println("Daftar Cabang Olahraga di Polinema:");
        System.out.print("Masukkan jumlah Politeknik yang mendaftar :");
        int jumlahPoliteknik = input.nextInt();
        input.nextLine();

        for (int p = 1; p <= jumlahPoliteknik; p++) {
            System.out.println("\n== Data Politeknik ke-" + p + " ==");
            System.out.print("Masukkan nama Politeknik: ");
            String namaPoliteknik = input.nextLine();

            for (int c = 0; c < daftarCabor.length; c++) {
               String cabang = daftarCabor[c];
               System.out.print("Jumlah atlet untuk cabang " + cabang + ": ");
               int jumlahAtlet = input.nextInt();
               input.nextLine();

                jumlahTotalAtlet += jumlahAtlet;

               for (int a = 1; a <= jumlahAtlet; a++) {
                   System.out.print("Nama atlet ke-" + a + ": ");
                   String namaAtlet = input.nextLine();
               }

               System.out.println("==" + jumlahAtlet + " atlet dari cabang " + cabang + " dari " + namaPoliteknik + " telah terdaftar!");
            }
        }
        
        System.out.println("\n== SEMUA DATA ATLET BERHASIL TERDAFTAR ==");
        System.out.println("Total Politeknik        : " + jumlahPoliteknik);
        System.out.println("Total Atlet             : " + jumlahTotalAtlet);
        System.out.println("Total Keseluruhan Atlet : " + jumlahTotalAtlet);

        input.close();
    }
}