package Gun20;

import java.util.ArrayList;
import java.util.Arrays;

public class _2D_ArraysArrayList_Odevlerim_8 {
    public static void main(String[] args) {
        //İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //   Arraylist'te s1'i s2 olarak değiştirin
        //Return String arrayList
        //Örneğin;
        //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        //s1 = blue
        //s2 = yellow
        //Tüm blue 'ları yellow'a dönüştürün.
        //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
        ArrayList<String> strArrayList = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        String [] s1 ={"blue"} ,s2={"yellow"};

        changelnArrayList(strArrayList,s1,s2);

    }
    public static void changelnArrayList(ArrayList<String> stringArrayList,String [] s1, String [] s2){
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (stringArrayList.get(i)==s1[0])
                stringArrayList.set(i,s2[0]);
            else continue;
        }
        System.out.println(stringArrayList);
    }
}
