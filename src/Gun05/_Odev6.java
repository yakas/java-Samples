package Gun05;

import java.util.Scanner;

public class _Odev6 {
    public static void main(String[] args) {
        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız

        String dogumGunu;
        Scanner scan=new Scanner(System.in);
        System.out.print("Dogum gününüzü gün.ay.yıl olarak yazınız:");
        dogumGunu=scan.nextLine();
        System.out.println("dogum gununuz = " + dogumGunu);

    }
}
