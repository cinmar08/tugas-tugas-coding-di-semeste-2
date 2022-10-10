/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Contoh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int n;
        System.out.print("Masukkkan nilai n = ");
        n = input.nextInt();
        int z=2;
        
        for (int i=n;i>=1;i--){
        System.out.print(1 + " ");
            for (int j=i-1;j>=1;j--){
                
            System.out.print(z +" ");
            z++;
        }
            z=2;
            System.out.println(" ");
    }
    
}
}
