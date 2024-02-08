package Gun13;
import java.util.Scanner;
public class _Odev_06 {
    public static void main(String[] args) {
        //6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //   Eğer bilirse tebrikler yazsın.

        Scanner sayiOku = new Scanner(System.in);
        int rndSayi=(int)(Math.random()*10+10);
        int hakSayisi=3;
        while (hakSayisi>=1)
        {
            System.out.print("Tahmininiz Nedir? :");
            int tahmin=sayiOku.nextInt();
            if (tahmin==rndSayi) {
                System.out.println("Tebrikler..");
                break;
            }
            hakSayisi--;
            }
        System.out.println("Bilemediniz !");
        System.out.println("Tutulan random sayı :"+rndSayi+" idi");
        }
    }
