package Gun05;

import java.util.Scanner;

public class _Odev5 {
    public static void main(String[] args) {
        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.

        String sehir;
        Scanner scan = new Scanner(System.in);
        System.out.print("10 sene önce yaşadığınız yeri giriniz:");
        sehir=scan.nextLine();
        System.out.println("10 sene önce yaşadığınız sehir = " + sehir);

    }
}
