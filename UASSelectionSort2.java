package uasselectionsort2;

import java.util.Scanner;

public class UASSelectionSort2 {
public static void selectionSort(int[] bil){
    for (int i=0; i<bil.length-1; i++){  
            int index = i;  
            for (int j=i + 1; j<bil.length; j++){
                if (bil[j] < bil[index]){  
                    index = j;  
                }  
            }  
            int smallerNumber = bil[index];   
            bil[index] = bil[i];  
            bil[i] = smallerNumber;  
        }
}
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    int[] bil = new int[20];
        System.out.println();
        for(int x = 0; x < 20; x++){
            System.out.print("Input angka ke-"+(x+1)+" : ");
            bil[x] = scan.nextInt();
        }
    System.out.println();
    System.out.println("Sebelum sorting :");  
    
    for(int i=0; i < bil.length; i++){  
    System.out.print(bil[i] + " ");  
    }  
    System.out.println();  

    selectionSort(bil);

    System.out.println("Sesudah sorting :");  
    for(int i=0; i < bil.length; i++){  
    System.out.print(bil[i] + " ");  
    }
    }
    
}
