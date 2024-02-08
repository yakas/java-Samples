package Gun20;

import java.util.ArrayList;
import java.util.Arrays;

public class _2D_ArraysArrayList_Odevlerim_7 {
    public static void main(String[] args) {
        //getLength() isminde bir method oluşturun.
        //Parametre olarak String ArrayList
        //Return tipi Integer ArrayList
        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //Tüm elementlerin uzunluğunu döndürün
        //Örneğin;
        //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //Tüm Stringlerin uzunluklarını yazdırın;
        //cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> dizi = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));

        getLength(dizi);

    }
    public static  void getLength(ArrayList<String> dizi){
        ArrayList<Integer> diziUzunluk=new ArrayList<>();

        for (int i = 0; i < dizi.size(); i++) {
            diziUzunluk.add(dizi.get(i).length());

        }
        for (int i = 0; i < dizi.size(); i++) {
            System.out.print(dizi.get(i)+" = "+diziUzunluk.get(i));
            System.out.println();

        }

    }
}
