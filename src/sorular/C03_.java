package sorular;

public class C03_ {

    /*
       kullanıcının girdigi bir array'in en buyuk elemani ile
       en kucuk elemanının  farkını bulan bir method create ediniz.
       */
    public static void main(String[] args) {
        int[] arr = {19,2,3,4,5,16,7,48,29,10,11,12,14,25,16,17,18};

        int enKucuk = arr[0];
        int enBuyuk = arr[1];

        for (int i = 0; i <arr.length ; i++) {
            if(enKucuk>arr[i]){
                enKucuk=arr[i];

            }
            if(enBuyuk<arr[i]){
                enBuyuk=arr[i];

            }
        }
        System.out.println("enKucuk = " + enKucuk);
        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enBuyuk-enKucuk = " + (enBuyuk-enKucuk));

    }












}
