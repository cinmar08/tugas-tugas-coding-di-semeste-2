package uts_psd_cindy_maranatha2;

public class UTS_PSD_CINDY_MARANATHA2 {

    public static void main(String[] args) {
        // Nama:Cindy Maranatha_2161030
        int [][] A = {{3,7},{-2,6}};
        int [][] B = {{2,6},{-5,3}};
        int [][] C =new int [2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
            C[i][j] = A[i][j] * B[i][j];
        
            System.out.println("baris ke "+(i+1)+ " kolom ke "+(j+1)+" adalah "+C[i][j] +"\t");
            //System.out.println("hasilnya adalah = " + C[i][j] + "\t");
            }
        }
        
    }
    
}
