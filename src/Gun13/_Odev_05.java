package Gun13;
import java.util.Scanner;
public class _Odev_05 {
    public static void main(String[] args) {
        //5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        int sayac=1,birlerBasamagiBesSayac=0,birler=0;
        while (sayac<=100)
        {
            if (sayac==5 )
                birlerBasamagiBesSayac++;
                else if (sayac>10)
                    birler=sayac %10;
                        if (birler==5)
                            birlerBasamagiBesSayac++;
        sayac++;
        }
        System.out.println("100 sayıdan birler basamağı 5 olanların sayısı = " + birlerBasamagiBesSayac++);
        }
    }

