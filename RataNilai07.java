import java.util.Scanner;
public class RataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int i = 1;

        while (i <= 5) {
             System.out.println("Input Nilai Mahasiswa ke-" + i);
             int totalNilai = 0;

              for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + ": ");
                int nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
        }

        double rataNilai = totalNilai / 5.0;
        System.out.println("Rata-rata Nilai Mahasiswa: " + rataNilai);
        System.out.println();
        i++;
        }
   }
}