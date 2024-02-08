package Gun23;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class _13_12_2022_SETS_2D_ArrayList_Odevlerim_4 {
    public static void main(String[] args) {
        //removing() isminde bir method oluşturun.
        //Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        //Eğer Stringler LinkedHashset 'in içinde varsa, sil.
        //Return tipi linkedhashset
        //Örneğin,
        //linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        //String 1= Germany
        //String 2 = USA
        // **Germany ve USA 'i sil.**
        //Set'i döndür.

        LinkedHashSet<String> linkedHs = new LinkedHashSet<>(Arrays.asList("Germany","France","USA","Canada","Mexico","Brazil"));
        String str1="Germany",str2="USA";
        System.out.println("linkedHs = " + linkedHs);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("----------------------------------------");
        removing(linkedHs,str1,str2);
    }
    public static void removing(LinkedHashSet<String> linkedHs,String str1,String str2){
        linkedHs.remove(str1);
        linkedHs.remove(str2);
        System.out.println("linkedHs = " + linkedHs);

    }
}
