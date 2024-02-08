package Gun17;

import java.util.Arrays;

public class _Odev_11 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.
        int [] dizi = {12,2,5,15,8};
        Arrays.sort(dizi);
        System.out.println("Dizinin en büyük elemanı: "+dizi[dizi.length-1]);
    }
}
