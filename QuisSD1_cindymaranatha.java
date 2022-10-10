package quissd1_cindymaranatha;

import java.util.Scanner;

public class QuisSD1_cindymaranatha {
    public static void operasi_matematika(int jumlah,int hasil,int x,int y,int n){
    jumlah=x+y;
    hasil = (int) Math.pow(jumlah,n);
    System.out.println("hasil dari " +x +" tambah " +y +" pangkat " +n +" adalah " +hasil);
}
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    int x,y,n;
    int jumlah = 0, hasil = 0;
    
    System.out.print("Masukkan nilai x: ");
    x = scan.nextInt();
    System.out.print("Masukkan nilai y: ");
    y = scan.nextInt();
    System.out.print("Masukkan nilai n: ");
    n = scan.nextInt();
    
    operasi_matematika(jumlah,hasil,x,y,n);
    }
}
    

