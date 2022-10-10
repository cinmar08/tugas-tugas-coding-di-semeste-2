package uasselectionsort1;

public class UASSelectionSort1 {
    static String[] selectionSort(String[] array){
        for (int i = 1; i < array.length; i++) {
            int s = i-1;
            for (int j = i; j < array.length; j++) {
                if (array[j].compareTo(array[s]) < 0) {     //ascending
                //if (array[j].compareTo(array[s]) > 0) {   //descending
                    s = j;
                }
            }
            
            String temp = array[i-1];
            array[i-1] = array[s];
            array[s] = temp;
        }
        return array;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] array = {"ian","samuel","kevin","jennifer","calvin","silvester"
                ,"vincent","daniel","nichols","theodora","cindy","rosa","norma",
                "zergius","yancesius","ririn","nirma","humbelina","nawa","james","yosua"};
        
        System.out.println("Sebelum sorting :");  
        for(int i=0; i < array.length; i++){  
            System.out.println(array[i] + " ");  
        }
        System.out.println();
        
        selectionSort(array);
        
        System.out.println("Sesudah sorting :");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
    
    
    }
 

