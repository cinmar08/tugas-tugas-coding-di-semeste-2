package quis2fungsi2;

import java.util.Scanner;
public class Quis2fungsi2 {
    public static void jumlahBilangan(int n){
        Scanner input = new Scanner(System.in);
        int a, genap = 0, ganjil = 0;
        
        for (int i = 1; i <= n; i++) {
        System.out.print("masukan bilangan " + i + " :");
        a = input.nextInt();

            if (a % 2 == 0) {
            genap = genap + 1;
            } 
            else {
            ganjil = ganjil + 1;
            }
        }
        System.out.println("");
        System.out.println("Bilangan ganjil :" + ganjil);
        System.out.println("Bilangan genap :" + genap);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
    
        System.out.print("masukkan jumlah array: ");
        n = input.nextInt();

        jumlahBilangan(n);
    }
    
}
