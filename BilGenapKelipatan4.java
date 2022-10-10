/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilgenapkelipatan4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BilGenapKelipatan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       int a;
       
       System.out.print("Masukkan Bilangan = ");
       a = input.nextInt();
       
       if (a % 2==0 && a % 4 == 0){
            System.out.println(a + " adalah bilangan genap dan kelipatan 4");
        }
       else if (a % 2 == 0 || a % 4 != 0){
           System.out.println(a + " hanya bilangan genap tapi bukan bilangan keliapatan 4");
       }
       else{
           System.out.println(a + " bukan bilangan genap dan bukan kelipatan 4");
       }
    }
    
}
