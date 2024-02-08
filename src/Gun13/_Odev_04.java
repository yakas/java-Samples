package Gun13;

import java.util.Scanner;

public class _Odev_04 {
    public static void main(String[] args) {
        //4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner sayiOku=new Scanner(System.in);
        int sayac=1,toplam=0;

        while (sayac<=20)
        {
            System.out.print(sayac+" .sayiyi giriniz:");
            int sayi=sayiOku.nextInt();
            if(sayi >=10 && sayi<=30)
                toplam+=sayi;
            sayac++;
        }
        System.out.println("10 ile 30 arasındaki sayıların toplamı = " + toplam);
    }
}
