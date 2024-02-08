package Gun05;

import java.util.Scanner;

public class _Odev4 {
    public static void main(String[] args) {
        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        int kapiSayisi;
        Scanner scan=new Scanner(System.in);
        System.out.print("Arabanızdaki kapı sayısını giriniz:");
        kapiSayisi= scan.nextInt();

        System.out.println("Arabanızdaki kapi Sayisi = " + kapiSayisi);

    }
}
