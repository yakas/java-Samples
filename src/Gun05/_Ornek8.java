package Gun05;

import java.util.Scanner;

public class _Ornek8 {
    public static void main(String[] args) {
        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.

        Byte agirlik;
        Scanner scan= new Scanner(System.in);
        System.out.print("Kilogram cinsinden bir ağırlık yazınız:");
        agirlik=scan.nextByte();
        System.out.println("Girmiş olduğunuz agirlik = " + agirlik);


    }
}
