package Gun17;

import java.util.Arrays;

public class _Odev_9 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi = {15,25,22,18,30};
        Arrays.sort(dizi);
        System.out.println("Dizinin en büyük 2. elemanı:"+dizi[dizi.length-2]);
    }
}
