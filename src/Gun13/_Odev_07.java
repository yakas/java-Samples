package Gun13;
import java.util.Scanner;
public class _Odev_07 {
    public static void main(String[] args) {
        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner sayiOku = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz:");
        int sayi=sayiOku.nextInt();
        int birler=(sayi%100)%10;
        int onlar=(sayi%100)/10;
        int yuzler=sayi/100;
        System.out.println("Sayının birler basamağı :"+birler);
        System.out.println("Sayının onlar basamağı  :"+onlar);
        System.out.println("Sayının yüzler basamağı :"+yuzler);
    }
}
