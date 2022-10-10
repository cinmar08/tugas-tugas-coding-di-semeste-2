/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohfungsi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ContohFungsi {

    public static void banding (int bil)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bil1, bil2, bil;
        Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan bilangan 1 = ");
    bil1 = scan.nextInt();
    System.out.print("Masukkan bilangan 2 = ");
    bil2 = scan.nextInt();
    
    bil = banding (bil1, bil2);
    
    if (bil ==0){
        System.out.println("bilangan sama");
    }
    else{
        System.out.println("bilangan Terbesar : " +bil);
    }
    }
    
}
