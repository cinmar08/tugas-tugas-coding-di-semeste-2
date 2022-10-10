package tugasperulangan3;

import java.util.Scanner;
public class TugasPerulangan3 {
    public static void main(String[] args) {
        // TODO code application logic here
        String kata;
        char karakter;
        int indeks, cacah;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan kata = ");
        kata = input.next();
        cacah=kata.length();
        indeks=0;
        
        while(indeks<cacah){
            karakter=kata.charAt(indeks);
            indeks++;
            System.out.println(karakter);
        }
        
    }
    
}
