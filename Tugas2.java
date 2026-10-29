import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        // Variabel buat nyimpen akumulasi penjumlahan seluruh angka di tabel
        int jumlahSeluruhAngka = 0;

        // Nested FOR untuk membuat tabel perkalian n x n
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasilKali = i * j;
                
                // Menggunakan printf dengan format spasi agar tabel sejajar dan rapi
                System.out.printf("%4d", hasilKali);
                
                // Menjumlahkan setiap angka yang muncul ke total keseluruhan
                jumlahSeluruhAngka += hasilKali;
            }
            // Pindah baris setelah satu baris tabel selesai dicetak
            System.out.println();
        }
        // Menampilkan jumlah keseluruhan angka pada tabel
        System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
        
        sc.close();
    } 
}
        
