/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_sd_2161030_cindy_maranatha;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class UAS_SD_2161030_CINDY_MARANATHA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Buatlah program yang menerapkan metode sequential search 
        //dengan melakukan pencarian pada sekelompok data yang berupa bilangan bulat 
        //di mana bilangan bulat yang akan dicari diinput oleh user!
        //BilanganBulat = {1,20,71,12,14, 21, 3,5, 8,9, 15, 32, 18, 11, 27, 9, 23, 8, 90, 88, 17, 45, 58, 62, 79, 77, 80, 55, 38, 48}

        
        Scanner scan = new Scanner(System.in);
        int [] bilangan = {1,20,71,12,14,21,3,5,8,9,15,32,18,11,27,9,23,8,90,88,17,45,58,62,79,77,80,55,38,48};
        int cari;
        int i=0;
        boolean ditemukan = false;
         
        System.out.print("Masukkan angka = ");
        cari = scan.nextInt();
        
        for (i=0; i<bilangan.length; i++){
            if (bilangan[i]== cari){
            ditemukan= true;
            break;
            }
        }
        if (ditemukan){
         System.out.println("bilangan "+ cari+" ditemukan pada urutan ke "+ (i+1));
        }
        else {
            System.out.println("bilangan tidak ditemukan");
        }
    }
}

        //PENJELASAN:
        //Pertama saya buatkan variabel untuk menampung sejumlah bilangan bulat dalam bentuk array
        //dan variabel bantu lainnya dengan variabel int dan boolean
        //kemudian user memasukkan angka yang di tampung dalam variabel cari
        //kemudian saya gunakan perulangan untuk menyusun bilangan bulat agar kita dapat mengetahui di urutan ke berapa bilangan yang akan dicari
        //dan percabangan digunakan untuk mencari bilangan yang di ketik oleh user
        //jika bilangan yang dicari ditemukan maka program akan menampilkan bilangan tersebut pada urutan ke sekian.
        //dan jika tidak ditemukan maka program akan menampilkan error atau bilangan tidak ditemukan.


        //Nama: Cindy Maranatha
        //NIM: 2161030