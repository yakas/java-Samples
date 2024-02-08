package Gun05;

import java.util.Scanner;

public class _Odev3 {
    public static void main(String[] args) {
        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.

        String meyveAdi;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sevdiğiniz bir meyve adı giriniz:");
        meyveAdi=scan.next();
        System.out.println("Sevdiğiniz meyvenin adi = " + meyveAdi);

    }
}
