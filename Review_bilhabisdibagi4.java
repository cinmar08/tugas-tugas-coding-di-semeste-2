package review_bilhabisdibagi4;

import java.util.Scanner;

public class Review_bilhabisdibagi4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan sebuah angka = ");
        angka = input.nextInt();
        
        if(angka % 4 == 0){
            System.out.println("Bilangan Habis Dibagi 4");
        }
        else{
            System.out.println("Bilangan Tidak Habis Dibagi 4");
        }
    }
    
}
