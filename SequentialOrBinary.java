/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialorbinary;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SequentialOrBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dicari, posisi;
        boolean ketemu;
        int [] bil_bulat = {15,32,18,11,27,9,23,8,90,88,17,45,58,62,79,77,80,55,38,48};
        int i=1;
        ketemu=false;
        posisi=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan angka = ");
        dicari= scan.nextInt();
        
        while (i<bil_bulat.length && bil_bulat[i]<dicari){
        i = (i+1);
    }
        if (bil_bulat[i] == dicari){
            ketemu = true;
            posisi=i;
        }
        else{
                ketemu = false;
                }
        if (ketemu == true){
            System.out.println(dicari + " Ketemu di posisi terurut ke- : " +posisi);
        }
        else{
            System.out.println(dicari + " Tidak di temukan di dalam array");
        }
    
    }
    
}
