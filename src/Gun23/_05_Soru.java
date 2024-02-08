package Gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // dizi atınız.

        Integer[] dizi = new Integer[10];
        HashSet<Integer> tekDizi=new HashSet<>();

        for (int i=0 ; i<10 ; i++){
            dizi[i]=(int)(Math.random()*10+1);
        }
        System.out.println("dizi = " + Arrays.toString(dizi));

        for (int i = 0; i < dizi.length; i++) {
            tekDizi.add(dizi[i]);

        }
        System.out.println("tekDizi = " + tekDizi);
        
        //2.yöntem  tek kalemde HashSet yazdırma işlemi
        HashSet<Integer> hs2=new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs2 = " + hs2);
        System.out.println("hs2.size() = " + hs2.size());


        //3. yöntem
        HashSet<Integer>hs3 =new HashSet<>();
        Collections.addAll(hs3,dizi);
        System.out.println("hs3 = " + hs3);


    }
}
