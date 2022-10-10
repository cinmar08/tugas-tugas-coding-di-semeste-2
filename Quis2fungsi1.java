
package quis2fungsi1;

import java.util.Scanner;
public class Quis2fungsi1 {
    public static void GanjilGenap(int bil){
        if (bil%2==0){
            System.out.println(bil+" adalah bilangan genap");
        }else {
             System.out.println(bil+" adalah bilangan ganjil");
        }
    }
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int bil;
        
        System.out.print("Masukan Bilangan = ");
        bil=input.nextInt();
      
        GanjilGenap(bil);
    }
    
}
