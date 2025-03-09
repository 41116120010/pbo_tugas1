/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : Operasi Matriks
 */

package tugas_1;
import java.util.Random;
import java.util.Scanner;
public class soal3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        while (true) {
            System.out.println("\nMenu Operasi Matriks:");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Identitas");
            System.out.println("5. Transpose");
            System.out.println("6. Exit");
            System.out.print("Pilih operasi (1-6): ");
            int pilihan = input.nextInt();
            
            if (pilihan == 6) {
                System.out.println("Terima kasih!");
                break;
            }
            
            if (pilihan < 1 || pilihan > 6) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                continue;
            }
            
            System.out.print("Masukkan jumlah baris: ");
            int baris = input.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = input.nextInt();
            
            int[][] matriksA = generateMatriks(baris, kolom, rand);
            int[][] matriksB = (pilihan <= 3) ? generateMatriks(baris, kolom, rand) : null;
            
            System.out.println("Matriks A:");
            tampilkanMatriks(matriksA);
            if (matriksB != null) {
                System.out.println("Matriks B:");
                tampilkanMatriks(matriksB);
            }
            
            int[][] hasil = null;
            switch (pilihan) {
                case 1: hasil = tambahMatriks(matriksA, matriksB); break;
                case 2: hasil = kurangMatriks(matriksA, matriksB); break;
                case 3: hasil = kaliMatriks(matriksA, matriksB); break;
                case 4: hasil = identitasMatriks(baris, kolom); break;
                case 5: hasil = transposeMatriks(matriksA); break;
            }
            
            System.out.println("Hasil:");
            tampilkanMatriks(hasil);
        }
        input.close();
    }
    
    public static int[][] generateMatriks(int baris, int kolom, Random rand) {
        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = rand.nextInt(10); 
            }
        }
        return matriks;
    }
    
    public static int[][] tambahMatriks(int[][] a, int[][] b) {
        int[][] hasil = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        return hasil;
    }
    
    public static int[][] kurangMatriks(int[][] a, int[][] b) {
        int[][] hasil = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                hasil[i][j] = a[i][j] - b[i][j];
            }
        }
        return hasil;
    }
    
    public static int[][] kaliMatriks(int[][] a, int[][] b) {
        int[][] hasil = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    hasil[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return hasil;
    }
    
    public static int[][] identitasMatriks(int baris, int kolom) {
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = (i == j) ? 1 : 0;
            }
        }
        return hasil;
    }
    
    public static int[][] transposeMatriks(int[][] matriks) {
        int[][] hasil = new int[matriks[0].length][matriks.length];
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                hasil[j][i] = matriks[i][j];
            }
        }
        return hasil;
    }
    
    public static void tampilkanMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }    
}
