/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesorting;

/**
 *
 * @author LENOVO
 */
public class BubbleSorting {
static void bubbleSort(int[] bil) {  
    int n = bil.length;  
    int temp = 0;
    
    for(int i=0; i < n; i++){ //for pertama untuk iterasi 
        for(int j=1; j < (n-i); j++){  //for kedua untuk me
        if(bil[j-1] > bil[j]){  
        temp = bil[j-1];  //proses penukaran
        bil[j-1] = bil[j];  
        bil[j] = temp;  
        }
        }
    }
}
public static void selectionSort(int[] bil){  
        for (int i=0; i<bil.length-1; i++)  
        {  
            int index = i;  
            for (int j=i + 1; j<bil.length; j++){  //for pertama hanya untuk memeriksa data hingga akhir
                if (bil[j] > bil[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = bil[index];   
            bil[index] = bil[i];  
            bil[i] = smallerNumber;  
        }  
    }  
public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] < key ) ) {  //mencari data yg kecil kemudian disisipkan ke nilai akhir
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
    public static void main(String[] args) {
        // TODO code application logic here
    int bil[] ={34,67,23,75,98,15,89,42,54,18};  
    System.out.println("Sebelum sorting");  
    
    for(int i=0; i < bil.length; i++){  
    System.out.print(bil[i] + " ");  
    }  
    System.out.println();  

    //bubbleSort(bil);
    selectionSort(bil);
    //insertionSort(bil);

    System.out.println("Sesudah sorting");  
    for(int i=0; i < bil.length; i++){  
    System.out.print(bil[i] + " ");  
    }  
    }
    
}
