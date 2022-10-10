
package tugasarrayno2;

import java.util.Scanner;

public class TugasArrayNo2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int array[];
        array = new int[18];
        int total=0;
        
        for(int i = 0; i <18; i++){
            System.out.print("Nilai Ke "+ (i+1) +" : ");
            array[i] = scan.nextInt();
            total = total + array[i];
        }
        System.out.println("jumlah seluruh bilangan adalah : " + total);


    }
    
}
