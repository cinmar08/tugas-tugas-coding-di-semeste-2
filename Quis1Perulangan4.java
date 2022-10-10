/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis1perulangan4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Quis1Perulangan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan panjang = ");
        x = scan.nextInt();
        
        System.out.println("Masukkan lebar = ");
        y = scan.nextInt();
        
        for(int i = 0; i < y; i++) {   
        for(int j = 0; j < x; j++) {     
            System.out.print(" *");   
        }   
        System.out.println(""); } 
    }

}
    

