package OcaSoruCevap;

public class C02_ocaSoruTernary {
    public static void main(String[] args) {

       // yandaki kod blogu calistirildiginda output ne olur(konsolda ne yazilir)(OCA SORUSU)




        int x=5;

        System.out.println(x>2 ? x <4 ?   10 : 8 : 7  );

        // int x=5;
        //OCA SORUSU
        //        System.out.println(x>2 ? x<4 ? 10 : 8 : 7  );

        //  bu arada ic ice ternary kullanilmis
        //  ilk soru ? isareti ile en sondaki : bu isaret arasindadir.
        // ilk soru isaretinden sonraki 2.ternary sorusudur
        // java her zaman yukairdan asagiya soldan saga calisir
        // 5>2 ? true olur konsolda 7 calismaz
        // 5<4 ? false  yanlis onerme ? isaretindn sonraki degil digeri calisir
        // konsolda 8 CALISIR








        // verilen bir sayinin tek veya cift oldugunu yazdiran bir kod olusturalim

        int sayi=20;


         if (sayi%2==0){

             System.out.println("sayi cift bir sayidir");

         }else {

             System.out.println("sayi tek bir sayidir");
         }

        System.out.println(sayi%2==0 ? " Sayi Cift" : "Sayi Tek"); // Ternary formulunde yazildi





    }













}
