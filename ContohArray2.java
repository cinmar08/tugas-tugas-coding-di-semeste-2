/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ContohArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int angka, stambuk;

        System.out.print("Masukkan angka terakhir stambuk : ");
        stambuk = input.nextInt();
        
        String[] mahasiswa = {"cindy","rosa","norma","zergius","yancesius","ririn","james",};
        angka=stambuk-1;

        System.out.println(mahasiswa[angka]);
        
        
        
    }
    
}
