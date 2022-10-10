package uts_psd_cindy_maranatha3;

import java.util.Scanner;

public class UTS_PSD_CINDY_MARANATHA3 {

    public static void main(String[] args) {
        // Nama:Cindy Maranatha_2161030
    int i, j, m, n;
    int matriks1[][] = new int[10][10];
    int matriks2[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Masukkan jumlah baris matriks: ");
    m = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks: ");
    n = scan.nextInt();
    
    System.out.println("Masukkan elemen matriks pertama: ");
    System.out.println("(enter untuk memasukkan elemen berikutnya)");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks1[i][j] = scan.nextInt();
      }
    }
    System.out.println("Masukkan elemen matriks kedua: ");
    System.out.println(" (enter untuk memasukkan elemen berikutnya)");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks2[i][j] = scan.nextInt();
      }
    }
    
    System.out.println("Hasil penjumlahan matriks: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        hasil[i][j] = matriks1[i][j] + matriks2[i][j];
        System.out.print(hasil[i][j] + "\t");
      }
      System.out.println();
    }
    }
        
    
    
}
