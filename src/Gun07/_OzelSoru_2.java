package Gun07;

import java.util.Scanner;

public class _OzelSoru_2 {
    public static void main(String[] args) {
        //2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız
        Scanner okuKelime=new Scanner(System.in);
        System.out.print("Kelime Giriniz =");
        String kelime=okuKelime.nextLine();
        System.out.println("kelime.isEmpty() = " + kelime.isEmpty());
    }
}
