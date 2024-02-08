package Gun13;
import java.util.Scanner;
public class _Odev_09 {
    public static void main(String[] args) {
        // 9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        Scanner sayiOku = new Scanner(System.in);
        System.out.print("Tersi bulunacak sayıyı giriniz :");
        int sayi = sayiOku.nextInt();
        int terstenSayi=0;
        while (sayi>0)
        {
            terstenSayi=terstenSayi*10;
            terstenSayi=terstenSayi+sayi%10;
            sayi/=10;
        }
        System.out.print("Sayının tersten yazımı :"+terstenSayi);
    }
}
