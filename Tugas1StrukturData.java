/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1strukturdata;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tugas1StrukturData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil = 1; 
    int angka, pangkat;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai X = ");
    angka=input.nextInt();
    
    System.out.print("Masukkan nilai Y + ");
    pangkat=input.nextInt();

        for(int i=1;i<=pangkat;i++){ 
        
        hasil=hasil*angka; 
        }
    System.out.println( "Hasil "+angka+" pangkat "+pangkat+" = " +hasil);

    }
    
}
