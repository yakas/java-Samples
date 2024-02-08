package Gun20;
import java.util.Scanner;
public class _Methodlar_Odevlerim_2 {
    public static void main(String[] args) {

        //"OrtaKelime" isminden bir method oluşturun.//
        //Bu method String'i parametre olarak almalı.//
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.//
        //Ortadaki kelimeyi return yapınız.//
        //Örnek: Ben Java'yı seviyorum.//
        //print : Java'yı//
        //Örnek2://
        //Java'yı kolayca öğreniyorum.//
        //print: kolayca
        Scanner oku = new Scanner(System.in);
        System.out.print("Cümleyi giriniz :");
        String  cumle = oku.nextLine();
        String kelimeler [] = cumle.split(" ");

        OrtaKelime(kelimeler);
    }
    public static String OrtaKelime(String [] kelimeler){
     int ortadaBulunanKelime= (kelimeler.length/2);// ortada bulunan kelimeyi bulur.
        if (ortadaBulunanKelime%2==0){ // cümledeki kelime sayısı çift ise
            System.out.println("Ortadaki kelimeler = " + kelimeler[ortadaBulunanKelime-1]+" "+kelimeler[ortadaBulunanKelime]);
            return kelimeler[ortadaBulunanKelime];
        }
        else { // cümledeki kelime sayısı tek ise
            System.out.println("Ortadaki kelime = " + kelimeler[ortadaBulunanKelime]);
            return kelimeler[ortadaBulunanKelime];
        }
   }
}




