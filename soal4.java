/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : Pola dengan Input Angka
 */

package tugas_1;
import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j||i==0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); 
        }
    }
}

