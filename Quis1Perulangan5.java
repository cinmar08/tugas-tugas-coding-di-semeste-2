/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis1perulangan5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Quis1Perulangan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i , j , tinggi, bil;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan tinggi = ");
    tinggi = scan.nextInt();
        for (i=1; i<=tinggi; i++){
        bil=i;
        for (j=1; j<=i ; j++) {
        System.out.print(
        String.format ("%3d", bil));
        bil = bil + tinggi - j;
        }
        System.out.println();
        }
    }
    
}
