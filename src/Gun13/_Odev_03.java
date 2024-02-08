package Gun13;

import java.util.Scanner;

public class _Odev_03 {
    public static void main(String[] args) {
        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner sayiOku=new Scanner(System.in);
        int sayac=1,toplam=0;
        System.out.print("Toplamı bulunacak sayiyi giriniz:");
        int sayi=sayiOku.nextInt();
        int girilenSayi=sayi;
        do
        {

            toplam+=sayi;
            sayi--;

        }while(sayi>0);
        System.out.println(girilenSayi+"'e kadar olan sayıların toplamı= " + toplam);
    }
}
