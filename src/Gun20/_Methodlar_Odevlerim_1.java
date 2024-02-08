
package Gun20;

public class _Methodlar_Odevlerim_1 {
    public static void main(String[] args) {

        //Ismi **randomNum** olan bir method oluşturun.//
        //Parametre olarak **int max** almalı.//
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.//
        //Random numarayı döndürünüz.

        System.out.println("randomNum(100) = " + randomNum(100));

    }

    public static int randomNum(int Max) {
        return (int) (Math.random() * Max);
    }

}