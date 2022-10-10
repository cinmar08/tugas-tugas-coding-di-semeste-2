package uts_psd_cindy_maranatha1;

import java.util.Scanner;

public class UTS_PSD_CINDY_MARANATHA1 {

    public static void main(String[] args) {
        // Nama:Cindy Maranatha_2161030
        Scanner input=new Scanner(System.in);
        int angka,bulan;

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();
        
        String [] nama_bulan = {"Januari", "Februari","Maret","April", "Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        
        bulan = angka-1;
        System.out.println("bulan "+nama_bulan[bulan]);
            }
        }