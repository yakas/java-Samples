package Gun07;

import java.util.Scanner;

public class _OzelSoru_1 {
    public static void main(String[] args) {
        //Özel sorular
        //1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Ad giriniz=");
        String Ad=oku.nextLine();
        System.out.print("Soyad giriniz=");
        String SoyAd=oku.nextLine();

        System.out.println("Ad Soyad = " + Ad+" "+SoyAd);
    }
}
