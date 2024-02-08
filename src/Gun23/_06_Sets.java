package Gun23;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        /*** birleştirme  ***  aynı elemanlardan sadece birini alır.*/
        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);
        System.out.println("birlesikHali = " + birlesikHali);

        /*** farkı  ***/
        HashSet<Integer> farki =new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB); // A dan B yi çıkardı a dizisinde b dizisi ile aynı olanları çıkardı ve kalan a dizisi elemanlarını verdi.
        System.out.println("farki = " + farki);

        /*** ortak elemanlar, kesişim ***/
        HashSet<Integer> ortakElemanlar =new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);
    }
}
