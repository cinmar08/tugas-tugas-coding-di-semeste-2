/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CONTOH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int n;
        System.out.print("Masukkkan nilai n = ");
        n = input.nextInt();
        int x=n;
        
        for (int i=n;i>=1;i--){
            for (int j=i;j>=1;j--){
                while (n>i){
            System.out.print("  ");
            n--;
        }
            System.out.print(j + " ");
            }
            n = x;
            System.out.println("");
    }
    
}
    }
    

