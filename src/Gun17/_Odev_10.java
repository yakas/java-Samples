package Gun17;

import java.util.Arrays;

public class _Odev_10 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int [] dizi = {14,19,5,21};
        Arrays.sort(dizi);
        System.out.println("Dizinin en küçük sayısı: "+dizi[0]);
    }
}
