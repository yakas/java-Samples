package Gun23;

import java.util.Arrays;
import java.util.HashSet;

public class _13_12_2022_SETS_2D_ArrayList_Odevlerim_1 {
    public static void main(String[] args) {
        //Create a method totalCount()
        //totalCount() isminde bir method oluşturun.
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın.
        //totalCount'u döndürün.
        //_**Örnek:**_
        //hashset ; 4,2,3,1,7
        //cevap: 5

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(4,2,3,1,7));
        totalCount(hs);
    }
    public static void totalCount(HashSet<Integer> hs){
        System.out.println("hs = " + hs);
        System.out.println("totalCount= " + hs.size());

    }
}
