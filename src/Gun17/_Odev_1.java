package Gun17;

public class _Odev_1 {
    public static void main(String[] args) {
        //1
        //Bu String'i oluşturun. "Removes white space from both ends of a string"//
        //String'deki kelime sayısını yazdırınız.
        String cumle ="Removes white space from both ends of a string";
        int kelimeSayisi=0;
        String [] kelimeler=cumle.split(" ");
        for (int i = 0; i < kelimeler.length; i++) {
            if(kelimeler[i].length()>1){
                kelimeSayisi++;
            }
        }
        System.out.println("Cümledeki kelime sayısı:"+kelimeSayisi);
    }
}
