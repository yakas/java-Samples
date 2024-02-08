package Gun13;

import java.util.Scanner;

public class _Odev_02 {
    public static void main(String[] args) {
        //2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner sayiOku=new Scanner(System.in);
        int sayac=1,toplam=0;

        while (sayac<=20)
        {
            System.out.print(sayac+" .sayiyi giriniz:");
            int sayi=sayiOku.nextInt();
            if(sayi % 2 !=0)
                toplam++;
            sayac++;
        }
        System.out.println("20 sayıdan tek olanların sayısı = " + toplam);


    }
}
