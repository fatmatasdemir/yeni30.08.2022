package replit_sorular;

import java.util.ArrayList;
import java.util.List;

public class soru_cevaplist5 {
/*
    program that accepts an integer as input and prints first
        10 prime numbers greater than input Check numbers if they are even or not in a return method.
        (Girdi olarak bir tamsayı kabul eden ve girdiden büyük ilk 10 asal sayıyı
         yazdıran program Bir dönüş yönteminde sayıların çift olup olmadığını kontrol edin.)
            Input : 5
    Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]

*/


    public static void main(String[] args) {

        int input=5;
        List<Integer> list = new ArrayList<>();
        for (int i = input+1; i <Integer.MAX_VALUE; i++) {
            if(i%5!=0 && i%3!=0 && i%2!=0 ){
                list.add(i);
                if(list.size()==10){
                    break;
                }
            }
        }
        System.out.println(list);







    }








}
