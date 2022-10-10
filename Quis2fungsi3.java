package quis2fungsi3;

import java.util.Scanner;
public class Quis2fungsi3 {
    public static void total(int n){
    Scanner input = new Scanner(System.in);
    int x, i = 1, total=0;
    
        while (i<=n){
        System.out.print("angka ke-"+i +":");
        x = input.nextInt();
        total=total+x;
        i++;
        }
        
    System.out.println();
    System.out.println("Total angka = " + total);
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int n;
    
    System.out.print("masukkan jumlah array: ");
    n= input.nextInt();
    
    total(n);
    }
}
    
