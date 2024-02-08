package Gun07;

import java.util.Scanner;

public class _OzelSoru_4 {
    public static void main(String[] args) {
        //4- girilen bir kelimenin ilk ve son harfini bulunuz.
        Scanner kelimeOku=new Scanner(System.in);
        System.out.print("Kelimeyi giriniz :");
        String kelime= kelimeOku.nextLine();
        int kelimeUzunlugu=kelime.length();
        char ilkHarf=kelime.charAt(0);
        char sonHarf=kelime.charAt((kelimeUzunlugu-1));
        System.out.println("Kelimenin ilk harfi :"+ilkHarf);
        System.out.println("Kelimenin son harfi :"+sonHarf);

    }
}
