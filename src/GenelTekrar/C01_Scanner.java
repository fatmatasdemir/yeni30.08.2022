package GenelTekrar;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz :");
        String isim =scan.nextLine();


        System.out.println("memleketiniz :");
        String memleket = scan.nextLine();

        System.out.println("konumunuz :");
        String konum = scan.nextLine();

        System.out.println("yasiniz :");
        int yas = scan.nextInt();

        System.out.println("boyunuz :");
        double boy = scan.nextDouble();

        System.out.println("yasadiginiz " + konum+ "  u  seviyor musunuz ? true/ false");
        boolean seviyorMu= scan.nextBoolean();


        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);





    }



}
