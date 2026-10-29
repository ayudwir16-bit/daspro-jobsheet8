import java.util.Scanner;
public class Tugas3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Minta input jumlah toko (minimal 1)
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            // Variabel untuk akumulasi keseluruhan dan pencarian toko terbanyak
            int totalBarangSeluruhToko = 0;
            int maxBarangToko = -1; // Diset -1 agar toko pertama pasti tercatat sebagai pembanding awal
            int tokoTerbaik = 0;
            
            // Outer loop: Memproses setiap toko satu per satu
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                int jumlahPelanggan = sc.nextInt();
                
                // Validasi jumlah pelanggan tidak boleh negatif
                while (jumlahPelanggan < 0) {
                    System.out.print("Jumlah pelanggan tidak boleh negatif. Masukkan ulang: ");
                    jumlahPelanggan = sc.nextInt();
                }
                int totalBarangPerToko = 0;
                
                // Inner loop: Memproses setiap pelanggan di toko tersebut untuk menghitung jumlah barang
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("  Masukkan jumlah barang yang dibeli oleh pelanggan " + j + ": ");
                    int jumlahBarang = sc.nextInt();
                    
                    // Validasi jumlah barang tidak boleh negatif
                    while (jumlahBarang < 0) {
                        System.out.print("  Jumlah barang tidak boleh negatif. Masukkan ulang: ");
                        jumlahBarang = sc.nextInt();
                    }
                    
                    // Akumulasi barang per toko
                    totalBarangPerToko += jumlahBarang;
                }
                
                // Menampilkan rekap untuk toko saat ini
                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangPerToko);
                
                // Akumulasi ke total barang seluruh toko
                totalBarangSeluruhToko += totalBarangPerToko;
                
                // Mencari toko dengan jumlah barang terbanyak (jika sama besar, ambil nomor paling kecil karena menggunakan operator >)[cite: 19]
                if (totalBarangPerToko > maxBarangToko) {
                    maxBarangToko = totalBarangPerToko;
                    tokoTerbaik = i;
                }
            }
            
            // Menampilkan hasil akhir rekap keseluruhan[cite: 19]
            System.out.println("========================================");
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }
        
        sc.close();
    }    
        
}
