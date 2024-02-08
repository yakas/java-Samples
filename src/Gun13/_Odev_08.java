package Gun13;
import java.util.Scanner;
public class _Odev_08 {
    public static void main(String[] args) {

        //8- Girilen bir sayının kaç basamak olduğunu bulunuz.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("Basamak sayısı bulunacak sayıyı giriniz :");
        int sayi=sayiOku.nextInt();
        int basamakSayac=0;
        while (sayi>0)
        {
            sayi=sayi/10;
            basamakSayac++;
        }
        System.out.println("Girilen sayının basamak sayısı :"+basamakSayac);
    }
}
