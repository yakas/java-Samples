package Gun13;

import java.util.Scanner;

public class _Odev_01 {
    public static void main(String[] args) {
        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner sayiOku=new Scanner(System.in);
        int sayac=1,toplam=0;

        while (sayac<=20)
        {
            System.out.print(sayac+" .sayiyi giriniz:");
            int sayi=sayiOku.nextInt();
            if(sayi % 2 !=0)
                toplam+=sayi;
                sayac++;
        }
        System.out.println("20 sayıdan tek olanların toplamı = " + toplam);

    }
}
