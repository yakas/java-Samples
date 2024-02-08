package Gun23;

import java.util.Arrays;
import java.util.HashSet;

public class _13_12_2022_SETS_2D_ArrayList_Odevlerim_2 {
    public static void main(String[] args) {
        //changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String
        //return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //**ÖRNEK:**
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //String 1 = **banana**
        //String 2 = **peach**
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> hs = new HashSet<>(Arrays.asList("banana", "strawberry", "kiwi", "pineapple"));
        String[] strDizi1 = {"banana"};
        String[] strDizi2 = {"peach"};
        System.out.println("strDizi1 = " + Arrays.toString(strDizi1));
        System.out.println("strDizi2 = " + Arrays.toString(strDizi2));
        System.out.println("İlk Hali = " + hs);
        changeSet(hs, strDizi1, strDizi2);


    }
    public static void changeSet(HashSet<String > hs,String [] strDizi1,String [] strDizi2){
        hs.remove(strDizi1[0]);
        hs.add(strDizi2[0]);
        System.out.println("Son Hali = " + hs);


    }

}

