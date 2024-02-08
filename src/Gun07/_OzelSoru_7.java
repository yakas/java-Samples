package Gun07;

import java.util.Scanner;

public class _OzelSoru_7{
    public static void main(String[] args) {
        //7- Girilen bir cümlede kaç kelime olduğunuz bulunuz

        Scanner cumleOku=new Scanner(System.in);
        System.out.print("Cümleyi yaznız :");
        String  text=cumleOku.nextLine(); // cümleyi text değişkenine aktardık..
        String bosluklar = text.replaceAll("[^ ]","");
        int boslukSayisi=bosluklar.length();
        ++boslukSayisi;
        System.out.println("cümledeki kelime sayisi = " + boslukSayisi);

    }
}
