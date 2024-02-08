package Gun19;

import java.util.Arrays;

public class _ozelSoru {
    public static void main(String[] args) {
        //Özel Soru. Çözemezsen Karalar bağlayıp dolaşma
        //sadece kendini biraz zorlaman için.Sakın üzülme
        //
        //TODO: Bizim 3 tane saatimiz vardır.
        //bir tanesi tam doğru çalışıyor,
        //bir tanesi her saatte 20 dk geri kalıyor.
        //bir tanesi her saate 15 dk ileri gidiyor.
        //Bu 3 saate saat 16 da çalışmaya başlıyorlar.
        //
        //Bu saatler kaç saat ve dakika sonra tekrar
        //aynı saati gösterirler aynı anda.

        int saat1=0,saat2=0,saat3=0;  // saat1 normal , saat2 20dk geri  ,  saat3 ise 15 dk ileri
        int sayac=1;
        boolean kontrol=true;

       while (kontrol)
       {
           for (int i = 1; kontrol; i++) {
               sayac++;
               saat1+=i;
               saat2-=20;
               saat3+=15;
               if(saat1==saat2 && saat1==saat3)
                   kontrol=false;
                   break;

           }


        }
        System.out.println("saat1 = " + saat1);
        System.out.println("saat2 = " + saat2);
        System.out.println("saat3 = " + saat3);
        System.out.println("sayac = " + sayac);

    }

}

