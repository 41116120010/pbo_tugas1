/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : Penentu Nilai Permutasi dan Kombinasi
 */
package tugas_1;
import java.util.Scanner;
public class soal1 {
    public static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static long hitungPermutasi(int n, int r) {
        if (n < r) {
            return 0; 
        }
        return faktorial(n) / faktorial(n - r);
    }

    public static long hitungKombinasi(int n, int r) {
        if (n < r) {
            return 0; 
        }
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai n: ");
        int n = input.nextInt();
        System.out.print("Masukkan Nilai r: ");
        int r = input.nextInt();
        
        long permutasi = hitungPermutasi(n, r);
        long kombinasi = hitungKombinasi(n, r);
        
        System.out.println("Permutasi P(" + n + ", " + r + ") = " + permutasi);
        System.out.println("Kombinasi C(" + n + ", " + r + ") = " + kombinasi);
        
    }
}
