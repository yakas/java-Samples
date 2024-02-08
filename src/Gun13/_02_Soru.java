package Gun13;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir email in uygun formatta olup olmadığını belirten bir program yaziniz

    /*

    Girilen email için uygunluk koşullari:

    1- Email ".com" ile bitmeli +
    2- Email "@" işareti bulundurmalı
    3- "@" işareti ".com" dan önce olmalı
    4- "@" işareti öncesinde en az 1 karakter olmalı
    5- "@" ile ".com" arasinda en az 1 karakter olmalı

     */
        Scanner scan = new Scanner(System.in);
        System.out.print("e-mail adresini giriniz:");
        String email=scan.nextLine();

        Boolean sonu=email.endsWith(".com");
        Boolean atKontrol=email.contains("@");
        int atIndex=email.indexOf("@");
        int noktaIndex=email.indexOf(".");

        Boolean baslangicKontrol=!email.startsWith("@");
        String atIleNoktaKontrol=email.substring(atIndex,noktaIndex);

        if (sonu && atKontrol && atIndex<noktaIndex && baslangicKontrol && atIleNoktaKontrol.length()>0)
        {
            System.out.println("girilen e-mail kurallara uygundur: "+email);
        }
        else
        System.out.println("girilen e-mail kurallara uygun değildir");



    }
}
