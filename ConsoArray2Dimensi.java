/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoarray2dimensi;

/**
 *
 * @author LENOVO
 */
public class ConsoArray2Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] A = {{2,7},{0,9}};
        int [][] B = {{1,8},{-1,1}};
        int [][] C =new int [2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
            C[i][j] = A[i][j] - B[i][j];
        
            System.out.println("baris ke "+(i+1)+ " kolom ke "+(j+1)+" adalah "+C[i][j] +"\t");
            //System.out.println("hasilnya adalah = " + C[i][j] + "\t");
            }
        }
    }
}
