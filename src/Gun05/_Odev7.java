package Gun05;

import java.util.Scanner;

public class _Odev7 {
    public static void main(String[] args) {
        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //    Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.

        Boolean hesapKontrol;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir banka hesabınız var mı ?");

        hesapKontrol=scan.nextBoolean();
        System.out.println("Banka hesabınız .. " + hesapKontrol);

    }
}
