package ArrayTekrar21day;

import java.util.Arrays;

public class C08 {


    public static void main(String[] args) {

        String [] harfler={"Y" , "B" , "D" , "G" ,"O", "A"};

        String arananHarf="D";

        System.out.println( Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03.contains(harfler,arananHarf));

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03.contains(harfler,arananHarf));


    }
















}
