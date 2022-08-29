package replitAbdurrrahimHoca;

import java.util.Arrays;

public class C07 {
    /* Create a custom return type method accepts a name as parameter and prints the name as a char array.
            (do not use toCharArray() method)
            Input : John
            Output :[J, o, h, n]
            */

    public static void main(String[] args) {


    String name = "HAKAN";
    arrMethod(name);
        System.out.println("Input :" + name + "\nOutput :" + Arrays.toString(arrMethod(name)));
}
    public static String[] arrMethod(String name) {
        String[] arr= name.split("");
        return arr;
    }



}













