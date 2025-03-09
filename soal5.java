/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : Penghitung Harga, Diskon, Total Pembayaran
 */

package tugas_1;
import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaX = 40000, hargaY = 50000, hargaZ = 60000;
        
        System.out.print("Masukkan jumlah kotak susu merek X: ");
        int jumlahX = input.nextInt();
        System.out.print("Masukkan jumlah kotak susu merek Y: ");
        int jumlahY = input.nextInt();
        System.out.print("Masukkan jumlah kotak susu merek Z: ");
        int jumlahZ = input.nextInt();
        
        int totalX = jumlahX * hargaX;
        int totalY = jumlahY * hargaY;
        int totalZ = jumlahZ * hargaZ;
        
        double diskonX = (jumlahX >= 3) ? totalX * 0.10 : 0;
        double diskonY = (jumlahY > 3) ? totalY * 0.12 : 0;
        double diskonZ = (jumlahZ > 1) ? (jumlahZ - 1) * hargaZ * 0.15 : 0;
        
        double totalBayarX = totalX - diskonX;
        double totalBayarY = totalY - diskonY;
        double totalBayarZ = totalZ - diskonZ;
        double totalBayar = totalBayarX + totalBayarY + totalBayarZ;
        
        System.out.println("\nDetail Pembelian:");
        System.out.println("Merek X: Total Harga = Rp." + totalX + ", Diskon = Rp." + (int)diskonX + ", Bayar = Rp." + (int)totalBayarX);
        System.out.println("Merek Y: Total Harga = Rp." + totalY + ", Diskon = Rp." + (int)diskonY + ", Bayar = Rp." + (int)totalBayarY);
        System.out.println("Merek Z: Total Harga = Rp." + totalZ + ", Diskon = Rp." + (int)diskonZ + ", Bayar = Rp." + (int)totalBayarZ);
        System.out.println("Total Pembayaran: Rp." + (int)totalBayar);
        
    }
}
