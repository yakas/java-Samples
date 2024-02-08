package Gun17;

public class _Odev_2 {
    public static void main(String[] args) {
        //2
        //Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"_

        String txt ="Hello World";
        for (int i = txt.length()-1; i >= 0; i--) {
            System.out.print(txt.charAt(i));

        }
    }
}
