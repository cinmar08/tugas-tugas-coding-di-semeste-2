/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray2dimensi1;

/**
 *
 * @author LENOVO
 */
public class ContohArray2Dimensi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] negara = {
            {"Indonesia", "Amerika","Belanda","Arab Saudi", "Afganistan","Australia"},
            {"Jakarta", "Washington D.C", "Amsterdam","Riyadh","Kabul","Canbera"}};
        
        for(int i=0; 1<6; i++){
            if(negara [0][1].charAt(0) == 'A'){
                System.out.println("negara "+negara[0][1]+" ibukotanya "+negara[1][i]);
            }
        }
    }
    
}
