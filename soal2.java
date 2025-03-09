/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : Penggabungan 2 Array
 */
package tugas_1;
import java.util.Random;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Masukkan ukuran Array Pertama: ");
        int ukuran1 = input.nextInt();
        System.out.print("Masukkan ukuran Array Kedua: ");
        int ukuran2 = input.nextInt();

        int[] array1 = new int[ukuran1];
        int[] array2 = new int[ukuran2];

        for (int i = 0; i < ukuran1; i++) {
            array1[i] = rand.nextInt(100 + 1); 
        }
        for (int i = 0; i < ukuran2; i++) {
            array2[i] = rand.nextInt(100 + 1);
        }

        int max1 = cariMaksimum(array1);
        int max2 = cariMaksimum(array2);

        int[] array3 = new int[ukuran1 + ukuran2];
        if (max1 >= max2) {
            gabungkanArray(array1, array2, array3);
        } else {
            gabungkanArray(array2, array1, array3);
        }
        
        System.out.println("--- Hasil Awal ---");
        System.out.println("Array Pertama: ");
        tampilkanArray(array1);
        System.out.println("Array Kedua: ");
        tampilkanArray(array2);
        System.out.println("--- Hasil Akhir ---");
        System.out.println("Array Gabungan: ");
        tampilkanArray(array3);

    }

    public static int cariMaksimum(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void gabungkanArray(int[] first, int[] second, int[] result) {
        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            result[first.length + i] = second[i];
        }
    }

    public static void tampilkanArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
