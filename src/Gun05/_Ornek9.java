package Gun05;

import java.util.Scanner;

public class _Ornek9 {
    public static void main(String[] args) {
        //9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.

        Float boy;
        Scanner scan=new Scanner(System.in);

        System.out.print("Boyunuzu giriniz:");
        boy=scan.nextFloat();
        System.out.println("Girmiş olduğunuz boyunuz = " + boy);

    }
}
