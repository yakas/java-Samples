package Gun17;

import java.util.Arrays;

public class _Ornek_13 {
    public static void main(String[] args) {
        //Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.

        String [] dizi = {"$12", "$23", "$10", "$2", "$5", "$2"};
        int toplam=0;
        int [] diziSayi= new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=dizi[i].replace("$","");
        }
        for (int i = 0; i < dizi.length; i++) {
             diziSayi[i]=Integer.parseInt(dizi[i]);
            toplam+=diziSayi[i];
        }
        System.out.println("dizinin sayıları toplamı = " + toplam);
    }
}
