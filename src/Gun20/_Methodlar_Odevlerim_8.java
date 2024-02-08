package Gun20;

import java.util.ArrayList;
import java.util.Arrays;

public class _Methodlar_Odevlerim_8 {
    public static void main(String[] args) {
        //`append adında bir method oluşturun.`
        //`Parametre olarak iki int array  oluşturun.`
        // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //Bunu döndürmelidir:
        // {2, 4, 6, 1, 2, 3, 4, 5}.

        int[] diziFirst = {2, 4, 6};
        int[] diziSecond = {1, 2, 3, 4, 5};

        append(diziFirst, diziSecond);

    }

    public static  void append  (int []diziFirst, int[] diziSecond) {
        ArrayList<Integer> yeniDizi = new ArrayList<>();
        for (int i = 0; i < diziFirst.length; i++) {
            yeniDizi.add(diziFirst[i]);
        }
        for (int i = 0; i < diziSecond.length; i++) {
            yeniDizi.add(diziSecond[i]);
        }
        System.out.println(yeniDizi);


    }

}

