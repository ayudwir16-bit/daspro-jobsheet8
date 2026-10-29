import java.util.Scanner;

public class Triangle08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Segitiga Pertama (Normal)
        int i = 1; // Diubah dari 0 menjadi 1
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Segitiga Kedua (Terbalik)
        i = n; // nilai i jadi n (tanpa deklarasi int)
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();

    }       
}
