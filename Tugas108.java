import java.util.Scanner;
public class Tugas108 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int totalAngka = 0;

        for (int i = 1; i <= n; i++) {
            // Inner loop buat nge-print angka dari 1 sampai nilai i di baris tersebut
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++; // Setiap satu angka tercetak, hitungan bertambah 1
            }
            // Pindah baris setelah inner loop selesai dicetak dalam satu baris
            System.out.println();
        }
        // Menampilkan total keseluruhan angka yang tercetak di akhir
        System.out.println("Total angka tercetak: " + totalAngka);
        
        sc.close();

    }   
}
