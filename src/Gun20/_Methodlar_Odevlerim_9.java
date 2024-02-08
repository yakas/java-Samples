package Gun20;

import java.util.Arrays;

public class _Methodlar_Odevlerim_9 {
    public static void main(String[] args) {
        //**isUnique** adında bir method oluşturun
        //Parametre olarak int array alır.
        // ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
        //örneğin, list isminde bir array'imiz varsa,
        //int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        //Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
        //int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        //Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

        int[] listFirst = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4, 4};
        int[] listSecond = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};

        isUnique(listFirst);
        boolean sonuc1 = isUnique(listFirst);
        System.out.println("listFirst = " + Arrays.toString(listFirst));
        System.out.println("sonuc1 = " + sonuc1);

        isUnique(listSecond);
        boolean sonuc2 = isUnique(listSecond);
        System.out.println("listSecond = " + Arrays.toString(listSecond));
        System.out.println("sonuc2 = " + sonuc2);

    }

    public static boolean isUnique(int[] dizi) {
        boolean kontrol = false;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    kontrol = false;
                    break;
                } else {
                    kontrol = true;
                }
            }
        }
        return kontrol;
    }


}
