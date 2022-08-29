package OcaSoruCevap;

public class C03_Switch {
    public static void main(String[] args) {

        // oca sorusu: yandaki kod blogunun sonucu ne olur

     final char a ='A' , d='D'; // FINAL KEYWORD VARIABLE SON DEGERINI BELIRLER

        char grade='B';

        switch (grade){

            case a :
            case 'B' : System.out.println("great");
            case 'C': System.out.println("good"); break;
            case d :
            case'F': System.out.println("not good");


       // Switch Case de baslangicdan taki break kadar yazilari konsola verir
                // Case 'B'  konsolda " great" yazdirir ve devami olarak da CASE 'C' deki "good" yazdirir
                // great  good

        }










    }









}
