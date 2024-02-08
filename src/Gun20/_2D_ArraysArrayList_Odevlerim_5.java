package Gun20;

import java.util.ArrayList;
import java.util.Arrays;

public class _2D_ArraysArrayList_Odevlerim_5 {
    public static void main(String[] args) {
        //ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> diziArrayList = new ArrayList<>(Arrays.asList("Orange","Kiwi","Peach","Banana","Orange"));
        /*diziArrayList.add("Orange");
        diziArrayList.add("Kiwi");
        diziArrayList.add("Peach");
        diziArrayList.add("Banana");
        diziArrayList.add("Orange");*/

        String[] diziString = {"Orange"};

        int count = getCount(diziArrayList, diziString);
        System.out.println(count);

    }
    public static int getCount(ArrayList<String> diziArrayList, String[] diziString) {
        int count = 0;
        for (int i = 0; i < diziArrayList.size(); i++) {
            for (int j = 0; j < diziString.length; j++) {
                if (diziArrayList.get(i) == diziString[j])
                    count++;
                else
                    continue;
            }
        }
        System.out.println(Arrays.toString(diziString));
        return count;
    }
}
