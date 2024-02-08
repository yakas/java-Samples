package Gun20;

import java.util.Scanner;

public class _Methodlar_Odevlerim_7 {
    public static void main(String[] args) {
        //powerOfThree isminde bir method oluşturun.//
        //Parametre olarak int//
        //Return tipi boolean//
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.//
        //**Örnek 1:**
        //**Girdi:** 27
        //**Çıktı:** true
        //Açıklama: 3*3*3 =27
        //Sonuç= true
        Scanner scan = new Scanner(System.in);
        System.out.print("Tamsayı giriniz :");
        int sayi = scan.nextInt();

        powerOfThree(sayi);

    }
    public static boolean powerOfThree(int sayi){
        boolean sonuc;
        if (sayi%3==0) {

            sonuc = true;
            System.out.println(true);
        }
            else {
            sonuc = false;
            System.out.println(false);
        }
            return sonuc;
    }

}
