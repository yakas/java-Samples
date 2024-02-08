package Gun07;

import java.util.Scanner;

public class _OzelSoru_8 {
    public static void main(String[] args) {
        //8- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız

        Scanner cumleOku=new Scanner(System.in);
        System.out.print("Cümleyi yaznız :");
        String  text=cumleOku.nextLine(); // cümleyi text değişkenine aktardık..
        String ilkHarf=text.substring(0,1);// ilk kelimenin ilk harfi
        String textBosluk=text.replaceAll("[^ ]"+1,"");
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("text = " + text);
        System.out.println("textBosluk = " + textBosluk);

    }
}
