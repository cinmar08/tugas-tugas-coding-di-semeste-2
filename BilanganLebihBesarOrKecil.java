/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganlebihbesarorkecil;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BilanganLebihBesarOrKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       int a,b;
       
       System.out.print("Masukkan Bilangan pertama = ");
       a = input.nextInt();
       
       System.out.print("Masukkan Bilangan Kedua = ");
       b = input.nextInt();
       
       if (a>b){
            System.out.println(a + " lebih besar");
        }
       else if(a=b){
           
       }
       else{
           System.out.println(b + " lebih kecil");
       }
    }
    
}
