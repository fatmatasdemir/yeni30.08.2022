package GenelTekrar;

import java.util.Scanner;

public class C09_vizeNot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */




        int vize1;
        int vize2;
        int finalNot;

        System.out.println("birinci vize :");
        vize1=scan.nextInt();

        System.out.println("ikinci vize :");
        vize2= scan.nextInt();

        System.out.println("final notu :");
        finalNot=scan.nextInt();


        double sonuc=((vize1+vize2/2)*0.3 +finalNot);
        System.out.println("sonuc =" + sonuc);




    }







}
