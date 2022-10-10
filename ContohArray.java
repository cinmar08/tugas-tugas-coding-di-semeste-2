/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

/**
 *
 * @author LENOVO
 */
public class ContohArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] array = {12,5,8,9,27,18,11,90,88,10};
        int Terbesar = array[0];
       
        for(int i=0;i<array.length;i++){
            if(Terbesar < array[i]){
              Terbesar = array[i];
            }
        System.out.println(Terbesar);
        }
    }
}
