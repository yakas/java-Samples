package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _13_12_2022_SETS_2D_ArrayList_Odevlerim_Ozel_Soru {
    public static void main(String[] args) {
        //Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
        //random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
        //sayılarla doldurunuz. Set i main de yazdırınız.

        HashSet<Integer> hs = new HashSet<>();
        hsDoldurma(hs);
        System.out.println("hs = " + hs);

    }
    public static HashSet<Integer> hsDoldurma(HashSet<Integer> hs){
        ArrayList<Integer> rndDizi=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            hs.add((int)(Math.random()*21));
        }
        return hs;
    }
}
