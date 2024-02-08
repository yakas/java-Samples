package Gun07;

import java.util.Scanner;

public class _OzelSoru_5 {
    public static void main(String[] args) {
        //5- girilen bir cümledeki ilk kelimeyi yazdırınız

        Scanner cumleOku=new Scanner(System.in);
        System.out.println("Cümleyi yazınız :");
        String cumle= cumleOku.nextLine();
        int boslukIndex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0,boslukIndex);
        System.out.println("ilk kelime :"+ilkKelime);

    }
}
