package Gun07;

import java.util.Scanner;

public class _OzelSoru_3 {
    public static void main(String[] args) {
     //3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)
        Scanner cumleOku=new Scanner(System.in);
        System.out.print("cümleyi giriniz:");
        String cumle=cumleOku.nextLine(); // cümleyi aldık
        String aHarfSayisi=cumle.replaceAll("[^A]","");
        int cumledekiAsayisi=aHarfSayisi.length();
        System.out.println("cumledekiAsayisi = " + cumledekiAsayisi);

    }
}
