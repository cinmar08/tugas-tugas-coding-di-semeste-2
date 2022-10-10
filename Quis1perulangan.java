/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis1perulangan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Quis1perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a = new Scanner(System. in );
        System.out.println("Masukkan angka");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya:");
        int tambah = 0;
        for (int z = 0; z <= nilai; z++) { 
            tambah++; 
            if (nilai % tambah == 0) { 
                System.out.print(tambah  + " ");
            }
        }
    }
}
