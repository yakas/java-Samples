package Gun07;

import java.util.Scanner;

public class _OzelSoru_6 {
    public static void main(String[] args) {
        //6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız
        Scanner cumleOku=new Scanner(System.in);
        System.out.print("Cümleyi giriniz :");
        String text=cumleOku.nextLine();
        int boslukIndex1=text.indexOf(" ");
        String ilkKelime=text.substring(0,boslukIndex1);
        int ilkKelimeUzunlugu=ilkKelime.length();
        String yeniText=text.substring(ilkKelimeUzunlugu+1);
        int boslukIndex2=yeniText.indexOf(" ");
        String ikinciKelime=yeniText.substring(0,boslukIndex2);
        System.out.println("İlk Kelime = "+ilkKelime);
        System.out.println("ikinci Kelime = " + ikinciKelime);
    }
}
