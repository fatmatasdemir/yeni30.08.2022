package GenelTekrar;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Y/N ikilisinden biriini giriniz : ");
        char karakter=scan.next().charAt(0);
        if(karakter=='Y'|| karakter =='y') {
            System.out.println("YES");


        }else if (karakter=='N'|| karakter=='n'){
            System.out.println("NO");

        }else System.out.println("yanlis giris yaptiniz lutfen sadece Y/N ikilisinden birini tercih ediniz");







    }









}
