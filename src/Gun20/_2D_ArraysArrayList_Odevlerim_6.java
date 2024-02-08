package Gun20;

import java.util.ArrayList;
import java.util.Arrays;

public class _2D_ArraysArrayList_Odevlerim_6 {
    public static void main(String[] args) {
         //getSum() isminde bir method oluşturun.
        //Parametresi ArrayList olmalı
        //Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün.
        //Örneğin;
        //Arraylist = 1,2,3,4,5
        //return 15 olmalı
        ArrayList<Integer> dizi = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int toplam=getSum(dizi);
        System.out.println("toplam :"+toplam);

    }
    public static int getSum(ArrayList<Integer> dizi){
        int toplam=0;
        for (int i = 0; i < dizi.size(); i++) {
            toplam+= dizi.get(i);
        }
        return toplam;
    }
}
