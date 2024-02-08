package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _Methodlar_Odevlerim_5 {
    public static void main(String[] args) {
        //EvenOddNums isminde bir method oluşturun.
        //Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        //toplam sonucu yazdırın.
        //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
        //For example Örnek:
        //String =  "6678421312"
        //6+6-7+8+4+2-1-3-1+2
        //sonuç 16 olmalı
        Scanner scan = new Scanner(System.in);
        System.out.print("10 haneli bir sayi giriniz: ");
        String sayilar = scan.next();
        
        EvenOddNums(sayilar);
    }
    public static void EvenOddNums(String strSayilar){
        int toplam=0;
       int dizi [] = new int[10]; // 10 haneli olduğunu biliyoruz..
        for (int i = 0; i < strSayilar.length(); i++) {
            dizi[i] = Integer.parseInt(strSayilar.substring(i, i+1));
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0){
                toplam+=dizi[i];
                System.out.print("+"+dizi[i]);
            }
            else {
                toplam-=dizi[i];
                System.out.print("-"+dizi[i]);
            }

        }
        System.out.println(" =" + toplam);
    }

}


