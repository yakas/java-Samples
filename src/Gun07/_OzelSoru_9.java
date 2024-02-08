package Gun07;

import java.util.Scanner;

public class _OzelSoru_9 {
    public static void main(String[] args) {
        //9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        Scanner adOku=new Scanner(System.in);
        System.out.print("Adınızı giriniz =");
        String ad=adOku.nextLine();// adı aldık
        String ilkAd=ad.substring(0,ad.indexOf(" "));
        String ortaAd=ad.substring(ad.indexOf(" ")+1,ad.lastIndexOf(" "));
        int soyAdBoslukIndex=ad.lastIndexOf(" ")+1;
        String soyAd=ad.substring(soyAdBoslukIndex);

        String cikti=(ilkAd.charAt(0))+"."+ortaAd.charAt(0)+"."+soyAd.charAt(0);
        System.out.println("Ad Soyad ="+cikti.toUpperCase());

    }
}
