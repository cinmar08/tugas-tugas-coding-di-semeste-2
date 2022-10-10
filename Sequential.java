/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequential;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Sequential {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int [] bilangan = {15,32,18,11,27,9,23,8,90,88,17,45,58,62,79,77,80,55,38,48};
         int cari;
         int i=0;
         boolean ditemukan = false;
         
         System.out.print("Masukkan angka = ");
         cari = scan.nextInt();
         for (i=0; i<bilangan.length; i++){
          if (bilangan[i]== cari){
              ditemukan= true;
              break;
          }
    }
     if (ditemukan){
         System.out.println("bilangan "+ cari+" ditemukan pada urutan ke "+ (i+1));
     }
     else {
         System.out.println("bilangan tidak ditemukan");
     }
     
    }
    
}
