/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quissd1nomor2;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class QuisSD1nomor2 {
    public static void random (int bil){
        if(bil%2==0 && bil%3==0){
            System.out.println("angka genap dari angka random yang habis dibagi 3 = "+bil);
            }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int bil;
        Random a = new Random();
        for(int i=0;i<20;i++){
            bil = a.nextInt(99)+1;
            System.out.println(bil+",");

            random(bil);
        }
    }
}
