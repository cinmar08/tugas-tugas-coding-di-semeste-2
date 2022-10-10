package quis2fungsi4;

import java.util.Scanner;
public class Quis2fungsi4 {
public static float ratarata(float rata2, float total){
    rata2 = total/10;
    return rata2;
}

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    int array[], i;
    array = new int[100];
    float hasil,rata2=0, total=0;

    for(i = 1; i <= 10; i++){
      System.out.print("Nilai Ke-"+ i +" : ");
      array[i] = scan.nextInt();
      total = total + array[i];
    }
    hasil= ratarata(rata2, total);
    System.out.println("");
    System.out.println("Nilai rata-rata : " + hasil);
    
    }
}
