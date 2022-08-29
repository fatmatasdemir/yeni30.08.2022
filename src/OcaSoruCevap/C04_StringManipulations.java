package OcaSoruCevap;

public class C04_StringManipulations {
    public static void main(String[] args) {
        //yandaki kod blogunda 10.satira asagidaki seceneklerden hangisi eklenirse konsolda"Equal"yazdirir

        String str1 = "Java";
        String str2 = new String("java");

        // 10.Satir
        if (str2.equals(str1.toLowerCase()))  // bu   B sikki 10 satira gelmesi gerekendir

            {
                System.out.println("Equal");
            }else{
                System.out.println("Not Equal");


            }

        }









}




//  A) str1.toLowerCase();  // str1 atama olmadigi icin burada str1 kalici olarak deismez
//  if(str1==str2) // Stringde == kullanmamayi tercih ederiz == //Stringde bunun yerine equals
//  ()methodu kullaníriz // str1 Java  str2 java  esit degiller



// B) if(str2.equals(str1.toLowerCase()))// 2.PARANTEZ ICINDEKI CALISIR VE  STR1 java olur
// .ondeki str2 zaten kucuk

// C) str1.toLoweCase(); deger atamasi olmadigindan kalici olrak degistirlemez
// if(str1.equals(str1.toLowerCase())) //  2.PARANTEZ ONCE CALISIR  str1 java olur .
// ondeki str1 Java dir karsilastirildiginda False olur if body calismaz konsolda Not Equals yazar


// D) if(str1.toLowerCase() == str2.toLOwerCase())

// str1 java olur sonra str2 de java olur ama aradaki ==
// == referansa bakar ve farkli oldugu icin false yazar
// icerik ayni ama referans farkli