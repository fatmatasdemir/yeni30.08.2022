package ArrayTekrar21day;

public class C02 {

    public static void main(String[] args) {

        String[]  isimler={"Fatma", "Ayse", "hayrunisa","Orhan", "Ahu"};


        enUzunVeKisaYazdir(isimler);

    }

    private static void enUzunVeKisaYazdir(String[] isimler) {
        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];


        for (int i = 1; i <isimler.length ; i++) {

            if (isimler[i].length()>enUzunKelime.length()){

                enUzunKelime=isimler[i];

            }
            if (isimler[i].length()<enKisaKelime.length()){

                enKisaKelime=isimler[i];

            }




        }


        System.out.println("Arraydeki en uzun kelime :" + enUzunKelime);
        System.out.println("Arraydeki en kisa kelime :" + enKisaKelime);
    }
}











