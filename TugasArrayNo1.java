
package tugasarrayno1;

public class TugasArrayNo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = {1,2,3,5 ,7,8,4, 9, 6,11};
        int [] b = {6,3,9,10,2,8,18,5,15,1};
        int [] jumlah = new int [10];

        for(int i=0; i<a.length; i++)
            jumlah[i] = a[i]+b[i];
        
        System.out.print("hasil = ");
        for(int i=0; i<a.length; i++)
        System.out.print(+jumlah[i] +", ");
    }
}
